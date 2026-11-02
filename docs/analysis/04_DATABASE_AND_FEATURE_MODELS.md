# 04. Decompiled Database, Models & Features

> **Target Package:** `com.inotesapp.inotes`  
> **Source 1:** Orgo AI VPS JADX Decompilation of `/root/jadx_out/sources/com/inotesapp/inotes/` (12,159 classes)  
> **Source 2:** Extracted Dart symbols from `libapp.so` & `en-US.json`  
> **Date:** 2026-11-01  

---

## 1. Verified Dart Domain Models (from `libapp.so`)

From the compiled Dart AOT symbols, the following core architecture classes exist:

### A. Note Core Models
* **`Note`**: Primary entity storing note records.
* **`NoteBlockKind`**: Enum representing rich-text blocks (Paragraph, H1, H2, H3, BulletList, NumberedList, CheckList, Quote, CodeBlock, MathBlock).
* **`NoteKind`**: Note classification enum (Standard, MathNote, QuickNote, LockedNote).
* **`NoteFontFace`**: Custom typography settings for individual notes.
* **`NoteTextScaler`**: Custom font size multiplier for note body text.
* **`NoteLinkStage`**: Deep-linking between interrelated notes (`[[Note Title]]` bidirectional links).
* **`NotePass`**: Password & salt configuration for locked notes.
* **`HTMLNoteAudioNodeParser`**: HTML/DOM parser for audio memo attachments.
* **`HTMLNoteImageNodeParser`**: HTML/DOM parser for inline image attachments.

### B. Math Notes Engine (`mathNotes`)
* **`MathLineKind`**: Mathematical expressions vs ordinary text.
* **`MathResultsMode`**: Inline evaluation mode (e.g. `125 * 4 = 500`).
* **`MathTokenKind`**: Tokens in mathematical calculation.
* **`MathValue`**: Computed numeric value.

### C. Backup & Auto-Sync Models
* **`AutoBackupEvent`**: Log of backup operations.
* **`AutoBackupFrequency`**: Enum (Daily, Weekly, On Edit, Manual).
* **`AutoBackupSeverity`**: Success, Warning, Failure logs.
* **`LocalAutoBackupFailure`**: Diagnostic errors during local backup.
* Configuration properties:
  * `autoBackupEnabled` (bool)
  * `autoBackupWifiOnly` (bool)
  * `autoBackupBatteryNoticeShown` (bool)
  * `autoBackupDisabledByEntitlement` (bool)

---

## 2. Verified UI Screens & User Flows

From `MainActivity.java` intents, widgets, and Dart symbols, these are the exact screens:

1. **`NotesListScreen` (Main Feed)**
   * Staggered card grid or linear list view.
   * Pinned notes section on top.
   * iOS-style Squircle note cards with color backgrounds.
   * Bottom bar with `foldersBottomBarNewFolder`, search, and quick capture buttons.
   * Multi-select action bar (`canTrash`, `moveToFolderSheetNewFolder`, `exportNotes`).

2. **`NoteEditorScreen` (Rich Text Note Canvas)**
   * Distraction-free editing powered by `appflowy_editor`.
   * Floating formatting toolbar (Bold, Italic, Strikethrough, Headings, Checklist).
   * Attachment menu (`editorAttachmentMenuScan`, Audio Record, Gallery, Camera).
   * Math Notes auto-calculation evaluator.
   * Lock note toggle (requires PIN/Biometric).

3. **`FolderManagementScreen` & Bottom Sheets**
   * Hierarchical folders (`canTrashChildren`, `expandedFolderIds`).
   * Custom folder icons (Emoji picker) and custom folder colors.
   * `moveToFolderSheetNewFolder` modal.

4. **`TrashScreen`**
   * Soft-deleted notes (`explicitlyTrashed`, `mediaTrash`).
   * Auto-purge notice (30 days retention).
   * 1-tap Restore or Permanent Delete.

5. **`SettingsScreen` & Vault**
   * Security & App Lock (`appLockTimeout`, `biometricLockout`, `foreignLocked`).
   * Backup & Restore (`autoBackupFrequency`, Google Drive link, ZIP export).
   * Theme customization (`flex_color_scheme` themes: Light, Dark, True Black OLED).
   * Language selector (21 locales).

6. **`AndroidHomescreenWidgets` (6 Widgets)**
   * `CaptureBarWidgetProvider`
   * `HomeWidgetProvider`
   * `FolderWidgetProvider`
   * `NewNoteWidgetProvider`
   * `NoteWidgetProvider`
   * `PlainNoteWidgetProvider`
