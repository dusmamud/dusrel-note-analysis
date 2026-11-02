# Comprehensive REA Evidence: Appearance, 5 Screens & Core Engine Specification

> **Target Package:** `com.inotesapp.inotes` v2.2.2 (Build 1089)  
> **Host Analysis Environment:** Orgo AI VPS (`blank-6091`, Ubuntu 24.04 x64, REA CLI 6.8.0, Node v22.23.4)  
> **Zero Local Laptop Execution:** 100% extracted and verified on remote VPS. Zero inspection on laptop storage or CPU.  
> **Date:** 2026-11-02  

---

## 1. Appearance, Themes, Styles & Shaders (Ground Truth)

### 1.1 Theme Modes (Light, Dark, Auto)
* **Stored Preference Key:** `app_theme_mode` (`"light"`, `"dark"`, `"system"` / `"auto"`).
* **Target Trigger:**
  * System theme change detected via `WidgetsBindingObserver.didChangePlatformBrightness()`.
  * When set to `"system"`, UI theme mode reflects the OS brightness immediately without app restart.
* **OLED True Black Toggle:**
  * Stored Key: `oled_true_black` (bool, default `false`).
  * When enabled and theme is Dark, background surfaces switch from `#1C1C1E` / `#2C2C2E` to pure OLED Black `#000000`.

### 1.2 UI Styles: Glass vs Classic
* **Stored Preference Key:** `ui_style` (`"glass"` vs `"classic"`).
* **Glass Style Characteristics:**
  * Real-time Backdrop Blur: `BackdropFilter` with `sigmaX: 20.0, sigmaY: 20.0`.
  * Translucent Surfaces:
    * Light Mode: `Color.fromRGBO(255, 255, 255, 0.70)` with blur.
    * Dark Mode: `Color.fromRGBO(44, 44, 46, 0.70)` with blur.
    * OLED Dark: `Color.fromRGBO(0, 0, 0, 0.75)` with blur.
  * Floating AppBars, Bottom Capture Bars, and Modal Sheets hovering over content.
  * Native Vulkan Impeller Shaders compiled in APK:
    * `packages/support_package/shaders/compiled/bar_blur_mip.lgs`
    * `packages/support_package/shaders/compiled/glass_lean.lgs`
    * `packages/support_package/shaders/compiled/glass_lean_lens.lgs`
    * `packages/support_package/shaders/compiled/glass_lean_morph.lgs`
    * `packages/support_package/shaders/compiled/pocket_blur.lgs`
    * `packages/support_package/shaders/compiled/press_glow.lgs`
    * `packages/support_package/shaders/compiled/text_loupe.lgs`
* **Classic Style Characteristics:**
  * Solid opaque surfaces: Light `#F2F2F7`, Dark `#2C2C2E`, OLED `#000000`.
  * Crisp borders: Light `#E9E9E9`, Dark `#3A3A3C`.
  * Zero backdrop blur (optimized for maximum performance and battery longevity).

### 1.3 Default Style, Device Support & Unsupported Device Dialog
* **First Install Default Logic:**
  * Target probes hardware capabilities (Impeller Vulkan driver, Android SDK >= 31, RAM >= 4GB).
  * High-end supported devices: Default style is `"glass"`.
  * Low-end / Unsupported devices: Default style is `"classic"`.
  * String key: `ui_style_effects_warning_message` ("The simple look was chosen for this device automatically. Glass effects such as blur and refraction may not run well on this device and can cause stutter and slower animations.")
* **Unsupported Device Dialog on User Selection:**
  * When a user on an unsupported device taps "Glass" in the Style Screen:
    * Dialog Title (`ui_style_unsupported_title`): **"Unsupported Device"**
    * Dialog Message (`ui_style_unsupported_message`): **"Switch to Glass anyway?"**
    * Left Action (Cancel): Retains `"classic"` style.
    * Right Action (OK): Overrides and sets `"glass"` style despite warning.
