# 08. Target Flutter Project Structure & Architecture Specification

> **Project Goal:** Pixel-perfect, high-performance clean-room reconstruction of Inotes App  
> **Framework:** Flutter 3.44+ (Channel Stable)  
> **Design Pattern:** Feature-First Clean Architecture with Repository Pattern  
> **Target Platforms:** Android (Phone, Tablet, Foldable), iOS ready  
> **Date:** 2026-11-01  

---

## 1. Directory Tree Architecture

```
inotes_app/
├── .github/
│   └── workflows/
│       ├── build_apk.yml              # 100% Cloud CI: lint, unit test, build debug APK
│       └── release.yml                # Automated signed release build
├── android/
│   └── app/
│       └── src/main/kotlin/.../
│           ├── MainActivity.kt        # Quick Tile, CalendarContract, Homescreen Widgets bridge
│           ├── PipelineCacheKeeper.kt # Impeller Vulkan shader cache keeper (zero jank)
│           ├── widget/                # 6 Android Homescreen Widget Providers
│           └── SquircleLayout.kt      # iOS squircle corner geometry
├── assets/
│   ├── fonts/
│   │   ├── variable.ttf               # pretenda variable typography
│   │   └── MaterialIcons-Regular.otf
│   ├── images/
│   │   └── app_logo.png               # High-res app logo
│   └── translations/
│       ├── en-US.json                 # English (829 string keys)
│       ├── hi.json                    # Hindi
│       └── ...                        # 20+ localization dictionaries
├── lib/
│   ├── core/
│   │   ├── constants/
│   │   │   ├── app_colors.dart        # Pastel card palettes & dark/light seeds
│   │   │   ├── app_dimensions.dart    # 18dp squircle radius, 16dp padding
│   │   │   └── app_typography.dart    # pretenda font family definitions
│   │   ├── database/
│   │   │   ├── objectbox.dart         # ObjectBox Store singleton initialization
│   │   │   └── objectbox-model.json   # Entity schema mapping
│   │   ├── services/
│   │   │   ├── audio_service.dart     # record & just_audio wrapper
│   │   │   ├── scanner_service.dart   # cunning_document_scanner & PDF compiler
│   │   │   ├── haptic_service.dart    # Tactile vibration triggers
│   │   │   ├── calendar_sync_service.dart # Android CalendarContract channel
│   │   │   ├── backup_service.dart    # ZIP database & media backup exporter
│   │   │   └── security_service.dart  # local_auth biometric lock & AES encryption
│   │   ├── theme/
│   │   │   ├── app_theme.dart         # flex_color_scheme setup (Light, Dark, OLED)
│   │   │   └── squircle_border.dart   # ContinuousRectangleBorder utilities
│   │   └── utils/
│   │       ├── debounce.dart          # easy_debounce for auto-saving
│   │       └── text_scaler.dart       # NoteTextScaler per-note font sizing
│   ├── features/
│   │   ├── notes/
│   │   │   ├── data/
│   │   │   │   ├── models/
│   │   │   │   │   ├── note_entity.dart        # ObjectBox @Entity Note
│   │   │   │   │   ├── folder_entity.dart      # ObjectBox @Entity Folder
│   │   │   │   │   ├── attachment_entity.dart  # ObjectBox @Entity Attachment
│   │   │   │   │   └── tag_entity.dart         # ObjectBox @Entity Tag
│   │   │   │   └── repositories/
│   │   │   │       └── notes_repository_impl.dart
│   │   │   ├── domain/
│   │   │   │   ├── entities/
│   │   │   │   └── repositories/
│   │   │   │       └── notes_repository.dart
│   │   │   └── presentation/
│   │   │       ├── controllers/
│   │   │       │   ├── notes_controller.dart   # Note CRUD, filter & search state
│   │   │       │   └── editor_controller.dart  # Active note editor state
│   │   │       ├── screens/
│   │   │       │   ├── notes_feed_screen.dart  # Responsive Grid/List (adaptive phone/tablet)
│   │   │       │   ├── note_editor_screen.dart # appflowy_editor canvas with toolbar
│   │   │       │   ├── trash_screen.dart       # Soft-deleted notes with restore/purge
│   │   │       │   └── master_detail_screen.dart # Tablet 2-pane split view
│   │   │       └── widgets/
│   │   │           ├── note_card.dart          # Slidable squircle card with pastel tints
│   │   │           ├── capture_bar.dart        # Floating 4-button quick capture pill
│   │   │           ├── editor_toolbar.dart     # Floating formatting toolbar
│   │   │           ├── audio_player_widget.dart# Waveform & seekbar audio player
│   │   │           ├── folder_selector_sheet.dart # smooth_sheets bottom sheet
│   │   │           └── math_note_overlay.dart  # Real-time math evaluation badges
│   │   ├── settings/
│   │   │   └── presentation/
│   │   │       └── settings_screen.dart        # Theme, Language, Lock, Backup, Legal
│   │   └── widgets/
│   │       └── homescreen_widget_sync.dart     # Syncs data to Android homescreen widgets
│   └── main.dart                               # EasyLocalization, ObjectBox boot, runApp
├── test/
│   ├── unit/
│   │   ├── notes_repository_test.dart
│   │   └── math_evaluator_test.dart
│   └── widget/
│       └── note_card_test.dart
└── pubspec.yaml
```

---

## 2. Package Dependency Justification Matrix

| Package | Exact Architectural Role | Performance Impact |
| :--- | :--- | :--- |
| `objectbox` | Primary offline database engine | Zero-copy memory mapped. Reads execute in <1ms without async futures blocking UI. |
| `appflowy_editor` | Block-based rich text note editor | Native Flutter widget tree with hardware-accelerated text rendering. |
| `smooth_sheets` | Spring-physics draggable modal bottom sheets | Physics-driven interactive gesture tracking with zero jank. |
| `flex_color_scheme` | Pre-calculated Light, Dark, and OLED True Black themes | Immediate theme changes without full app widget tree rebuild overhead. |
| `flutter_slidable` | Left/right swipe gesture card actions | Smooth physics gesture animations on note cards. |
| `cunning_document_scanner`| Camera edge detection & page cropping | Direct native camera processing; outputs high-res JPEG/PDF. |
| `record` + `just_audio` | Voice note recorder and waveform audio player | Low-latency audio streaming with background playback capabilities. |
| `easy_localization` | 21 language dictionaries hot-swapping | Loads only active locale JSON into memory (~45 KB footprint). |
| `local_auth` | Fingerprint, Face ID, and PIN protection | Secure Android BiometricPrompt API integration. |
| `pdf` + `pdfrx` | Exporting notes to PDF and in-note PDF preview | Fast vector-based PDF compilation and rendering. |
| `home_widget` | Syncing notes to the 6 Android homescreen widgets | Background broadcast intent updater. |

---

## 3. Responsive Breakpoint Standards

```dart
class ResponsiveLayout extends StatelessWidget {
  final Widget mobile;
  final Widget tablet;

  const ResponsiveLayout({
    super.key,
    required this.mobile,
    required this.tablet,
  });

  @override
  Widget build(BuildContext context) {
    return LayoutBuilder(
      builder: (context, constraints) {
        if (constraints.maxWidth >= 600) {
          return tablet; // Master-Detail Dual Pane View
        }
        return mobile;  // Single Pane Adaptive Feed
      },
    );
  }
}
```

This architecture ensures that our rebuild will have the exact same fluid speed, instant response, and polished tactile experience as the target app.

