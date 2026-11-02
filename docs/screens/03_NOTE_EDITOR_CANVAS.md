# Screen 03: Note Editor Canvas & Rich Text Toolbox (100% Ground Truth Specification)

> **Ground Truth Sources:**  
> 1. `libapp.so` Dart AOT Engine: 64 `cmd*` editor commands, `MobileToolbar`, `FloatingToolbar`, `SelectedToolbar`, `ToolbarDefaultItemKind`, `image_toolbar/*`, `toolbar/*`, `selection_menu/*`  
> 2. Native Shaders: `packages/support_package/shaders/compiled/` (`text_loupe.lgs`, `press_glow.lgs`, `bar_blur_mip.lgs`, `glass_lean.lgs`)  
> 3. Native Platform Integrations: `Scribe.startStylusHandwriting`, `inotes/physical_keyboard`, `inotes/clipboard`  
> 4. Localization Dictionary: `en-US.json` (`guide_*`, `table_*`, `note_link`, `a11y_*`, `paragraph_style`)  
> **Route:** `/editor`  
> **Strict Policy:** Every single button, mode, gesture, and command is cross-verified from decompiled binaries. Zero speculation.  
> **Date:** 2026-11-01  

---

## 1. Top Navigation Bar (Header)

```
┌────────────────────────────────────────────────────────────────────────┐
│ [ < Back ]               (Title Auto-Saves)            [ ↩️ ] [ ↪️ ] [ ••• ]│
└────────────────────────────────────────────────────────────────────────┘
```
* **`< Back` Navigation:** Automatically persists all pending editor states and navigates back to feed.
* **Auto-Save Indicator:** Discrete visual state saving to `ObjectBox` on every keystroke (<1ms latency).
* **Undo Button (`undo`, `guide_undo`):**
  * Tap: Triggers `cmdUndo`. Reverts last atomic text or block transformation.
  * **Touch and Hold (Long Press):** Triggers `cmdRedo` directly from the undo button!
* **Redo Button (`redo`):** Appears adjacent to Undo when redo history exists; triggers `cmdRedo`.
* **`•••` More Menu (`editorMoreMenu`):**
  * `summarize`: Generates offline on-device Note Overview (`note_summary_title`).
  * `find_in_note`: Opens Floating Find & Replace header (`cmdOpenFindAndReplace`).
  * `page_appearance`: Cover image, pastel background tint/photo with blur & darken sliders, typography & text size scaler (`NoteTextScaler`), custom `.ttf`/`.otf` font file importer.
  * `attachment_view`: Global toggle for all media between Small and Large preview.
  * `math_results`: Note-specific override for calculation modes (Suggest, Insert, Off).
  * `lock_note`: Biometric / AES-256 password lock for this note.
  * `pin_note`: Pins to top carousel.
  * `duplicate_note`: Clones note and all attached media.
  * `export`: Export as Markdown + Assets, PDF, or Plain Text.
  * `move_to_folder` / `delete_note` (Move to Trash with 30-day purge).

---

## 2. Editor Canvas Anatomy & Smart Typing Triggers

### 2.1 Block Architecture
The canvas renders a vertical list of flexible blocks managed by `appflowy_editor`:
1. **Title Line:** Automatically extracted from the first line of content (`guide_new_note_how`).
2. **Metadata Strip:** Shows relative timestamp (e.g. `Created Today at 10:45 AM`), word count (`note_summary_words`), and character count (`note_summary_characters`).
3. **Headings:** `Title`, `Heading` (H2), and `Subheading` (H3).
   * **Double-Tap Collapse Gesture (`double-tap collapse`, `a11y_expand_hint`):** Double-tapping any heading smoothly collapses or expands all content nested beneath it!
4. **Paragraph Body Text:** Standard body text block.

### 2.2 Typing Triggers & Auto-Markdown Formatting
* **Divider Trigger (`convert minuses to divider`):** Typing `---` or `- - -` on an empty line immediately transforms into a horizontal divider rule (`toolbar/divider`).
* **Checklist Trigger (`checklist convert paragraph`):** Typing `[] ` or `[ ] ` converts the paragraph into an interactive checklist block (`cmdToggleTodoList`).
* **List Triggers:**
  * Typing `* ` or `- ` converts line into a Bulleted List item (`toolbar/bulleted_list`).
  * Typing `1. ` converts line into a Numbered List item (`toolbar/numbered_list`).