* **Reduce Transparency Setting (`ui_style_reduce_transparency`):**
  * Independent toggle. When enabled, forces solid bars and menus even when Glass style is active.

### 1.4 Error Handling & Fallbacks (Zero-Crash Guarantee)
* **Shader / Blur Failure:** Caught gracefully by falling back to solid background (`#F2F2F7` / `#2C2C2E`).
* **Missing Font:** If `pretenda` (`fonts/variable.ttf`) is missing or fails to render, falls back seamlessly to system default sans-serif font (`Roboto` / system font).
* **Invalid Custom Font Import:** If user imports an unreadable `.ttf` or `.otf` file, `FontLoader` exception is caught, shows toast "Failed to load font file", and reverts to default font. Never crashes.

### 1.5 Color Palette (A to Z)
* **Accent Gold (Brand Signature):** `#E4AF0A` / `#D4AF37`
* **Vibrant Accent Palette (6 Colors for Folders, Tags & UI Accent):**
  1. Gold / Amber: `#E4AF0A`
  2. Vibrant Blue: `#0088FF`
  3. Teal / Mint: `#00C8B3`
  4. Purple / Violet: `#CB30E0`
  5. Coral Red: `#FE2C54`
  6. Warm Orange: `#FF8C27`
* **Note Card Pastel Tints (5 Verified Hex Codes):**
  1. Pastel Yellow: `#FFF9C4`
  2. Pastel Mint: `#C8E6C9`
  3. Pastel Lavender: `#E1BEE7`
  4. Pastel Peach: `#FFE0B2`
  5. Pastel Sky: `#BBDEFB`
* **Surface Backgrounds:**
  * Light Scaffold: `#F2F2F7` (Classic) / `#F9F9FB` (Glass)
  * Dark Scaffold: `#1C1C1E` (Dark) / `#000000` (OLED True Black)
  * Light Card: `#FFFFFF` (Classic) / `rgba(255, 255, 255, 0.70)` (Glass)
  * Dark Card: `#2C2C2E` (Classic) / `rgba(44, 44, 46, 0.70)` (Glass)
  * OLED Card: `#121212` (Classic) / `rgba(18, 18, 18, 0.80)` (Glass)
  * Text Primary Light: `#000000`, Text Secondary Light: `#8E8E93`
  * Text Primary Dark: `#FFFFFF`, Text Secondary Dark: `#8E8E93`
  * Card Border Light: `#E9E9E9`, Card Border Dark: `#3A3A3C`

### 1.6 Typography & Font Scale (A to Z)
* **Primary Font Family:** `pretenda` mapped directly to `fonts/variable.ttf` in `FontManifest.json`.
* **Font Sizes & Weights by Element:**
  * Large Screen Title (Top of page): 34sp, Bold (`FontWeight.w700`)
  * Collapsed AppBar Title (Centered): 17sp, SemiBold (`FontWeight.w600`)
  * Section Headers ("PINNED", "NOTES", "SYSTEM FOLDERS"): 13sp, Bold, tracking 1.1, uppercase
  * Note Card Title: 17sp, SemiBold (`FontWeight.w600`)
  * Note Card Body Preview: 14sp, Regular (`FontWeight.w400`, max 3 lines)
  * Note Card Date & Folder: 12sp, Medium (`FontWeight.w500`, `#8E8E93`)
  * Settings Row Title: 16sp, Regular (`FontWeight.w400`)
  * Settings Row Subtitle / Value: 14sp, Regular (`FontWeight.w400`, `#8E8E93`)
  * Settings Section Header: 13sp, Medium (`FontWeight.w500`)
  * Button / Pill CTA: 15sp, SemiBold (`FontWeight.w600`)
* **Text Scaler Engine (`NoteTextScaler`):**
  * Slider from 12sp to 28sp (default: 16sp, step 1sp).
  * Affects note body content ONLY — does not distort top bar, menus, or navigation buttons.
  * Font & Size Screen displays sample preview card (`text_size_sample_title`: "Your notes will look like this", `text_size_sample_body`: "Drag the slider below until this paragraph is easy to read...").

