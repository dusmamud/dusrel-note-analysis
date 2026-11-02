# Screen 05: Folders, Tags & Trash Management

> **Extracted Evidence:** `en-US.json` (`guide_folders`, `guide_trash`, `guide_tags`), Dart symbols  
> **Date:** 2026-11-01  

---

## 1. Folders Screen (`/folders`)

```
┌─────────────────────────────────────────────────────────┐
│  [ Edit ]                   Folders                     │
├─────────────────────────────────────────────────────────┤
│  SYSTEM FOLDERS                                         │
│  [ 📝 ] All Notes                                   142 │
│  [ ⭐️ ] Pinned Notes                                  8 │
│  [ 🔒 ] Locked Notes                                 12 │
│  [ ∑ ] Math Notes                                     5 │
│                                                         │
│  CUSTOM FOLDERS                                         │
│  [ 💼 ] Work & Projects                             45  │
│  [ 🛒 ] Personal & Shopping                         28  │
│  [ 💡 ] App Ideas & Architecture                     31 │
│                                                         │
│  TAGS                                                   │
│  [ #roadmap ] [ #architecture ] [ #urgent ] [ #flutter ]│
│                                                         │
│  TRASH & ARCHIVE                                        │
│  [ 🗑️ ] Recently Deleted                              14 │
├─────────────────────────────────────────────────────────┤
│  [ ➕ New Folder ]                                       │
└─────────────────────────────────────────────────────────┘
```

### Behaviors:
* **Custom Folder Creation (`moveToFolderSheetNewFolder`):**
  * Modal dialog asks for Folder Name.
  * Pick custom **Emoji Icon** (via `emoji_picker_flutter`) or icon glyph.
  * Pick custom **Accent Color** from the pastel palette (`#0088FF`, `#00C8B3`, `#CB30E0`, `#FE2C54`, `#FF8C27`).
* **Nested Folders:** Supports parent-child folder hierarchy (`canTrashChildren`, `expandedFolderIds`).

---

## 2. Trash Screen ("Recently Deleted")

```
┌─────────────────────────────────────────────────────────┐
│  [ < Folders ]        Recently Deleted           [ Empty ]│
├─────────────────────────────────────────────────────────┤
│  ℹ️ Notes are permanently deleted after 30 days.        │
├─────────────────────────────────────────────────────────┤
│  ┌────────────────────────┐  ┌────────────────────────┐ │
│  │ Draft Outline          │  │ Old Grocery List       │ │
│  │ Deleted 2 days ago     │  │ Deleted 12 days ago    │ │
│  │ [ 18 days left ]       │  │ [ 8 days left ]        │ │
│  └────────────────────────┘  └────────────────────────┘ │
└─────────────────────────────────────────────────────────┘
```

### Behaviors:
* **Soft Delete:** Moving a note to trash sets `isTrash = true` and records `deletedAt = DateTime.now()`.
* **Auto-Purge:** Background job via `workmanager` automatically purges notes where `deletedAt > 30 days`.
* **Restore:**
  * Swipe right on trashed note card -> Restores back to original folder immediately.
* **Empty Trash:** Tapping *"Empty"* displays alert dialog: *"This action cannot be undone. Are you sure?"* -> completely deletes records and unlinks attachment files from disk.

