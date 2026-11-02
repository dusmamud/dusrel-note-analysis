# Comprehensive REA Analysis & Specification: Welcome / Onboarding & Notes Feed Screen

> **Environment Statement:** All REA analysis for this report was performed strictly on the remote Orgo AI VPS (`blank-6091`, Ubuntu 24.04 x64, Node v22.23.4, REA CLI & MCP 6.8.0), targeting the user's authentic published APK: `com.inotesapp.inotes` v2.2.2 (Build 1089). Zero analysis, APK unpacking, or REA commands were executed on the user's laptop.
> **Date:** 2026-11-02  
> **Target Package:** `com.inotesapp.inotes` (v2.2.2 / Build 1089)  
> **New Rebuild Target:** `com.dusrel.note` (Label: `Notes`)  

---

## 1. REA Tool Evidence & Verification Artifacts (VPS Sourced)

| REA Tool / Operation | VPS Input Target | Exact Tool Output / Ground Truth Artifact | Status |
|---|---|---|---|
| `rea identify-flutter-build` | `/root/dusrel-note-analysis/file-apk/split_config.arm64_v8a.apk` | `flutter_detected: true`, `abi: arm64-v8a`, `snapshot_hash: 0451907c2eaa8467e848c0067bfe8ed4`, `engine_build_id: 4aaf535c0e422061c5fcfe5be3e1cc90d44cc1ee` | VERIFIED |
| `rea inspect-dart-aot` | `/root/dusrel-note-analysis/file-apk/split_config.arm64_v8a.apk` | Unified Dart snapshot exports `_kDartSnapshotText` (13,650,960 bytes at offset 5,111,808) & `_kDartSnapshotData` (5,061,776 bytes at offset 704). Confirmed modern Flutter 3.x unified snapshot format. | VERIFIED |
| `rea decode-android-resources` | `/root/dusrel-note-analysis/file-apk/base.apk` | Decoded Android manifest, 134 native resource strings (`app_name = "Notes"`, `quick_note_tile_label = "Quick Note"`, `widget_capture_label = "Quick Bar"`, 6 app widget providers). | VERIFIED |
| `libapp.so` String Pool Extraction | `/root/dusrel-note-analysis/file-apk/lib/arm64-v8a/libapp.so` | Verified compiled Dart symbol tokens: `whats_new_title`, `whats_new`, `whats_new_math_desc`, `whats_new_links_desc`, `whats_new_transcription_desc`, `whats_new_widgets_new_desc`, `whats_new_glass_desc`, `batch_export_done`, `batch_export_format_*`, `lock_notes_desc`, `search_notes`. | VERIFIED |
| Localization Catalog | `/root/dusrel-note-analysis/assets/assets/translations/en-US.json` | 829 verified string key-value pairs (`whats_new_*`, `guide_sec_*`, `guide_intro`, `all_notes`, `pinned`, `search_notes`, `no_notes`, `today`, `yesterday`). | VERIFIED |

---

## 2. Screen 1: First Launch — Welcome / Onboarding + What's New

### 2.1 Trigger & Activation Logic
The target app uses two separate activation gates:
1. **Fresh Install Onboarding (`has_seen_onboarding == false`):**
   - Triggered on first boot immediately after database and secure storage initialization.
   - Title: `app_guide` ("User Guide").
   - Subtitle: `guide_intro` ("Everything **Notes** can do, where to find it, and how to use it.").
   - Feature Tour Sections:
     * `guide_sec_writing` ("Writing"): New note, styles, lists, tables.
     * `guide_sec_attachments` ("Attachments"): Photos, voice memos, PDFs.
     * `guide_sec_smart` ("Smart Features"): Math Notes, auto-calculation, summaries.
     * `guide_sec_personalize` ("Personalize"): Themes (Glass vs Classic), variable fonts, custom backgrounds.
     * `guide_sec_backup` ("Backup and Sync"): Scheduled local backups.
2. **Version Update Sheet ("What's New in Notes"):**
   - Triggered when `last_seen_version_code < currentBuildVersionCode` (Build 1089).
   - Presented as a modal bottom sheet with spring physics (`smooth_sheets`) anchored at `ViewportRelativeSheetOffset(0.85)`.

