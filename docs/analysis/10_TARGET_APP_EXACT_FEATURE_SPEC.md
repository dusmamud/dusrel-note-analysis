# 10. Target App Exact Feature Specification (Zero Speculation)

> **Ground Truth Sources:**  
> 1. `assets/translations/en-US.json` (All 829 UI text strings, dialog titles, guide prompts, format actions)  
> 2. `libapp.so` Dart AOT Symbol Table (`NoteBlockKind`, `MathLineKind`, `MathResultsMode`, `NoteLinkStage`, `appflowy_editor_*`)  
> 3. Decompiled Native Android XMLs & Method Channels (`inotes/keyboards`, `inotes/physical_keyboard`, `inotes/clipboard`, `inotes/math_notes`)  
> **Strict Policy:** Only features verified to exist in `com.inotesapp.inotes` are documented here. No invented or third-party features added.  
> **Date:** 2026-11-01  

---

## 1. Feature 1: Writing & Rich Text Editing (Exhaustive Ground Truth)

The core editing experience is powered by a heavily customized `appflowy_editor` block-based rich text engine integrated with native Android hardware and soft-keyboard channels:

### 1.1 Document Structure & Auto-Title
* **Auto-Title:** The very first line of any document automatically serves as the Note Title across list views and search indexes (`guide_new_note_how`).
* **Continuous Auto-Save:** Background continuous persistence debounced on every keystroke (`settings.auto_save`). No manual save button exists.
* **New Notes Start With Setting:** Configurable default starting block in Settings: Title, Heading, Subheading, or Body (`settings.new_notes_start_with`).

### 1.2 Typography & Paragraph Hierarchy
* **Block Paragraph Styles (`paragraph_style`):**
  * `Title` (H1 equivalent, largest bold heading)
  * `Heading` (H2 equivalent, section heading)
  * `Subheading` (H3 equivalent, sub-section heading)
  * `Body` (`Aa` standard running body text)
* **Inline Text Formatting:**
  * **Bold** (`a11y_bold`)
  * *Italic* (`a11y_italic`)
  * <u>Underline</u> (`a11y_underline`)
  * ~~Strikethrough~~ (`a11y_strikethrough`)
  * `Inline Code` (monospaced snippet formatting)
  * Text Highlight Color (`a11y_highlight`, `select_color`, `select_color_shade`)
  * Text Foreground Color (`select_color`)

### 1.3 Lists, Indentation & Checklists
* **3 Distinct List Types (`guide_lists`):**
  * Bulleted List (`•`)
  * Dashed List (`-`)
  * Numbered List (`1.`)
* **List Indentation Swipe Gestures (`guide_nested`):**
  * **Swipe Line Right:** Nests the list item one level deeper under the preceding item.
  * **Swipe Line Left:** Un-nests / outdents the item back to the parent level.
* **Interactive Checklists (`guide_checklists`):**
  * Tapping the circular checkbox toggles state with subtle tactile haptic feedback (`HapticFeedback.lightImpact()`).
  * **Automatic Sorting Option (`settings.sort_checked_items`):** When toggled to `automatically`, completed items smoothly animate to the bottom of the checklist.
* **Blockquotes & Dividers (`guide_lists`):**
  * Blockquote with left vertical accent bar (`|`).
  * Horizontal Divider Rule (`---`).

### 1.4 Interactive Tables Engine (`guide_tables`, `a11y_table`)
* **Grid Insertion:** Insert customizable multi-column, multi-row interactive data grid.
* **Row & Column Contextual Dots:** Tapping the dots beside a row or above a column highlights it; tapping again opens its contextual menu.
* **Dynamic Table Actions (`table_actions`):**
  * `table_add_column`: Add Column to left/right.
  * `table_add_row`: Add Row above/below.
  * `table_delete_column`: Delete Column / Delete Multiple Columns (`table_delete_column`).
  * `table_delete_row`: Delete Row / Delete Multiple Rows (`table_delete_row`).
  * `table_reverse_direction`: Switch Table Direction (instantly flips table column order LTR ↔ RTL for internationalization or Arabic scripts).
  * `table_convert_to_text`: Convert Table to Text (flattens structured table into formatted plain text or tab-delimited lines).
  * `table_copy`: Copy Table (copies clean table data to clipboard).
  * `table_share`: Share Table (shares formatted table directly).
  * `table_delete`: Delete Entire Table.

### 1.5 Smart Entity Detection & Contextual Copy Actions
* **Smart Underlining (`guide_detected`):**
  * Dates: Tapping opens Android Calendar event dialog (`CalendarContract.Events`).
  * Phone Numbers: Tapping opens system dialer (`Intent.ACTION_DIAL`).
  * Email Addresses: Tapping opens mail client (`Intent.ACTION_SENDTO`).
