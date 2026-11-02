# 09. Extracted Color Palettes & Android Widget Resources

> **Target Package:** `com.inotesapp.inotes`  
> **Extracted Resources:** 88 XML Layouts, Drawables & Info files in [`assets/android_widgets/`](file:///D:/0/dusrel/notes/assets/android_widgets)  
> **Source:** Decompiled JADX XMLs + `libapp.so` Dart Snapshot Colors  
> **Date:** 2026-11-01  

---

## 1. Verified Exact Color Hex Palette

From the decompiled `res/values/colors.xml` and `libapp.so` 32-bit ARGB values, here is the exact color design system:

### A. Core Brand & Signature Colors
* **Apple Notes Golden Accent:** `#E4AF0A` (`widget_quick_note_mark: 0xFFE4AF0A`)
* **Warm Amber Header Gradient:** `#FABB00` (`widget_header_end: 0xFFFABB00`)
* **Primary Deep Black Ink:** `#2C2C2E` (`widget_new_note_ink: 0xFF2C2C2E`)
* **Note Body Text Dark:** `#3E3E3E` (`widget_page_text: 0xFF3E3E3E`)

### B. Tag & Folder Vibrant Accent Palette (Extracted from Dart Snapshot)
* **Vibrant Blue:** `#0088FF` (`0xFF0088FF`)
* **Teal / Mint:** `#00C8B3` (`0xFF00C8B3`)
* **Purple / Violet:** `#CB30E0` (`0xFFCB30E0`)
* **Coral Red:** `#FE2C54` (`0xFFFE2C54`)
* **Warm Orange:** `#FF8C27` (`0xFFFF8C27`)
* **Cyan Sky:** `#00BCF0` (`#00BCF0`)

### C. System & Surface Backgrounds
* **iOS Grouped Card Background (Light):** `#F2F2F7`
* **iOS Grouped Card Background (Secondary):** `#F2F2F2`
* **Dark Mode Paper Background:** `#39393B` (`widget_paper_dark`)
* **Dark Mode Paper Base Bottom:** `#262628` (`widget_paper_bottom_dark`)
* **OLED Black (Pure Black Theme):** `#000000`
* **Card Border Outline (Light):** `#E9E9E9`
* **System Separator Line:** `#C7C7CC`
* **Subtext & Secondary Label (Muted Gray):** `#8E8E93` (`#6C6C6C`)

---

## 2. Complete Inventory of Saved Android Widget Resources (88 Files)

All 88 files are now saved locally under [`assets/android_widgets/`](file:///D:/0/dusrel/notes/assets/android_widgets) ready to be linked into `android/app/src/main/res/`:

### A. Layouts ([`assets/android_widgets/layouts/`](file:///D:/0/dusrel/notes/assets/android_widgets/layouts))
* `widget_capture_bar.xml`: 4-button horizontal floating bar (Text, Checklist, Audio, Camera Scan)
* `widget_capture_bar_one.xml`: 1-button minimalist capture pill
* `widget_capture_bar_small.xml`: Compact variant for small grids
* `widget_note.xml`: Standard sticky note card layout
* `widget_note_compact.xml`: Compact sticky note
* `widget_note_preview.xml`: Full note preview with title & content lines
* `widget_folder.xml`: Folder view with notes list
* `widget_folder_compact.xml`: Folder list compact
* `widget_folder_preview.xml`: Folder hierarchy preview
* `widget_new_note.xml`: 1x1 quick launch launcher icon layout
* `widget_plain_page.xml`: Minimalist clean text note layout
* `widget_plain_page_small.xml`: Small clean text note layout
* `widget_edit_card.xml`: Widget configuration card editor layout

### B. Widget Provider Info Specs ([`assets/android_widgets/xml_info/`](file:///D:/0/dusrel/notes/assets/android_widgets/xml_info))
* `widget_capture_bar_info.xml`: AppWidgetProviderInfo declaring minimum width/height, resizeMode, previewImage
* `widget_folder_info.xml`: Provider metadata for folder widget
* `widget_new_note_info.xml`: Provider metadata for quick new note
* `widget_note_info.xml`: Provider metadata for single note
* `widget_plain_note_info.xml`: Provider metadata for plain note

### C. Vector Icons & Background Drawables ([`assets/android_widgets/drawables/`](file:///D:/0/dusrel/notes/assets/android_widgets/drawables))
* `ic_widget_capture_camera.xml`, `ic_widget_capture_checklist.xml`, `ic_widget_capture_record.xml`, `ic_widget_capture_scan.xml`, `ic_widget_compose.xml`
* `widget_capture_bg.xml`, `widget_capture_bg_dark.xml`, `widget_capture_bg_light.xml`
* `widget_paper.xml`, `widget_paper_dark.xml`, `widget_paper_light.xml`
* `widget_new_note_bg.xml`, `widget_new_note_bg_dark.xml`, `widget_new_note_bg_light.xml`

---

## 3. Future Project Binding Configuration

* **Planned Package ID:** `com.dusrel.inotes`
* **Planned App Name:** `Notes`
* These 88 widget files will be placed into the `android/app/src/main/res/` folder of the new project, giving our clone **100% identical Android homescreen widgets** with zero extra graphic design needed.

