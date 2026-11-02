# Screen 02: Main Notes Feed Screen

> **Extracted Evidence:** Decompiled `MainActivity.java`, `en-US.json`, `libapp.so` Dart Snapshot  
> **Route:** `/` or `/notes`  
> **Date:** 2026-11-01  

---

## 1. UI Layout & Component Anatomy

```
┌─────────────────────────────────────────────────────────┐
│  [ 📁 Folders ]              Notes           [ 🔍 ] [ ••• ]│
├─────────────────────────────────────────────────────────┤
│  [ 🔍 Search notes, tags, attachments...               ]│
├─────────────────────────────────────────────────────────┤
│  PINNED                                                 │
│  ┌────────────────────────┐  ┌────────────────────────┐ │
│  │ Project Roadmap        │  │ Math Calculations      │ │
│  │ Check wireframes...    │  │ 125 * 4 = 500          │ │
│  │ [10:45 AM] (Audio 0:34)│  │ [Yesterday]            │ │
│  └────────────────────────┘  └────────────────────────┘ │
│                                                         │
│  NOTES                                                  │
│  ┌────────────────────────┐  ┌────────────────────────┐ │
│  │ Grocery Checklist      │  │ Scanned Invoice        │ │
│  │ [✓] Milk   [ ] Bread   │  │ [ 📄 PDF 2 Pages ]     │ │
│  │ [Nov 1]                │  │ [Oct 28]               │ │
│  └────────────────────────┘  └────────────────────────┘ │
│                                                         │
│                     ┌───────────────────┐               │
│                     │ 📝  ☑️   🎙️   📷  │  (Capture)    │
│                     └───────────────────┘               │
└─────────────────────────────────────────────────────────┘
```

---

## 2. Key Components & Gestures

### A. iOS Squircle Note Cards
* **Geometry:** `ContinuousRectangleBorder` with 18dp corner radius.
* **Colors:** Cards have subtle pastel background tints or glassmorphism dark/light surfaces:
  * Default: `#FFFFFF` (Light) / `#2C2C2E` (Dark).
  * Custom tints: Yellow (`#FFF9C4`), Mint (`#C8E6C9`), Lavender (`#E1BEE7`), Peach (`#FFE0B2`), Sky (`#BBDEFB`).
* **Content Previews:**
  * Title (Bold, 1st line, max 2 lines).
  * Body snippet (Gray `#8E8E93`, max 3 lines).
  * Badges: Audio pill with duration (`0:34`), Checklist progress (`2/5 completed`), PDF attachment badge, Locked padlock.

### B. Gestures on Cards (`flutter_slidable`)
* **Swipe Right:** Reveals orange "Pin / Unpin" action with haptic tick.
* **Swipe Left:** Reveals blue "Archive / Move to Folder" and red "Trash" action.
* **Tap:** Triggers `GlassTransition` expanding card into `NoteEditorScreen`.
* **Long Press:** Enters **Multi-Select Batch Mode**.

### C. Multi-Select Batch Action Bar
* Appears when 1 or more notes are selected.
* Bottom bar replaces capture bar with actions:
  * **Move to Folder** (`moveToFolderSheetNewFolder`)
  * **Lock Notes** (PIN protection)
  * **Pin/Unpin**
  * **Batch Export** (`batch_export_done -> Exported {} notes`)
  * **Trash** (`canTrash`)

### D. Floating Quick Capture Bar
* Centered floating pill widget at bottom of screen.
* 4 Instant Action Buttons:
  1. `[ 📝 ]` -> Creates blank text note and focuses title.
  2. `[ ☑️ ]` -> Creates note with first checklist item active.
  3. `[ 🎙️ ]` -> Immediately starts live microphone recording modal.
  4. `[ 📷 ]` -> Launches document scanner / camera capture.