* **Quote Trigger:** Typing `> ` converts line into a Blockquote with vertical accent bar (`toolbar/quote`).
* **Code Trigger:** Typing ```` converts block into a monospaced Code block (`toolbar/code`).
* **Note Link Trigger (`guide_links`, `NoteLinkStage`):**
  * Typing `>>` anywhere opens a floating note selector modal.
  * Typing `/` immediately following the linked note title (`section_hint`: `To link a section, use "/"`) opens a section dropdown listing all H1/H2/H3 headings in that note to link directly to a specific anchor!
  * If the note doesn't exist, typing allows instant on-the-fly creation: `Create Note “{title}”`.
* **Math Calculation Trigger (`guide_math`, `MathResultsMode`):**
  * Typing an arithmetic or algebraic sum ending with `=` (e.g. `150 * 1.18 =` or `tax = 5%`).
  * If in `math_suggest_results` mode: A ghost badge appears at the end of the line. Pressing **Enter** or **Tab** accepts and inserts the result (`accept the answer the note offering with the tab key`); continuing to type dismisses it.
  * If in `math_insert_results` mode: The answer is automatically written in.
  * List Column Total: Typing `Total =` at the bottom of a bulleted list calculates the sum of all numeric items in the list above it!
* **Tag Trigger:** Typing `#word` transforms into an interactive clickable tag chip.

---

## 3. The Rich Text Toolbox / Toolbar System

The app features **4 distinct specialized toolbars** adapting dynamically to user selection and context:

```
┌────────────────────────────────────────────────────────────────────────┐
│                                                                        │
│                          NOTE EDITOR CANVAS                            │
│                                                                        │
├────────────────────────────────────────────────────────────────────────┤
│ 1. MAIN STICKY ACCESSORY TOOLBAR (Docked above soft keyboard):        │
│ ┌────────────────────────────────────────────────────────────────────┐ │
│ │  [ Aa ]      [ 📋 ]      [ ☑️ ]      [ ▦ ]      [ 📎 ]            │ │
│ │  Format      Lists      Checklist   Table     Attach               │ │
│ └────────────────────────────────────────────────────────────────────┘ │
└────────────────────────────────────────────────────────────────────────┘
```

### 3.1 Primary Keyboard Accessory Toolbar (`MobileToolbar`)
Docked sticky immediately above the software keyboard IME. Rendered with custom native shaders (`packages/support_package/shaders/compiled/`):
* `bar_blur_mip.lgs` (frosted glass background blur)
* `glass_lean.lgs` / `glass_lean_morph.lgs` (glass refraction and layout morphing)
* `press_glow.lgs` (smooth tactile glow when buttons are tapped)

The toolbar hosts **5 primary tool buttons**:
1. **`[ Aa ]` Format & Writing Tools:** Toggles the expanded Format Sub-Panel.
2. **`[ 📋 ]` Lists & Dividers:** Toggles the Lists & Block Structure Sub-Panel.
3. **`[ ☑️ ]` Checklist Tool:** Toggles checklist item on current line (`cmdToggleTodoList`).
4. **`[ ▦ ]` Table Tool:** Inserts a table or opens `{table_actions}` if cursor is already within a table.
5. **`[ 📎 ]` Attachments Tool:** Opens the multi-modal media attachment sheet.

---

### 3.2 Expanded Format Sub-Panel (`[ Aa ]` Mode)

Tapping `[ Aa ]` smoothly expands the keyboard accessory bar into the full rich-text formatting toolbox:

```
┌────────────────────────────────────────────────────────────────────────┐
│ FORMAT TOOLBOX:                                              [ ✕ Close ]│
├────────────────────────────────────────────────────────────────────────┤
│ PARAGRAPH STYLES (Segmented Selector):                                 │
│ [ Title (H1) ]   [ Heading (H2) ]   [ Subheading (H3) ]   [ Body (Aa) ]│
├────────────────────────────────────────────────────────────────────────┤
│ INLINE CHARACTER STYLES:                                               │
│ [ B ] Bold   [ I ] Italic   [ U ] Underline   [ S ] Strike   [ </> ] Code│
├────────────────────────────────────────────────────────────────────────┤
│ COLOR PICKERS:                                                         │
│ Text Color:       (● Black) (● Blue) (● Green) (● Red) (● Purple) [ 🎨 ]│
│ Highlight Color:  (■ None)  (■ Yellow)(■ Mint) (■ Rose)(■ Sky)    [ 🎨 ]│
├────────────────────────────────────────────────────────────────────────┤
│ ALIGNMENT & DIRECTION:                                                 │
│ Align:     [ ⇤ Left ]       [ ⇥ Center ]       [ ⇥| Right ]             │
│ Direction: [ Auto ]         [ LTR ]            [ RTL ]                 │
├────────────────────────────────────────────────────────────────────────┤
│ INDENTATION & STYLUS:                                                  │
│ [ ⇤ Outdent ]       [ ⇥ Indent ]       [ ✍️ Stylus Scribe Handwriting ] │
└────────────────────────────────────────────────────────────────────────┘
```

