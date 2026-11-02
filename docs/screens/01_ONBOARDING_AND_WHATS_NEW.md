# Screen 01: Onboarding & "What's New in Notes"

> **Extracted Evidence:** `en-US.json` (`whats_new_*`, `guide_*`)  
> **Presentation Mode:** Spring-animated modal bottom sheet (`smooth_sheets`)  
> **Date:** 2026-11-01  

---

## 1. Screen Overview & Trigger Conditions

1. **First App Launch (Onboarding):**
   * Appears immediately on a fresh install after database initialization.
   * Welcome title: *"Everything **Notes** can do, where to find it, and how to use it."*
   * Displays an interactive interactive feature tour (Writing, Attachments, Smart Features, Personalize, Backup).
2. **Version Update ("What's New in Notes"):**
   * Triggered when `versionCode` in SharedPreferences is lower than current build.
   * Non-intrusive draggable bottom sheet with Glassmorphism blur styling.

---

## 2. UI Layout & Component Hierarchy

```
┌─────────────────────────────────────────────────────────┐
│                       (Drag Handle)                     │
│                                                         │
│                   What's New in Notes                   │
│                                                         │
│  [ ∑ ]  Math Notes                                      │
│         Perform calculations in your notes and see the  │
│         result as you type.                             │
│                                                         │
│  [ >>]  Note Links                                      │
│         Tap the link icon or type >> to link another    │
│         note. Point to headers with /.                  │
│                                                         │
│  [ 🎙 ]  Audio Transcription                             │
│         Record voice notes and see your words           │
│         transcribed as you speak.                       │
│                                                         │
│  [ 🗂 ]  Quick Bar Widget                                │
│         Start a new note, photo or scan directly from   │
│         your Home Screen.                               │
│                                                         │
│  [ 🎨 ]  Glass & Classic Style                           │
│         Enjoy a glass-inspired interface with smooth    │
│         spring animations.                              │
│                                                         │
│  ─────────────────────────────────────────────────────  │
│                [ Continue / Get Started ]               │
└─────────────────────────────────────────────────────────┘
```

---

## 3. UI/UX Interaction Behaviors

* **Spring Physics Drag:** Uses `smooth_sheets` with `ViewportRelativeSheetOffset(0.85)`. Dragging down pulls with rubber-band resistance.
* **Haptic Tap:** Tapping *"Continue"* fires `HapticFeedback.lightImpact()` and sets `has_seen_onboarding = true` in `SharedPreferences`.
* **Theme Adaptability:**
  * In **Glass Style**: Uses `BackdropFilter` with `sigmaX: 20`, `sigmaY: 20` and translucent background (`rgba(255, 255, 255, 0.7)` light, `rgba(44, 44, 46, 0.7)` dark).
  * In **Classic Style**: Uses solid iOS-style card background (`#F2F2F7` light, `#2C2C2E` dark).