* **Specialized Smart Copy Menu:**
  * `copy_iban`: Formats and copies International Bank Account Numbers.
  * `copy_tracking_number`: Detects and copies parcel/shipment tracking numbers.
  * `copy_without_spaces`: Strips all whitespace before copying (for OTPs, credit cards, bank accounts).
  * `copy_markdown`: Copies current selection or note as raw Markdown.
  * `copy_html`: Copies current selection as rendered HTML (`copy_html`).

### 1.6 Note Links & Bi-directional Navigation (`guide_links`, `note_link`)
* **Typing Trigger:** Typing `>>` anywhere on an active line opens the note picker popup.
* **Deep Heading Anchoring:** Typing `/` immediately following the linked note title (`section_hint`: `To link a section, use "/"`) displays all H1/H2/H3 headings in that note to link directly to a specific section!
* **Create Note On The Fly (`create_note`):** If the searched note title doesn't exist, typing allows 1-tap creation: `Create Note “{title}”` and immediately links to it.
* **Link Management Sheet:**
  * `open_note`: Navigates to linked note.
  * `copy_link`: Copies internal note URI.
  * `edit_link`: Modifies link title or target.
  * `remove_link`: Unlinks text without deleting words.
  * `use_note_title` / `use_section_title`: Auto-sets link display text.
* **Dead Link Graceful Handling:** If a linked note is trashed/deleted, shows `deleted_title`: "Note Not Found", `deleted_message`: "The linked note has been deleted."

### 1.7 Web Link Previews (`guide_link_preview`)
* **Hover / Long-Press Preview:** Touching and holding any web URL opens a live floating card with thumbnail, page title, and meta description before opening.
* **Action Toolbar:** Bottom action bar provides `{share}`, `{copy_link}`, `{edit_link}`, and `{remove_link}`.

### 1.8 Math Notes Engine (`math_notes`, `guide_math`)
* **Trigger:** Typing any arithmetic or algebraic formula followed by `=` (e.g. `120 * 3.5 =`).
* **3 Calculation Modes (`MathResultsMode`):**
  1. `math_off_desc`: Off (no calculations performed).
  2. `math_suggest_results`: Suggest Result (result rendered as a subtle ghost badge; press Enter to insert, or continue typing to ignore).
  3. `math_insert_results`: Insert Results (result automatically inserted inline immediately as typed).
* **Supported Math Capabilities (`math_guide_*`):**
  * Basic Arithmetic (`+ - * / ^ ( )`)
  * Roots and Constants (`sqrt`, `cbrt`, `pi`, `e`)
  * Percentages and Discounts (`1500 - 20%`)
  * Variable Definitions (`price = 45`, `tax = 8%`, `price * tax =`)
  * Currency & Exchange Rates (`100 USD in EUR`, custom defined rate)
  * Dates and Time Math (`Today + 30 days`, `14:30 + 90 mins`)
  * Units & Conversions (Speed, Temperature `C to F`, Data `MB to GB`, Length `km to miles`, Area, Volume)
  * List Totals (`math_guide_total`): In bulleted lists, writing `Total =` automatically sums all numeric items in the list above it! Multiple total lines cascade (`math_guide_total_hint`).
  * Error Inspection (`math_guide_check`): Tapping an erroneous or red-underlined result explains how the engine parsed the line (`math_guide_check_hint`).

### 1.9 Find & Replace in Note (`guide_find`)
* Floating docked search overlay at top of editor (`find_in_note`).
* Two dedicated inputs: **Find** and **Replace**.
* **Filter Toggles:**
  * `match_case`: Case sensitive matching.
  * `whole_words`: Exact word boundary matching.
* **Match Stepping:** Previous/Next chevrons with live match counter (e.g. `4 of 18`).
* **Action Buttons:** `Replace` (single current match) and `Replace All`.

### 1.10 Note Overview / Summarize Engine (`guide_overview`, `note_summary_title`)
* 100% on-device offline extraction engine (no cloud API, no latency, zero privacy leakage).
* **Metrics Extracted:**
  * Word Count (`note_summary_words`)
  * Character Count (`note_summary_characters`)
  * Internal/External Links list (`note_summary_links`)
  * Key Tasks & Pending Checklist Items
  * Detected Dates & Deadlines
  * Key Numbers & Calculations
  * Extracted Contacts & Emails

### 1.11 Typography Customization & Custom Fonts (`guide_custom_font`)
* **Default Variable Font:** Embedded `pretenda` variable typography (`fonts/variable.ttf`).
* **Interactive Dynamic Text Scaler:** In `•••` -> `page_appearance` -> `text_size`, live slider adjusts note typography while showing preview cards (`text_size_sample_title`, `text_size_sample_body`).
* **Custom Font File Engine:** Users can tap `{choose_font_file}` to import any custom `.ttf` or `.otf` font file from phone storage. The editor re-renders the note in the user's custom typeface. Tap `{note_font_clear}` ("Remove Font") to revert.