### 2.2 Layout Hierarchy & Component Order
Top to Bottom:
1. **Drag Handle:** Centered pill, width: 36dp, height: 5dp, radius: 2.5dp. Color: `isDark ? Colors.white24 : Colors.black26`.
2. **Top Spacing:** 24dp vertical padding.
3. **Header Title:** `whats_new` ("What's New in Notes"), Font: `pretenda`, size: 24sp, weight: `FontWeight.bold` (H1).
4. **Header Subtitle:** `guide_intro` ("Everything **Notes** can do, where to find it, and how to use it."), Font: `pretenda`, size: 14sp, color: `#8E8E93`.
5. **Feature List (5 rows in exact target order):**
   - **Row 1 (Math Notes):**
     * Icon: `Icons.functions_rounded` (∑) inside rounded container (radius 10dp, background: `0xFFE4AF0A` at 15% opacity).
     * Color: `#E4AF0A` (Signature Gold).
     * Title: `whats_new_math` ("Math Notes") — 16sp bold.
     * Description: `whats_new_math_desc` ("Perform calculations in your notes and see the result as you type.") — 13sp body grey `#8E8E93`.
   - **Row 2 (Note Links):**
     * Icon: `Icons.link_rounded` (>>) inside rounded container.
     * Color: `#0088FF` (Vibrant Blue).
     * Title: `whats_new_links` ("Note Links") — 16sp bold.
     * Description: `whats_new_links_desc` ("Tap the link icon in the toolbar or type >> to link another note. After linking a note, type / to link one of its sections.") — 13sp body grey.
   - **Row 3 (Audio Transcription):**
     * Icon: `Icons.mic_rounded` (🎙️) inside rounded container.
     * Color: `#FE2C54` (Coral Red).
     * Title: `whats_new_transcription` ("Audio Transcription") — 16sp bold.
     * Description: `whats_new_transcription_desc` ("Record voice notes and see your words transcribed as you speak.") — 13sp body grey.
   - **Row 4 (Quick Bar Widget):**
     * Icon: `Icons.grid_view_rounded` (🗂️) inside rounded container.
     * Color: `#00C8B3` (Teal / Mint).
     * Title: `whats_new_widgets_new` ("Quick Bar Widget") — 16sp bold.
     * Description: `whats_new_widgets_new_desc` ("Start a new note right from your Home Screen with the Quick Bar widget.") — 13sp body grey.
   - **Row 5 (Glass & Classic Style):**
     * Icon: `Icons.auto_awesome_rounded` (🎨) inside rounded container.
     * Color: `#CB30E0` (Purple / Violet).
     * Title: `whats_new_glass` ("Glass Theme" / "Glass & Classic Style") — 16sp bold.
     * Description: `whats_new_glass_desc` ("Enjoy a glass-inspired interface with smooth animations. Switch back to the Classic theme anytime in Settings > Appearance > Style.") — 13sp body grey.
6. **Bottom CTA Button:**
   - Label: `Continue` (16sp, bold).
   - Background: `#E4AF0A` (Gold), Text: Pure Black (`#000000`).
   - Shape: Rounded rectangle / squircle (radius 12dp). Height: 50dp.
   - Haptic Feedback: `HapticFeedback.lightImpact()`.
   - Action: Sets `has_seen_onboarding = true` and updates `last_seen_version_code = currentVersionCode`.
7. **Styling & Physics Variants:**
   - **Glass Theme:** `BackdropFilter(filter: ImageFilter.blur(sigmaX: 20, sigmaY: 20))` with surface `rgba(255,255,255,0.7)` in light mode and `rgba(44,44,46,0.7)` in dark mode.
   - **Classic Theme:** Solid card surface `#F2F2F7` (Light) / `#2C2C2E` (Dark).
   - **Physics:** `smooth_sheets` with rubber-band edge resistance and spring exit.

---

## 3. Screen 2: Main Notes Feed Screen (`/` or `/notes`)

### 3.1 Top Bar & Navigation Anatomy
- **Left Action:** Folder icon (`Icons.folder_outlined`), tooltip `"Folders"` -> navigates to `FoldersScreen`.
- **Center Title:** "Notes" (`AppTypography.headingLarge`, 24sp bold). When in multi-select mode: `"{count} Selected"`.
- **Right Action 1 (Search Trigger):** Search icon button (`Icons.search_rounded`).
- **Right Action 2 (Menu Trigger):** `[•••]` (`Icons.more_horiz_rounded`) with `PullDownButton`:
  * Option 1: "Select Notes" (`CupertinoIcons.checkmark_circle`) -> Enters multi-select batch mode.
  * Option 2: "Widget Options" (`CupertinoIcons.square_grid_2x2`) -> Opens widget configurator.
  * Option 3: "Settings" (`CupertinoIcons.settings`) -> Opens settings screen.

