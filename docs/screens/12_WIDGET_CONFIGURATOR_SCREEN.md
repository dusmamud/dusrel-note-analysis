# Screen 12: Android Widget Configurator Screen

> **Extracted Evidence:** Decompiled `WidgetConfigureActivity.java`, `widget_edit_card.xml`, `colors.xml`  
> **Activity:** `com.inotesapp.inotes.widget.WidgetConfigureActivity`  
> **Date:** 2026-11-01  

---

## 1. UI Layout & Component Anatomy

```
┌─────────────────────────────────────────────────────────┐
│  [ Cancel ]             Widget Options             [ Done ]│
├─────────────────────────────────────────────────────────┤
│                     LIVE WIDGET PREVIEW                 │
│  ┌───────────────────────────────────────────────────┐  │
│  │  Project Roadmap & Goals                          │  │
│  │  1. Finalize REA binary reverse engineering...    │  │
│  │  2. Build Flutter Clean-Room scaffold...          │  │
│  │  [ Today at 10:45 AM ]                            │  │
│  └───────────────────────────────────────────────────┘  │
├─────────────────────────────────────────────────────────┤
│  CONFIGURATION OPTIONS                                  │
│                                                         │
│  Selected Note:        [ Tap to Select a Note   > ]     │
│  Selected Folder:      [ Work & Projects        > ]     │
│                                                         │
│  APPEARANCE & THEME                                     │
│  Theme:                ( ) Light   ( ) Dark   (•) System│
│  Transparency:         [ Solid 100% ]  |  [ Glass 80% ] │
│                                                         │
│  TEXT SIZE IN WIDGET                                    │
│  Size:                 [ Small ]  |  [ Medium ] | [Large│
└─────────────────────────────────────────────────────────┘
```

---

## 2. Technical Behaviors

* **Trigger:** Triggered automatically by Android OS whenever the user drags one of the 6 Inotes widgets onto their home screen.
* **Database Query:** Directly queries `ObjectBox` database in <2ms to populate the note/folder picker list.
* **Save & Broadcast:**
  * Tapping *"Done"* saves the widget settings into `SharedPreferences` with key `widget_<appWidgetId>_note_id`.
  * Calls `AppWidgetManager.updateAppWidget()` with the rendered `RemoteViews`.
  * Closes activity with `RESULT_OK` so the widget immediately renders on the home screen.