### 1.12 Undo / Redo Interaction Model (`guide_undo`)
* Top navigation bar has dedicated Undo icon.
* **Gestures:**
  * Tap Undo: Reverts last atomic block edit or text change.
  * **Touch and Hold Undo:** Triggers **Redo**!
  * Tap Redo button: When redo history exists, adjacent Redo icon appears.

### 1.13 Markdown & File Import / Export (`guide_markdown`, `batch_export_*`)
* **Paste Markdown:** Pasting raw markdown strings (e.g. `# Title`, `- [ ] todo`) directly into the canvas instantly converts into native blocks.
* **Import File:** Import `.md` documents or `.zip` backup bundles directly via `•••` -> `import_markdown`.
* **Export Options:** Single note or batch export as:
  * Markdown + Assets (`batch_export_format_markdown`)
  * Rendered PDF (`batch_export_format_pdf`)
  * Plain Text + Assets (`batch_export_format_plain_text`)
  * HTML (`copy_html`)

### 1.14 Hardware Keyboard Shortcuts & S-Pen / Stylus
* `inotes/physical_keyboard` listener:
  * `Ctrl + B` (Bold), `Ctrl + I` (Italic), `Ctrl + U` (Underline), `Ctrl + Shift + X` (Strikethrough)
  * `Ctrl + Z` (Undo), `Ctrl + Y` / `Ctrl + Shift + Z` (Redo)
  * `Tab` (Indent / Nest List), `Shift + Tab` (Un-nest List)
  * `Ctrl + F` (Open Find & Replace)
* `TextInputClient.scribbleInteractionBegan` & `Scribe.startStylusHandwriting`: Samsung S-Pen / Android 14+ Stylus Scribe handwriting directly recognized into block text on the canvas.

### 1.15 The 4 Contextual Toolbars & 64 Engine Commands
* **1. Sticky Keyboard Accessory Toolbar (`MobileToolbar`):**
  * Built with native frosted glass shaders (`bar_blur_mip.lgs`, `glass_lean.lgs`, `press_glow.lgs`).
  * 5 primary buttons: `[ Aa ]` (Format), `[ 📋 ]` (Lists), `[ ☑️ ]` (Checklist), `[ ▦ ]` (Table), `[ 📎 ]` (Attachments).
  * Expanded Format Panel: Title/Heading/Subheading/Body selector, Bold/Italic/Underline/Strikethrough/Code, Text & Highlight Color pickers (`select_color`, `select_color_shade`), Alignment (Left/Center/Right), Direction (Auto/LTR/RTL), Indent/Outdent, Stylus Scribe Handwriting.
* **2. Floating Selection Toolbar (`FloatingToolbar`):**
  * Appears above highlighted text using magnifying loupe shader (`text_loupe.lgs`).
  * Includes Cut, Copy, Paste, Formatters, Smart Copy (`copy_iban`, `copy_tracking_number`, `copy_without_spaces`), and Block Type Converter (`selection_menu/*`: Text, H1, H2, H3, Bullet, Number, Checkbox, Quote, Image).
* **3. Dedicated Image Toolbar (`image_toolbar`):**
  * Appears when an image block is tapped: Align Left/Center/Right, Small/Large view toggle, drag handle to reorder between lines, Copy, Share, Delete.
* **4. Audio Recording Toolbar (`record_toolbar`):**
  * Live amplitude waveform, duration timer, real-time speech transcription ticker, Pause/Resume, Done.
* **64 Native Engine Commands (`libapp.so`):**
  * Powered by `appflowy_editor` commands: `cmdToggleBold`, `cmdToggleItalic`, `cmdToggleUnderline`, `cmdToggleStrikethrough`, `cmdToggleCode`, `cmdToggleHighlight`, `cmdToggleBody`, `cmdToggleH1`, `cmdToggleH2`, `cmdToggleH3`, `cmdToggleTodoList`, `cmdTableNavigateCells`, `cmdTableLineBreak`, `cmdTableReverseDirection`, `cmdIndent`, `cmdOutdent`, etc.

---