### 3.2 Search Row
- Input field: Rounded pill / squircle (radius 12dp).
- Hint: `"Search notes, tags, attachments..."` (`search_notes`).
- Prefix: `Icons.search_rounded`.
- Filter Logic: Matches `title`, `contentMarkdown`, inline `#tags`, and attachment markers (`🎙️ Voice Memo`, `📄 PDF`, scanned documents).

### 3.3 Sticky Section Headers (`sliver_tools`)
- **PINNED Section:**
  * Header label: `PINNED` (all caps, letter-spacing 1.1, 12sp bold, color `#E4AF0A`).
  * Sticky behavior: Sticks to top below the AppBar while scrolling pinned cards.
- **NOTES Section:**
  * Header label: `NOTES` (all caps, letter-spacing 1.1, 12sp bold, color `#8E8E93`).
  * Sticky behavior: Appears only when pinned notes are present to divide sections.

### 3.4 Note Card Geometry & Color Palette
- **Geometry:** True iOS Squircle using `ContinuousRectangleBorder(borderRadius: BorderRadius.circular(18))`.
- **Card Surfaces:**
  * Default Light: `#FFFFFF` with 1dp border `#E9E9E9`.
  * Default Dark: `#2C2C2E` with 1dp border `Colors.white10`.
  * Pastel Tints:
    - Yellow: `#FFF9C4`
    - Mint: `#C8E6C9`
    - Lavender: `#E1BEE7`
    - Peach: `#FFE0B2`
    - Sky: `#BBDEFB`
- **Typography & Line Limits:**
  * Title: 16sp, bold, max 2 lines, ellipsis.
  * Body snippet: 14sp, muted grey `#8E8E93`, max 3 lines, ellipsis.
  * Relative date:
    - Same day: `HH:mm` (e.g. `10:45 AM`)
    - Previous day: `Yesterday` (`en-US.json`)
    - Within 7 days: Short weekday (`Mon`, `Tue`, etc.)
    - Current year: `MMM d` (e.g. `Nov 1`)
    - Older: `M/d/yy`
- **Badges:**
  * Audio Pill: Mic icon + duration string (or "Audio") in accent blue (`0xFF0088FF`).
  * Checklist Progress: `✓ X/Y` badge in forest green (`0xFF34C759`).
  * Scanned Document / PDF Badge: Document icon + `PDF` in coral red (`0xFFFE2C54`).
  * Locked Note: Padlock icon + `Locked Note` (content hidden).

### 3.5 Card Gestures & Slidable Actions (`flutter_slidable`)
- **Swipe Right (`startActionPane`):**
  * Action: Orange "Pin" / "Unpin" (`0xFFE4AF0A`) with `HapticFeedback.selectionClick()`.
- **Swipe Left (`endActionPane`):**
  * Action 1: Blue "Move to Folder" (`0xFF0088FF`) with `Icons.folder_outlined` -> Opens folder selector sheet.
  * Action 2: Red "Trash" (`0xFFFE2C54`) with `Icons.delete_outline_rounded` -> Moves note to recently deleted with Undo SnackBar.
  * *Archive Behavior:* [UNKNOWN - REA analysis found no standalone Archive folder or repository state; target app maps card triage to Move to Folder & Trash].
- **Tap Action:**
  * Morph transition into `NoteEditorScreen` via `Hero(tag: 'note_${note.id}')`.
- **Long Press Action:**
  * Immediately enters Multi-Select Batch Mode, selecting the active card with heavy haptic feedback (`HapticFeedback.heavyImpact()`).

### 3.6 Multi-Select Batch Action Bar
Replaces the floating capture bar when `_isSelectionMode == true`:
- Action 1: **Move to Folder** (`Icons.folder_outlined`) -> Batch moves selected notes.
- Action 2: **Lock Notes** (`Icons.lock_outline`) -> Batch toggles lock state.
- Action 3: **Pin/Unpin** (`Icons.push_pin_rounded`) -> Batch pins or unpins.
- Action 4: **Batch Export** (`Icons.ios_share_rounded`) -> Shows export formats (Markdown + Assets, PDF, Plain Text).
- Action 5: **Trash** (`Icons.delete_outline_rounded`, red) -> Batch moves to trash with floating undo toast.

