# 02. Dependencies & Plugins Audit

> **Target Package:** `com.inotesapp.inotes`  
> **Source:** Decompressed `assets/flutter_assets/NOTICES.Z` (1.62 MB License Catalog)  
> **Total Detected Packages:** 302 packages  
> **Date:** 2026-11-01  

---

## 1. Core Architecture Stack

The app uses high-caliber open-source Flutter libraries. Here is the categorized mapping of the primary libraries that define the app's functionality:

### A. Rich Text & Note Editing
* **`appflowy_editor`**: Notion-style block editor. Supports rich-text formatting (bold, italics, underline, strikethrough), headings (H1, H2, H3), bullet/numbered lists, checkboxes, and inline code blocks.
* **`emoji_picker_flutter`**: Custom emoji keyboard/selector for category icons and notes.
* **`markdown`**: Markdown import/export parsing.

### B. Local Database & Persistence
* **`objectbox` & `objectbox_flutter_libs`**: Ultra-fast embedded NoSQL database engine written in C/C++. Stores all notes, categories, tags, and settings offline with instant query speeds.
* **`shared_preferences`**: Key-value storage for app settings, theme selection, and flags.

### C. Voice & Audio Notes
* **`record`**: Cross-platform audio recorder for recording voice memos directly inside notes.
* **`just_audio` & `audio_session`**: Feature-rich audio player with seekbar, background playback, and waveform playback.

### D. Document Scanner & PDF Engine
* **`cunning_document_scanner`**: Android camera document scanner for edge-detecting, scanning, and cropping paper documents.
* **`pdf` & `printing`**: Generating and exporting notes to PDF format.
* **`pdfrx` & `pdfrx_engine`**: High-performance PDF viewer inside notes.
* **`html_to_pdf`**: Web/HTML conversion to PDF.

### E. Security, Privacy & Biometrics
* **`local_auth`**: Biometric authentication (Fingerprint / Face ID / PIN / Pattern) for locking notes.
* **`encrypt` & `pointycastle`**: Cryptographic encryption for secure notes.

### F. UI Design & Theming
* **`flex_color_scheme` & `flex_seed_scheme`**: Advanced dynamic Material 3 and custom color themes (Light, Dark, OLED Black, custom accent colors).
* **`flutter_slidable`**: Swipe-to-delete, swipe-to-pin, and swipe-to-archive gestures on note cards.
* **`pull_down_button`**: iOS-style contextual menus and popups.
* **`smooth_sheets`**: Draggable bottom sheets for menus, color pickers, and settings.
* **`cupertino_icons` & `material_color_utilities`**: Native iOS & Android vector icons.

### G. Internationalization & Localization
* **`easy_localization`**: 20+ locale JSON string loader for seamless multi-language switching.
* **`intl`**: Date, time, and number formatting based on user locale.

### H. Cloud Sync, Authentication & Monetization
* **`firebase_auth` & `firebase_core`**: User authentication.
* **`google_sign_in` & `googleapis`**: Google account linking and Google Drive backup/restore.
* **`purchases_flutter`**: RevenueCat SDK for managing Pro/Premium in-app purchases and subscriptions.
* **`google_mobile_ads`**: AdMob banner, interstitial, and rewarded ad integration.

### I. Device Capabilities & Helpers
* **`image_picker`**: Selecting photos from gallery or capturing from camera.
* **`share_plus`**: Sharing notes, text, and files to external apps.
* **`url_launcher`**: Opening external hyperlinks.
* **`workmanager`**: Background scheduling for note reminders and background sync.
* **`connectivity_plus`**: Network status monitoring.
* **`permission_handler`**: Android 13+ runtime permissions (Microphone, Storage, Camera).

---

## 2. Pubspec Reconstruction Template

When setting up our clean-room Flutter project, our `pubspec.yaml` dependencies will mirror these exact packages:

```yaml
dependencies:
  flutter:
    sdk: flutter
  
  # UI & Theme
  cupertino_icons: ^1.0.8
  flex_color_scheme: ^8.0.1
  flutter_slidable: ^3.1.2
  pull_down_button: ^0.10.2
  smooth_sheets: ^0.8.0
  emoji_picker_flutter: ^3.0.0
  
  # Editor
  appflowy_editor: ^0.4.0
  
  # Storage
  objectbox: ^4.0.3
  objectbox_flutter_libs: any
  shared_preferences: ^2.3.5
  
  # Media & PDF
  record: ^5.2.0
  just_audio: ^0.9.43
  cunning_document_scanner: ^1.3.1
  pdf: ^3.11.1
  pdfrx: ^1.1.8
  image_picker: ^1.1.2
  
  # Security
  local_auth: ^2.3.0
  encrypt: ^5.0.3
  
  # Localization & Utils
  easy_localization: ^3.0.7
  intl: ^0.20.1
  share_plus: ^10.1.4
  url_launcher: ^6.3.1
  path_provider: ^2.1.5
```