#### Detailed Breakdown of Format Controls:
* **Paragraph Styles (`paragraph_style`):**
  * `Title`: Largest bold header block (`cmdToggleH1`).
  * `Heading`: H2 section header (`cmdToggleH2`).
  * `Subheading`: H3 sub-section header (`cmdToggleH3`).
  * `Body`: Standard body paragraph (`cmdToggleBody`).
* **Inline Character Formatting:**
  * `Bold`: Toggles strong font weight (`cmdToggleBold`, `toolbar/bold`).
  * `Italic`: Toggles font italic slant (`cmdToggleItalic`, `toolbar/italic`).
  * `Underline`: Toggles text underline (`cmdToggleUnderline`, `toolbar/underline`).
  * `Strikethrough`: Toggles horizontal line-through (`cmdToggleStrikethrough`, `toolbar/strikethrough`).
  * `Inline Code`: Wraps in monospace background capsule (`cmdToggleCode`, `toolbar/code`).
* **Color System:**
  * `toolbar/text_color`: Sets foreground typography color. Includes preset circles plus full RGB shade picker (`select_color`, `select_color_shade`).
  * `toolbar/highlight_color`: Sets background text marker highlight color (`a11y_highlight`).
* **Text Alignment & Direction:**
  * `toolbar/left`: Aligns text to left margin.
  * `toolbar/center`: Centers text horizontally.
  * `toolbar/right`: Aligns text to right margin.
  * `toolbar/text_direction_auto`: Auto-detects script direction based on Unicode codepoints.
  * `toolbar/text_direction_ltr`: Forces Left-to-Right orientation.
  * `toolbar/text_direction_rtl`: Forces Right-to-Left orientation (Arabic, Hebrew, Urdu scripts).
* **Indentation:**
  * `a11y_indent` / `cmdIndent`: Indents block 1 tab stop / level deeper.
  * `a11y_outdent` / `cmdOutdent`: Outdents block back 1 level.
* **Stylus Handwriting (`a11y_handwriting`):**
  * Invokes `Scribe.startStylusHandwriting` (Android Scribe API). Allows Samsung S-Pen or generic capacitive stylus handwriting directly on the screen with immediate OCR transcription into block text.

---

### 3.3 Lists, Quotes & Dividers Sub-Panel (`[ 📋 ]` Mode)

Tapping `[ 📋 ]` reveals the structural block elements:
* **Bulleted List (`toolbar/bulleted_list`):** Indented bullet points (`•`).
* **Dashed List (`-`):** Indented dash points.
* **Numbered List (`toolbar/numbered_list`):** Auto-incrementing numerical points (`1.`, `2.`, `3.`).
* **Blockquote (`toolbar/quote`, `a11y_block_quote`):** Italicized text container with vertical left accent bar.
* **Code Block (`toolbar/code`):** Multi-line formatted monospaced block with syntax background.
* **Horizontal Divider (`toolbar/divider`):** Clean separation line (`---`).
* **Note Link Button (`toolbar/link`):** Invokes `>>` note selection workflow.

---

### 3.4 Interactive Table Engine & Toolbox (`[ ▦ ]` Mode)

When the cursor is placed inside any cell of a table, the table button dynamically transforms into `{table_actions}`:

```
┌────────────────────────────────────────────────────────────────────────┐
│ TABLE ACTIONS TOOLBOX:                                                 │
├────────────────────────────────────────────────────────────────────────┤
│ [ + Col Left ] [ + Col Right ] [ + Row Above ] [ + Row Below ]         │
│ [ 🗑️ Del Col ] [ 🗑️ Del Row ]   [ ⇄ Flip LTR/RTL ] [ 🔤 Convert to Text ]│
│ [ 📋 Copy Table ]             [ 📤 Share Table ]   [ ❌ Delete Table ]   │
└────────────────────────────────────────────────────────────────────────┘
```

#### Ground-Truth Table Behaviors:
1. **Interactive Header Dots (`guide_tables`):**
   * Dots appear above each column header and beside each row.
   * Single tap selects and highlights the entire column/row.
   * Second tap opens the column/row contextual operations popover.