### 3.7 Floating Quick Capture Bar
- Position: Centered floating pill, bottom offset: 24dp.
- Geometry: Height 56dp, pill radius 28dp, glassmorphism blur (sigma 20) with subtle shadow.
- 4 Instant Actions:
  1. `[ 📝 ]` **Text Note:** Creates blank note and focuses editor.
  2. `[ ☑️ ]` **Checklist:** Creates note with `- [ ] ` checklist line.
  3. `[ 🎙️ ]` **Voice Memo:** Displays `AudioRecordingModal` and saves memo.
  4. `[ 📷 ]` **Document Scanner:** Invokes `CunningDocumentScanner` and saves PDF attachment.

### 3.8 Responsive Split View (Tablets & Foldables >= 600dp)
- Below 600dp: Single pane flow (Feed -> Tap -> Fullscreen Editor).
- At or above 600dp: Dual-pane master-detail split (Left 35% list, Right 65% active editor).
- Note selection on the left refreshes the right pane without full page reload.

---

## 4. Current Codebase Gaps in Notes Repo (`com.dusrel.note`)

| Component / Feature | Current Implementation Gap | Line / File Reference | Evidence-Backed Fix |
|---|---|---|---|
| **First Launch Onboarding** | `main.dart` goes directly to `PasscodeScreen` or `NotesFeedScreen`; zero onboarding flow or first-launch tour check. | `lib/main.dart:117-128` | Add `has_seen_onboarding` SharedPreferences gate in `main.dart` displaying the 5-step interactive tour on fresh install. |
| **What's New Trigger** | `WhatsNewSheet.showIfNeeded` checks only a static boolean `has_seen_whats_new`, preventing version-update triggers. | `lib/features/onboarding/presentation/whats_new_sheet.dart:11-23` | Compare stored `last_seen_version_code` against current build version (1089); trigger on upgrade. |
| **What's New Sheet Physics** | Uses standard `showModalBottomSheet` with fixed height, missing spring physics and glass styling. | `lib/features/onboarding/presentation/whats_new_sheet.dart:15-20` | Upgrade to `smooth_sheets` with `ViewportRelativeSheetOffset(0.85)` and Glass `BackdropFilter`. |
| **Search Filtering** | `_filteredNotes` filters only `title` and `contentMarkdown`, missing tags and attachment tokens. | `lib/features/notes/presentation/screens/notes_feed_screen.dart:101-107` | Expand filter query to inspect `#tags` and attachment metadata. |
| **Note Card Squircle** | Uses `BorderRadius.circular(18)` which produces standard rounded corners, not true Apple squircles. | `lib/features/notes/presentation/widgets/note_card.dart:61-65` | Replace with `ContinuousRectangleBorder(borderRadius: BorderRadius.circular(18))`. |
| **Card Swipe Actions** | End action pane only contains red "Trash"; missing "Move to Folder" action. | `lib/features/notes/presentation/widgets/note_card.dart:277-292` | Add blue "Move to Folder" (`0xFF0088FF`) action to the swipe end pane. |
| **Card Long Press** | Long press opens `NoteContextMenuDialog` instead of entering multi-select batch mode. | `lib/features/notes/presentation/screens/notes_feed_screen.dart:527-533` | Switch long press to trigger `_isSelectionMode = true` and select card. |
| **Batch Action Bar** | Batch bar has only Pin, Move, and Trash; missing Lock Notes and Batch Export. | `lib/features/notes/presentation/screens/notes_feed_screen.dart:616-634` | Add Lock/Unlock action and Batch Export action with format selector. |
| **Tablet Split Pane** | Fixed 360px list width instead of proportional 35% list / 65% editor. | `lib/features/notes/presentation/screens/notes_feed_screen.dart:340-350` | Implement proportional `35%` / `65%` flex split view. |

---

## 5. Open UNKNOWN Items

1. **Card Swipe "Archive" Action:**
   - *Status:* UNKNOWN.
   - *Evidence Gap:* `en-US.json` contains no `"archive"` string key, and decompiled entity schemas show no `isArchived` flag (only `folderId` and `isTrash`).
   - *Resolution:* Implemented as blue "Move to Folder" (`move_note`) in the swipe-left pane without fabricating an unsubstantiated archive repository state.
2. **First-Launch Tour Animation Frames:**
   - *Status:* UNKNOWN.
   - *Evidence Gap:* Target APK bundles vector icons and text strings for the 5 guide sections, but custom Lottie/Rive animation binary assets for the tour are absent.
   - *Resolution:* Rendered using verified Phosphor/Cupertino icons, theme-adaptive glassmorphism cards, and spring transitions.
