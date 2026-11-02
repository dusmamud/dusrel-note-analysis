# 06. Decompiled Native Architecture, Channels & Widgets

> **Analysis Source:** Orgo AI Linux Cloud VPS (`blank-6091`)  
> **Tool:** JADX 1.5.0 Full Decompilation of `/root/apk/base.apk` (12,159 classes decompiled)  
> **Target Package:** `com.inotesapp.inotes`  
> **Date:** 2026-11-01  

---

## 1. Native Entrypoint: `MainActivity.java`

`MainActivity` extends `FlutterFragmentActivity` and registers 19 custom `MethodChannel` bridges between Android OS and Flutter Dart:

| Channel Name | Handler / Callback | Purpose |
| :--- | :--- | :--- |
| **`inotes/quick_note`** | `QuickNoteTileService` | Android Quick Settings Pull-Down Tile (instant note taking without opening the app) |
| **`inotes/math_notes`** | Native Math Parser & Evaluator | iOS 18-style Math Notes calculation directly inside the note editor |
| **`inotes/home_widget`** | 6 Android Widget Providers | Home screen interactive widgets |
| **`inotes/note_lock_kdf`** | Cryptographic Key Derivation | Secure note encryption with password/PIN (KDF hashing) |
| **`inotes/backup_zip`** | Background ZIP Compressor | Full database + audio + image attachments export/import |
| **`inotes/calendar`** | `android.provider.CalendarContract` | Syncs note reminder dates/times directly to Android System Calendar |
| **`inotes/capture`** | `k9.v` Media Capture | High-resolution camera document scanning & photo capture |
| **`inotes/clipboard`** | `ClipboardManager` | Copy/paste rich text, images, and attachments directly into notes |
| **`inotes/share_intent`** | `deliverShare()` | Receives text, links, PDFs, and images from Android ShareSheet |
| **`inotes/recents`** | `applyRecentsScreenshotPolicy()` | Blurs/hides app preview in Android Recent Apps switcher for privacy |
| **`inotes/physical_keyboard`** | Hardware Keyboard Listener | Detects external USB/Bluetooth physical keyboards and hotkeys (Ctrl+N, Ctrl+B) |
| **`inotes/font_scale`** | `hc.a` Font Engine | Custom text scaling independent of Android system font size |
| **`inotes/review`** | `com.google.android.play.core.review` | In-app Google Play Store rating & review prompt |
| **`inotes/native_ad_events`** | `ListTileNativeAdFactory` | Native AdMob inline card rendering in notes list |
| **`inotes/edge_guard`** | `SquircleFrameLayout` | Edge-to-edge drawing with iOS-style squircle corner radius |
| **`inotes/keyboards`** | `InputMethodManager` | Real-time keyboard height detection for toolbar positioning |
| **`inotes/ad_region`** | Geo Policy Service | Compliant ad serving based on GDPR/CCPA region |
| **`inotes/device_info`** | Hardware Inspector | Device capabilities and biometric hardware check |
| **`inotes/network`** | `ConnectivityManager` | Real-time internet connectivity status |

---

## 2. Homescreen Widgets Decompiled (`com.inotesapp.inotes.widget.*`)

The app includes 6 distinct Android App Widgets:

1. **`CaptureBarWidgetProvider`**: Floating action bar on home screen with quick buttons:
   * Quick Note (Text)
   * Camera Photo
   * Voice Memo Record
   * Document Scanner
2. **`HomeWidgetProvider`**: Scrollable list of recent / pinned notes.
3. **`FolderWidgetProvider`**: Dedicated widget pinned to a specific custom folder.
4. **`NewNoteWidgetProvider`**: Single 1x1 quick note launcher icon.
5. **`NoteWidgetProvider`**: Single sticky note displayed directly on the home screen.
6. **`PlainNoteWidgetProvider`**: Minimalist, distraction-free sticky note.
7. **`WidgetConfigureActivity`**: Configuration screen when adding a widget (pick theme, folder, note, transparency).

---

## 3. Custom Native Views

* **`SquircleFrameLayout.java`**: Custom Android ViewGroup that calculates true iOS squircle corner curvature for note cards and modal dialogs.
* **`QuickNoteTileService.java`**: Android Quick Settings tile that opens an instant overlay for fast thought capture.