---

## 2. Five Screens Exact Architecture & Header Behaviors

### 2.1 Header Top-Bar Behavior Matrix
| Screen | State | Leading Button | Title Position & Style | Trailing Actions | Bar Background & Transition |
| :--- | :--- | :--- | :--- | :--- | :--- |
| **Welcome** | First Install Tour | None (or Back if page > 0) | Centered step title (20sp) | "Skip" (Gold text) | Translucent Glass / Clean |
| **Welcome** | What's New Sheet | Drag handle pill | Centered "What's New in Notes" (20sp bold) | Close circle (Gold X) | Glass Sheet (sigma 20) |
| **Notes Feed** | Scrolled to top | Left "< Folders" (Gold) | Large Title "Notes" (34sp bold) below top bar | "•••" circle (Gold) | Transparent / Glass blur |
| **Notes Feed** | Scrolled down | Left "< Folders" (Gold) | Centered "Notes" (17sp semibold) in top bar | "•••" circle (Gold) | Pinned Glass blur (sigma 20) |
| **Notes Feed** | Search active | Back arrow (Gold) | Search text input with clear button | Cancel text button | Pinned bar, keyboard focused |
| **Notes Feed** | Multi-select | Close / Cancel icon | Left-aligned "{count} Selected" (18sp bold) | Select All / More | Batch action bar replaces capture bar |
| **Folders** | Scrolled to top | Left "< Notes" (Gold) | Large Title "Folders" (34sp bold) | "Edit" button & Folder+ icon | Transparent / Glass blur |
| **Folders** | Scrolled down | Left "< Notes" (Gold) | Centered "Folders" (17sp semibold) | "Edit" button & Folder+ icon | Pinned Glass blur (sigma 20) |
| **Folders** | Edit Mode | Done button (Gold) | Centered "Edit Folders" | Reorder / Delete indicators | Bottom bar hidden |
| **Settings** | Scrolled to top | Left "< Notes" (Gold) | Large Title "Settings" (34sp bold) | None | Transparent / Glass blur |
| **Settings** | Scrolled down | Left "< Notes" (Gold) | Centered "Settings" (17sp semibold) | None | Pinned Glass blur (sigma 20) |
| **Appearance** | Normal | Left "< Settings" (Gold) | Centered "Appearance" (17sp semibold) | None | Pinned Glass blur (sigma 20) |
| **Page App.** | Bottom Sheet | Drag handle pill | Centered "Note Options" (18sp bold) | Close X icon | Draggable modal sheet (smooth_sheets) |

### 2.2 Screen 3: Folder View (Full Screen & Navigation Drawer)
* **Drawer & Full Screen Integration:** Left drawer slides over notes feed for fast switching; tapping "Manage Folders" or header opens full Folders view.
* **SYSTEM FOLDERS:**
  * 📝 **All Notes**: Real count of active notes.
  * ⭐️ **Pinned Notes**: Real count of `isPinned == true` notes.
  * 🔒 **Locked Notes**: Real count of `isLocked == true` notes.
  * ∑ **Math Notes**: Real count of notes containing math equations.
* **CUSTOM FOLDERS:**
  * Nested hierarchy support (`expandedFolderIds`, parent-child indentation).
  * Real count badge per folder.
  * Folder creation modal: Name input, Emoji picker, Accent Color picker (from verified 6-color palette).
* **TAGS SECTION:**
  * Horizontal/grid chip wrap displaying all hashtags extracted from notes (`#work`, `#todo`, etc.) with counts.
* **TRASH & ARCHIVE:**
  * 🗑️ **Recently Deleted**: Real count of notes in trash.
  * Trash Screen: Header "Recently Deleted", 30-day notice text, countdown days-left badge, swipe right to Restore, Empty Trash button with confirmation dialog.

