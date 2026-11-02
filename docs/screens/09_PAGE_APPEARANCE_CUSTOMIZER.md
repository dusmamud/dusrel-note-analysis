# Screen 09: Note Page Appearance Customizer

> **Extracted Evidence:** `en-US.json` (`page_appearance`, `guide_cover`, `guide_background`, `guide_custom_font`)  
> **Presentation Mode:** Draggable Modal Bottom Sheet from Editor Header (`•••`)  
> **Date:** 2026-11-01  

---

## 1. UI Layout & Component Anatomy

```
┌─────────────────────────────────────────────────────────┐
│                      (Drag Handle)                     │
│                     Page Appearance                     │
├─────────────────────────────────────────────────────────┤
│  PAGE COVER                                             │
│  [ None ]  [ 🖼️ Photo ]  [ 🎬 GIF ]  [ 🔗 Web Link ]   │
│                                                         │
│  BACKGROUND COLOR & BLUR                                │
│  ⚪ White   🟡 Yellow   🟢 Mint   🟣 Lavender   ⚫ OLED  │
│  Background Blur:  [ Off ]  |  [ Subtle ]  |  [ Heavy ] │
│                                                         │
│  TYPOGRAPHY & FONT FAMILY                               │
│  (•) pretenda (Default Variable TTF)                    │
│  ( ) System Default                                     │
│  ( ) Custom Imported Font                               │
│      [ ➕ Choose .ttf or .otf file ]                    │
│                                                         │
│  TEXT SIZE & SCALING (NoteTextScaler)                   │
│  A ───○──────────────────────────── A  (16 sp)          │
│  [ Reset to App Default ]                               │
│                                                         │
│  PAGE OPTIONS                                           │
│  Full Width Note:       [ Toggle ON/OFF ]               │
│  Small Attachment View: [ Toggle ON/OFF ]               │
└─────────────────────────────────────────────────────────┘
```

---

## 2. Interaction Behaviors

1. **Page Cover (`guide_cover`):**
   * Allows topping the note with a banner photo from the gallery, an animated GIF, or any direct image URL.
   * Can be repositioned vertically by dragging.
2. **Background Tint & Blur (`guide_background`):**
   * Gives individual notes their own signature mood color or blurred wallpaper.
   * Modifies card background in the feed list simultaneously.
3. **Custom Font File Import (`choose_font_file`):**
   * Opens Android SAF system file picker filtered to `.ttf` and `.otf`.
   * Dynamically loads font file via Flutter's `FontLoader` API into runtime memory without requiring app recompilation!
4. **Per-Note Text Scaling (`NoteTextScaler`):**
   * Slider adjusts note body font from 12sp (extra small) to 28sp (extra large) with immediate live preview.