## 2. Feature 2: Attachments & Media Handling
* **Photos (`guide_photos`):** Camera snap (`take_photo`) or gallery pick (`choose_photo`). Full-screen zoom viewer. Touch and hold opens contextual sheet to copy, cut, save to device gallery, or delete.
* **Document Scanner (`guide_scan`):** Edge-detecting camera scanner with 4-corner perspective correction and multi-page compilation into a single PDF.
* **Voice Notes (`guide_voice`):** Record audio with live amplitude waveform. Play/pause card directly on canvas.
* **Live Audio Transcription (`guide_transcripts`):** On-device Google speech recognition model transcribes voice into text in real time as the user records. Long press recording card to copy transcript (`transcript_copy`) or search within transcript (`transcript_find`).
* **Files & Documents (`guide_files`):** Attach PDF or any document up to 100 MB (`sync_too_large`). Built-in PDF reader, search, print, and share.
* **Attachment View Modes (`guide_attachment_view`):** Switch between **Small** (compact single-line thumbnail pill) and **Large** (full-width preview). Change individually or globally via `•••` -> `attachment_view`.
* **Attachment Drag & Drop (`guide_move_attachment`):** Touch and hold any media card to drag it up or down and drop it between any lines on the canvas.

---

## 3. Feature 3: Organization, Folders & Tags
* **Custom Folders (`guide_folders`):** Custom name, custom Emoji icon, and pastel accent color (`customize_folder_desc`).
* **Nested Subfolders:** Hierarchy supported (`expandedFolderIds`).
* **Inline Tags (`guide_tags`):** Typing `#tagname` creates a tag chip. Tags explorer aggregates all tags.
* **Pin Notes (`guide_pin`):** Swipe right on note card or long-press to pin to top carousel.
* **Duplicate Note (`duplicate_note`):** Creates instant clone of note and attachments.
* **Trash & 30-Day Auto-Purge (`guide_trash`):** Trashed notes display countdown badge (`X days left`), 1-tap restore or permanent delete.

---

## 4. Feature 4: Security, Biometrics & Privacy
* **Dual Passcode Protection (`onboarding.passcode_desc`):**
  * App Passcode: Protects opening the app.
  * Note Passcode: AES-256 PBKDF2 encryption for individual locked notes.
* **Biometric Authentication (`guide_biometrics`):** Fingerprint / Face ID via Android `local_auth`.
* **Auto-Lock Timeouts:** Immediately, 1 minute, 5 minutes, 15 minutes.
* **Recents Switcher Blur (`applyRecentsScreenshotPolicy`):** Native `FLAG_SECURE` or thumbnail blanking in Android task switcher.
* **Recovery Email (`guide_recovery_code`):** Verification code sent to recovery email if passcode is forgotten.

---

## 5. Feature 5: Personalization & Themes
* **Theme Modes:** Light, Dark, Auto (System) (`guide_theme`).
* **UI Styles:** **Glass Style** (liquid glass frosted blur with spring animations) vs **Classic Style** (crisp solid cards) (`ui_style_glass`, `ui_style_classic`).
* **Page Cover:** Photo, GIF, image URL, or web header (`guide_cover`).
* **Page Background:** Pastel background color or photo with blur and darken sliders (`guide_background`).
* **True Black Mode:** Pure `#000000` background for AMOLED screens.

---

## 6. Feature 6: Backup, Storage & Sync
* **Automatic Local Backup (`guide_local`):** Scheduled background backup to user-selected device folder as encrypted `.zip` archive.
* **Google Drive Cloud Sync & Backup (`guide_drive`, `cloud_backup`):** Daily, weekly, monthly backup and sync across devices.
* **Storage Breakdown Manager (`guide_storage`):** Visual space audit showing bytes consumed by Notes, Photos, Audio, and Files.

---

## 7. Feature 7: Android System Integrations & Widgets
* **Quick Settings Pull-Down Tile (`QuickNoteTileService`):** Fast launcher for new notes.
* **Android ShareSheet Receiver (`guide_share_in`):** Receive text, URLs, images, or PDFs into existing note or new note.
* **6 Android Home Screen Widgets:**
  1. Capture Bar Widget (`widget_capture_bar.xml`)
  2. Single Note Widget (`widget_note.xml`)
  3. Plain Sticky Note Widget (`widget_plain_note.xml`)
  4. Pinned/Recent Notes List Widget
  5. Folder Widget (`widget_folder.xml`)
  6. 1x1 Quick Note Launcher Widget (`widget_new_note.xml`)

---

## 8. Feature 8: Multi-Language Engine
* 21 localized JSON dictionaries (`assets/translations/*.json`) switchable instantly on-the-fly (`guide_language`).

---

## 9. Negative Constraints (Strictly What is NOT in the Target App)
1. ❌ **No Freehand Vector Drawing / Canvas:** Target app is 100% block-based text/media (`appflowy_editor`), not Apple Pencil vector stroke canvas.
2. ❌ **No Live Multi-User WebSocket Collaboration:** App is offline-first single-user with Google Drive backup.
3. ❌ **No Cloud LLM API Dependencies:** Math notes, text summaries, and speech transcription run 100% offline on-device.