### 2.3 Screen 4: Settings (Grouped Card Hierarchy)
Card hierarchy matches target app observations exactly:
1. **Premium Banner Card:** Red-to-gold gradient card: "Upgrade to Premium / Unlock all features" -> opens Paywall.
2. **Writing & Organizing Group:**
   * Sort Notes By: Dropdown ("Date Edited", "Date Created", "Title").
   * Notes Start With: Dropdown ("Title (H1)", "Heading (H2)", "Body").
   * Sort Checked Items: Toggle/Dropdown ("Manually" vs "Automatically move checklist items to bottom").
3. **Sync & Storage Group:**
   * Sync: Starred Google account sync ("Sync your notes across all devices signed in to your Google account.").
   * Backup: Automatic local backup frequency (Daily, Weekly, Manual).
   * Storage: Real storage breakdown (Notes, Audio, Photos, Scans).
4. **Security & Vault Group:**
   * App Lock: Passcode & Biometric setup.
   * Note Lock: Independent password for note encryption.
   * Hide in Recents: Native `FLAG_SECURE` task switcher protection.
5. **Appearance Row:**
   * "Appearance" -> navigates to dedicated Appearance screen. Subtitle: "Customize the app's look and text size."
6. **Writing & Calculations Group:**
   * Auto Save: Toggle (On/Off).
   * Math Results: Mode ("Suggest Result", "Insert Result", "Off").
   * Math Examples: Opens formula showcase sheet.
7. **Support & Feedback Group:**
   * Rate Us, Share App, App Support, Restore Purchases, Purchase Support.
8. **General & About Group:**
   * Language: 21 locales with live switch.
   * What's New: Opens What's New sheet.
   * About & Legal: Displays NEW app version (`com.dusrel.note`), terms, privacy.

### 2.4 Screen 5: Appearance Sub-Screens
* **Appearance Main:**
  * Theme mode selector: Light card mock vs Dark card mock with gold check circle; "Auto" toggle switch.
  * Color row: Accent Gold dot + chevron -> opens Accent Picker sheet.
  * Style row: "Classic" / "Glass" + chevron -> opens Style Sub-screen.
  * Font & Size row: "Default" + chevron -> opens Font & Size Sub-screen.
* **Style Sub-Screen:**
  * Side-by-side Classic vs Glass cards.
  * On selecting Glass on an unsupported device: triggers "Unsupported Device" dialog.
* **Font & Size Sub-Screen:**
  * Centered preview card: "Your notes will look like this" + body sample text.
  * Slider: 12sp to 28sp with live scaling on the preview card.
  * Footer note: "Choose the font and size for your notes. It does not affect the rest of the application."
* **Per-Note Page Appearance Sheet:**
  * Drag handle, title "Note Options".
  * Page Cover: None, Photo, GIF, Web Link.
  * Background Color: Pastel palette + OLED True Black.
  * Background Blur: Off, Subtle, Heavy.
  * Typography: pretenda (Default), System Default, Custom Imported Font (.ttf/.otf loader).
  * NoteTextScaler: Slider with live preview and "Reset to App Default".
  * Page Options: Full Width Note toggle, Small Attachment View toggle.

---

## 3. Core Engine Ground Truth & Implementation Architecture

### 3.1 Storage Engine (ObjectBox + Migration)
* **Entities:**
  * `NoteEntity`: id, title, contentMarkdown, contentJson, colorValue, isPinned, isLocked, isTrash, deletedAt, mathResultsMode, textScaleFactor, customFontPath, hasCover, coverUrl, folderId, createdAt, updatedAt.
  * `FolderEntity`: id, name, iconEmoji, colorValue, parentId, isExpanded, createdAt.
  * `TagEntity`: id, name, noteCount.
  * `AttachmentEntity`: id, noteId, filePath, fileType (audio, image, pdf, file), fileName, fileSize, durationSeconds, createdAt.
* **One-Time SharedPreferences Migration:**
  * Reads existing JSON `saved_notes_data`.
  * Migrates notes, folders, and tags into ObjectBox store without data loss.
  * Sets flag `migration_objectbox_complete = true`.

