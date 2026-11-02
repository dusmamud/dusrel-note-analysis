# Screen 07: Settings, Backup & Personalization

> **Extracted Evidence:** `en-US.json` (`settings_*`, `guide_theme`, `guide_backup`), `MainActivity.java`  
> **Date:** 2026-11-01  

---

## 1. Settings Screen (`/settings`)

```
┌─────────────────────────────────────────────────────────┐
│  [ < Back ]                 Settings                    │
├─────────────────────────────────────────────────────────┤
│  APPEARANCE & THEME                                     │
│  Theme:              Light  |  Dark  |  Auto (System)   │
│  Style:              [ Glassmorphism ]  |  [ Classic ]  │
│  Accent Color:       🟡  🔵  🟢  🟣  🔴  🟠              │
│  True Black (OLED):  [ Toggle ON ]                      │
│                                                         │
│  EDITOR & WRITING                                       │
│  Notes Start With:   [ Title (H1)  ▼ ]                  │
│  Default Font Size:  [ 16 sp       ▼ ]                  │
│  Custom Font:        pretenda (Variable TTF)            │
│  Auto-Check Move:    Move checked items to bottom [ ON ]│
│                                                         │
│  SECURITY & PRIVACY                                     │
│  App Lock:           [ Biometrics Enabled ]             │
│  Hide in Recents:    [ Blurred Preview ON ]             │
│                                                         │
│  BACKUP & STORAGE                                       │
│  Automatic Backup:   Daily (Local Folder)               │
│  Storage Used:       42.8 MB (Notes: 4MB, Audio: 28MB)  │
│  Export All Notes:   [ Export as ZIP Archive ]          │
│                                                         │
│  GENERAL                                                │
│  Language:           English (US)  [ 21 Available ]     │
│  What's New:         [ View Recent Features ]           │
│  About & Legal:      Version 2.2.2 (Build 1089)         │
└─────────────────────────────────────────────────────────┘
```

---

## 2. Key Settings Behaviors

### A. Glass vs Classic Theme Switcher
* **Glass Theme (`whats_new_glass`):**
  * Translucent floating app bars and bottom bars with backdrop blur (`BackdropFilter`).
  * Dynamic squircle card elevations with spring physics.
* **Classic Theme:**
  * Solid opaque Apple Notes styling with crisp borders (`#E9E9E9`).

### B. Local Automatic Backup Engine (`LocalAutoBackup`)
* Schedule options: Daily, Weekly, On Every Edit, Manual.
* Allows user to select an offline folder on internal storage (via Android SAF / `path_provider`).
* Exports a timestamped `.zip` containing:
  * `notes_database.json` / ObjectBox backup.
  * `attachments/` folder (all recorded `.m4a` audio files, `.pdf` scans, `.png` photos).
* Restoring from a backup zip imports all notes, tags, and folders with zero data loss.

### C. Language Switcher (21 Locales)
* Directly switches active locale via `easy_localization`.
* Live UI refresh with zero app restart needed.