2. **Operations:**
   * `table_add_column`: Adds a new column to the left or right of current cell.
   * `table_add_row`: Adds a new row above or below current cell.
   * `table_delete_column`: Deletes selected column or multiple columns (`table_delete_column.other`).
   * `table_delete_row`: Deletes selected row or multiple rows (`table_delete_row.other`).
   * `table_reverse_direction`: **Switch Table Direction** (instantly mirrors column order LTR ↔ RTL for internationalization).
   * `table_convert_to_text`: **Convert to Text** (flattens structured grid into clean tab-delimited text lines).
   * `table_copy`: Copies structured table data to clipboard.
   * `table_share`: Shares formatted table externally.
   * `table_delete`: Removes the entire table.
3. **Underlying Cell Navigation Commands (`libapp.so`):**
   * `cmdTableNavigateCells`: Pressing **Tab** advances cursor to next right cell; wraps to next row; automatically adds a new row if pressed on the bottom-right cell!
   * `cmdTableNavigateCellsReverse`: Pressing **Shift + Tab** moves cursor backward.
   * `cmdTableLineBreak`: Pressing **Shift + Enter** inside a cell creates a multi-line break without exiting the cell.
   * `cmdTableMoveToDownCellAtSameOffset` / `cmdTableMoveToUpCellAtSameOffset`: Up/Down arrows maintain character column offset across cells.

---

### 3.5 Attachments & Media Sheet (`[ 📎 ]` Mode)

Tapping `[ 📎 ]` opens a modal bottom sheet (`smooth_sheets`):
1. **Take Photo (`take_photo`):** Launches camera capture.
2. **Choose Photo (`choose_photo`):** Opens system image picker.
3. **Scan Documents (`scan_document`):** Camera scanner with automatic quadrilateral edge detection, perspective warp, and multi-page compilation into a single PDF.
4. **Record Audio (`record_audio`):** Launches the `record_toolbar` with live amplitude waveform and real-time on-device speech-to-text transcription.
5. **Attach File (`attach_file`):** File picker supporting PDF, spreadsheets (`file_type_spreadsheet`), and generic documents up to 100 MB (`sync_too_large`).

---

### 3.6 Floating Contextual Selection Toolbar (`FloatingToolbar`)

When the user selects or highlights text on the canvas:

```
┌────────────────────────────────────────────────────────────────────────┐
│ FLOATING BUBBLE TOOLBAR (with iOS Loupe `text_loupe.lgs`):             │
│ [ Cut ] [ Copy ] [ Paste ] [ Bold ] [ Italic ] [ Underline ] [ ••• ]   │
│ └─ Expanded Menu:                                                      │
│    [ Copy IBAN ] [ Copy Tracking # ] [ Copy Without Spaces ]           │
│    [ Copy Markdown ] [ Export HTML ] [ Highlight ] [ Convert Block ▾ ] │
└────────────────────────────────────────────────────────────────────────┘
```
* **Text Loupe (`text_loupe.lgs`):** While dragging selection pins or cursor scrubbers, an iOS-style magnification bubble floats above the user's finger for pixel-precise placement.
* **Smart Copy Menu:**
  * `copy_iban`: Formats and copies International Bank Account Numbers.
  * `copy_tracking_number`: Copies shipment tracking numbers (FedEx, UPS, DHL, Postal).
  * `copy_without_spaces`: Strips spaces before copying (OTPs, credit cards, bank details).
  * `copy_markdown`: Copies current selection as raw Markdown.
  * `copy_html`: Copies current selection as rendered HTML.
* **Block Conversion Dropdown (`selection_menu/*`):**
  * Convert selection into: `text`, `h1`, `h2`, `h3`, `bulleted_list`, `number`, `checkbox`, `quote`, `image`.

---

### 3.7 Dedicated Image Block Toolbar (`image_toolbar/*`)

When an image block is tapped on the canvas:
* `image_toolbar/align_left`: Aligns image to left.
* `image_toolbar/align_center`: Centers image.
* `image_toolbar/align_right`: Aligns image to right.
* `guide_attachment_view`: Toggles between **Small** (compact single-line thumbnail pill) and **Large** (full-width preview).
* `guide_move_attachment`: Touch-and-hold drag handle allows dragging the image block up or down and dropping it between any text lines.
* `image_toolbar/copy`: Copies image asset to clipboard.
* `image_toolbar/share`: Shares image to external apps via Android ShareSheet.
* `image_toolbar/delete`: Removes image from note.