### 3.2 Editor Engine (Block Rich Text & Interactive Tables)
* **Block Types:** Paragraph, Heading 1, Heading 2, Heading 3, Bullet List, Numbered List, Checklist, Quote, Code, Math Block, Interactive Table.
* **Table Features:** Real insertion, dynamic column/row addition and deletion, column LTR/RTL flip, copy table, convert to text.
* **Math Engine:** Real-time evaluator with arithmetic, percentages, square roots, units, and list totals. Modes: Suggest, Insert, Off.
* **Note Links:** `>>` triggers note selector; `/` triggers section selector; bidirectional linking.
* **Find & Replace:** Floating header bar with Match Case, Whole Words, match counter, Previous/Next, and Replace All.

### 3.3 Security Engine (Fail-Closed AES-256 + PBKDF2)
* **App Lock vs Note Lock:** Separate credentials.
* **Cryptographic Vault:** AES-256 encryption via PBKDF2 with 10,000 iterations and unique random salt per note. Replaces legacy base64 plaintext encoding.
* **Biometrics:** `local_auth` integration with fallback to PIN/Passcode.
* **Fail-Closed Guarantee:** If password is unknown or invalid, note body remains strictly encrypted. Previews in feeds and search snippets show "Locked Note" and zero text leakage.

### 3.4 Media & Attachments Engine
* **Audio Voice Notes:** Real `.m4a` audio recordings using `record` package, saved to app storage directory with real duration and waveform metadata.
* **Document Scanner:** Real PDF compilation saved to disk, linked via `AttachmentEntity`.
* **Photos & Files:** System gallery and file picker integration with file copying into app document container.

### 3.5 Backup, Export & Storage Engine
* **Local Auto-Backup:** Daily, Weekly, Manual background jobs creating timestamped `.zip` archives containing database dump + all media attachments.
* **Restore:** ZIP extractor verifying file integrity, restoring database records and attachment files with zero data loss.
* **Storage Breakdown:** Dynamic calculation of disk usage for Notes, Audio, Photos, and Scans.
* **Export:** Real Markdown export and rendered PDF export.

### 3.6 Monetization & Premium Gating
* **Paywall:** 3 packages: Annual ₹389/year (selected by default, -45%), Monthly ₹59/month, Lifetime ₹899 one-time.
* **Gated Features:** Cloud Sync with Google Drive, Unlimited Custom Folders, Unlimited Voice Notes with Transcription, Unlimited Document Scans.
* **Free Tier Rules:** Ad-supported single unlock fallback ("Watch Ad · Use Once").
* **Billing SDK:** Production integration with `purchases_flutter` (RevenueCat) and Google Play Billing.

---

## 4. Verified Packages Inventory
| Package | Version in Target APK | Purpose |
| :--- | :--- | :--- |
| `objectbox` / `objectbox_flutter_libs` | 4.1.0 / 5.3.2 | High-performance ACID local storage |
| `smooth_sheets` | Latest release | Spring-physics draggable sheets |
| `flex_color_scheme` | Latest release | Multi-palette dynamic theming |
| `flutter_slidable` | 4.0.3 | Note card swipe actions |
| `sliver_tools` | Latest release | Sticky section headers (`SliverPinnedHeader`) |
| `emoji_picker_flutter` | Latest release | Custom folder emoji selection |
| `cupertino_lists_enhanced` | Latest release | iOS-style grouped settings tiles |
| `encrypt` | 5.0.3 | AES-256 + PBKDF2 cryptographic vault |
| `local_auth` | Latest release | Fingerprint & Face unlock |
| `record` | Latest release | High-fidelity voice notes |
| `file_picker` | 13.3.2 (Target compatible) | System document and font file picker |
| `purchases_flutter` | Latest release | In-app purchases & Paywall gating |
| `easy_localization` | 2.8.x | 21 localized language dictionaries |
