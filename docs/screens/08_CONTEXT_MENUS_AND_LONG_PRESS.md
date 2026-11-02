# Screen 08: Context Menus & Long-Press Interactions

> **Extracted Evidence:** `en-US.json` (`guide_note_actions_*`, `guide_photos_how`, `guide_voice_how`, `guide_folders_how`, `guide_link_preview_*`)  
> **Package Engine:** `pull_down_button` + `smooth_sheets` + Native Haptics  
> **Date:** 2026-11-01  

---

## 1. Long-Press on a Note Card (Feed Screen)

When a user touches and holds any note card in the list or grid view:

```
┌─────────────────────────────────────────────────────────┐
│                      (Blurred Background)               │
│                                                         │
│     ┌─────────────────────────────────────────────┐     │
│     │  Meeting Notes & Action Plan                │     │
│     │  We discussed the launch timeline...        │     │
│     │  [10:45 AM] (Audio 0:34)                    │     │
│     └─────────────────────────────────────────────┘     │
│                   (Elevated Scaled Card)                │
│                                                         │
│     ┌─────────────────────────────────────────────┐     │
│     │  📌 Pin Note                        [ ⇧ ]   │     │
│     │  🔒 Lock Note                       [ 🔐 ]  │     │
│     │  📑 Duplicate Note                  [ 📋 ]  │     │
│     │  📁 Move to Folder...               [ ➡️ ]  │     │
│     │  📤 Share Note                      [ ⬆️ ]  │     │
│     │  ────────────────────────────────────────── │     │
│     │  🗑️ Delete Note (Red Text)          [ 🗑️ ]  │     │
│     └─────────────────────────────────────────────┘     │
│                     (Context Menu Pill)                 │
└─────────────────────────────────────────────────────────┘
```

### UI/UX Behaviors:
* **Haptic Trigger:** Fires `HapticFeedback.mediumImpact()` the moment the 500ms long-press threshold is reached.
* **Backdrop Blur:** Surrounding notes smoothly blur using `BackdropFilter(sigmaX: 16, sigmaY: 16)` and dim down.
* **Card Elevation:** The active card slightly scales up (`scale: 1.04`) and casts an ambient shadow.
* **Menu Actions:**
  1. **Pin Note (`pin_note`):** Pins note to top pinned section with animation.
  2. **Lock Note (`lock_note`):** Prompts for biometric / PIN and locks note.
  3. **Duplicate Note (`duplicate_note`):** Creates an exact clone copy of the note with "(Copy)" suffix.
  4. **Move to Folder (`move_to_folder`):** Opens folder picker sheet.
  5. **Share Note (`share`):** Launches system ShareSheet.
  6. **Delete (`delete`):** Moves note to Trash with animated card vanish and undo snackbar.

---

## 2. Long-Press on a Folder (Folders Screen)

* **Trigger:** Touch and hold any custom folder row.
* **Actions Shown:**
  1. ✏️ **Edit Folder:** Opens sheet to change folder name, emoji icon, or pastel accent color.
  2. 🔀 **Move Folder:** Reposition folder or place as a subfolder inside another parent.
  3. 🗑️ **Delete Folder (Red):** Option to delete folder only (moving notes to All Notes) or delete folder + its notes.

---

## 3. Long-Press on Attachments Inside the Editor

### A. Photo / Image Card
* **Actions:**
  * 👁️ **View As:** Toggle between **Small** (compact inline pill) and **Large** (full-width banner).
  * 📋 **Copy:** Copies image bytes to clipboard for pasting in other notes or external apps.
  * ✂️ **Cut:** Cuts image from document.
  * 💾 **Save to Gallery:** Downloads full-resolution image to device pictures folder.
  * 🗑️ **Delete Attachment:** Removes image from note.

### B. Audio Recording Card
* **Actions:**
  * ✏️ **Rename Recording:** Custom title for audio memo (e.g. "Client Call Interview").
  * 📝 **Copy Transcript:** Copies full speech-to-text transcript to clipboard.
  * 📤 **Share Audio:** Shares `.m4a` audio file to external apps.
  * 💾 **Save Audio File:** Exports audio to internal storage.
  * 🗑️ **Delete Recording.**

### C. Drag-and-Drop Attachment Reordering
* Touching and holding any image, audio, or PDF card lets the user **drag the card up or down** through the document and drop it onto any paragraph line!

---

## 4. Long-Press on a Web Link (`guide_link_preview`)

* **Trigger:** Touch and hold any hyperlinked text or URL.
* **Behavior:**
  * Displays an iOS-style **Interactive Web Page Preview Modal** (renders a live miniaturized snapshot of the website).
  * Menu options:
    * 🌐 **Open in Browser**
    * 📋 **Copy URL**
    * 📤 **Share Link**

---

## 5. Long-Press on Undo Button (`guide_undo_how`)

* **Tap:** Undoes the last editing action.
* **Touch and Hold:** Triggers **Redo** action, or reveals a history timeline slider!