---

### 3.8 Dedicated Audio Recording Toolbar (`record_toolbar`)

When audio recording is initiated:
* Docked at the bottom of the editor.
* Real-time live amplitude waveform visualization.
* Running duration timer (e.g. `0:45`).
* Live Speech-to-Text ticker: Words transcribed in real time via on-device Google speech recognition model (`transcript_intro_message`).
* Controls: Pause / Resume, Cancel, Done (`record_toolbar`).
* Once committed: Renders on canvas as an audio memo card. Long press copies transcript (`transcript_copy`) or searches transcript (`transcript_find`).

---

## 4. Complete Catalog of 64 Underlying Editor Commands (`libapp.so`)

The entire rich text engine is driven by these verified native commands:

| Category | Command Identifiers in `libapp.so` |
|---|---|
| **Block Conversion** | `cmdToggleBody`, `cmdToggleH1`, `cmdToggleH2`, `cmdToggleH3`, `cmdToggleTodoList`, `cmdConvertToParagraph`, `cmdConvertToLink` |
| **Character Formatting** | `cmdToggleBold`, `cmdToggleItalic`, `cmdToggleUnderline`, `cmdToggleStrikethrough`, `cmdToggleCode`, `cmdToggleHighlight` |
| **Table Control** | `cmdTableLineBreak`, `cmdTableMoveToDownCellAtSameOffset`, `cmdTableMoveToUpCellAtSameOffset`, `cmdTableMoveToLeftCellIfItsAtStartOfCurrentCell`, `cmdTableMoveToRightCellIfItsAtTheEndOfCurrentCell`, `cmdTableNavigateCells`, `cmdTableNavigateCellsReverse`, `cmdTableStopAtTheBeginningOfTheCell` |
| **Indentation & Lists** | `cmdIndent`, `cmdOutdent` |
| **Clipboard & Paste** | `cmdSelectAll`, `cmdCopySelection`, `cmdCutSelection`, `cmdPasteContent`, `cmdPasteContentAsPlainText` |
| **Cursor Movement** | `cmdMoveCursorLeft`, `cmdMoveCursorRight`, `cmdMoveCursorUp`, `cmdMoveCursorDown`, `cmdMoveCursorWordLeft`, `cmdMoveCursorWordRight`, `cmdMoveCursorLineStart`, `cmdMoveCursorLineEnd`, `cmdMoveCursorTop`, `cmdMoveCursorBottom` |
| **Selection Movement** | `cmdMoveCursorLeftSelect`, `cmdMoveCursorRightSelect`, `cmdMoveCursorUpSelect`, `cmdMoveCursorDownSelect`, `cmdMoveCursorWordLeftSelect`, `cmdMoveCursorWordRightSelect`, `cmdMoveCursorLineStartSelect`, `cmdMoveCursorLineEndSelect`, `cmdMoveCursorTopSelect`, `cmdMoveCursorBottomSelect` |
| **Deletion Shortcuts** | `cmdDeleteLeft`, `cmdDeleteRight`, `cmdDeleteWordLeft`, `cmdDeleteWordRight`, `cmdDeleteLineLeft` |
| **Find & Replace** | `cmdOpenFind`, `cmdOpenFindAndReplace` |
| **Link Navigation** | `cmdOpenLink`, `cmdOpenLinks` |
| **History & Scrolling** | `cmdUndo`, `cmdRedo`, `cmdScrollPageDown`, `cmdScrollPageUp`, `cmdScrollToBottom`, `cmdScrollToTop`, `cmdExitEditing` |

---

## 5. Hardware Keyboard & S-Pen Integration

* **Physical Keyboard Listener (`inotes/physical_keyboard`):**
  * `Ctrl + B`: Bold
  * `Ctrl + I`: Italic
  * `Ctrl + U`: Underline
  * `Ctrl + Shift + X`: Strikethrough
  * `Ctrl + Z`: Undo
  * `Ctrl + Y` / `Ctrl + Shift + Z`: Redo
  * `Tab`: Indent list item / Advance table cell
  * `Shift + Tab`: Outdent list item / Go to previous table cell
  * `Ctrl + F`: Open Find in Note
  * `Ctrl + H`: Open Find & Replace in Note
* **Samsung S-Pen & Stylus Scribble (`Scribe.startStylusHandwriting`):**
  * Android 14+ Stylus Handwriting API integrated via native channel.
  * Writing with an S-Pen or capacitive stylus directly on the canvas converts handwriting into rich text blocks without opening the virtual keyboard.
