# Prompt 7 Step 0: Screen-by-Screen UI/UX Behavior Parity Matrix
*Generated on Orgo AI VPS (blank-6091) | Target App: com.inotesapp.inotes v2.2.2 (1089)*

## 1. Global Behaviors Parity Matrix (§3)

| Behavior Domain | Target Behavior with Target Evidence File & Section | Notes Code Today file:line | Parity Status |
| :--- | :--- | :--- | :--- |
| **Transitions** | Feed card tap triggers expanding shared-element transition into editor canvas (`docs/screens/02_NOTES_FEED_SCREEN.md §2.B`, Flutter Hero shared element) | `lib/features/notes/presentation/screens/notes_feed_screen.dart:452` | **Gap** (Uses plain `MaterialPageRoute` without shared `Hero` element tag) |
| **Modal Sheets** | All primary sheets (WhatsNew, Page Appearance, Paywall, Attachment, Audio) use spring draggable sheet with drag handle and rubber-band resistance (`docs/screens/01_ONBOARDING_AND_WHATS_NEW.md §3`, `smooth_sheets ^1.3.0`) | `lib/features/onboarding/presentation/whats_new_sheet.dart:181`, `lib/features/notes/presentation/widgets/page_appearance_sheet.dart:45`, `lib/features/premium/presentation/screens/premium_sheet.dart:16` | **Gap** (`WhatsNewSheet` uses `smooth_sheets`, but `PageAppearanceSheet` and `PremiumSheet` use plain `showModalBottomSheet`) |
| **Haptic Feedback** | Light impact on Continue; tick on swipe actions; medium impact at 500ms long-press threshold; medium impact on audio record start/stop (`docs/screens/01 §3`, `docs/screens/02 §2.B`, `docs/screens/04 §1`, `docs/screens/08 §1`) | `lib/features/notes/presentation/widgets/note_card.dart:25-60`, `lib/features/notes/presentation/screens/notes_feed_screen.dart:165`, `lib/features/notes/presentation/widgets/audio_recording_modal.dart:45` | **Close** (Haptic calls exist, but long-press threshold and card swipe actions lack unified haptic strength) |
| **Motion & Springs** | Sheet physics use `BouncingSheetPhysics`; context menu elevated card scaling (`scale: 1.04`); spring physics on pin carousel (`docs/screens/01 §3`, `docs/screens/08 §1`) | `lib/features/onboarding/presentation/whats_new_sheet.dart:182`, `lib/features/notes/presentation/widgets/note_card.dart:70-95` | **Gap** (Cards are static without scaling animation on long press entry) |
| **Glass & Classic Theme** | Dual style engine with backdrop blur (`sigmaX: 16-20`) in Glass, solid opaque surfaces in Classic, gated by `Build.VERSION.SDK_INT >= 29` on Android (`docs/screens/07 §2.A`, Prompt 6 Step 0) | `lib/core/theme/app_theme_controller.dart:1-120`, `lib/features/settings/presentation/screens/style_screen.dart:6-35` | **Match / Manual-check-required** (Theme engine and gate verified in CI; optical blur smoothness requires physical device verification) |
| **State Handling** | Exact empty states, search-empty copy, loading spinner, error fail-closed, selection bar, and locked padlock hiding (`docs/screens/02 §1`, `en-US.json`) | `lib/features/notes/presentation/screens/notes_feed_screen.dart:360-440` | **Match** (Exact copy from `en-US.json` implemented and tested) |
| **Touch & Focus** | Minimum 48dp touch targets, visible keyboard focus, keyboard shortcuts (`Ctrl+Z`, `Ctrl+Y`, `Ctrl+Shift+Z`) (`docs/screens/03 §3.5`) | `lib/features/notes/presentation/screens/note_editor_screen.dart:35-50` | **Match** (`CallbackShortcuts` wired and tested) |
| **Phone & Tablet** | Responsive single-pane phone navigation and multi-column adaptive feed (`docs/screens/02 §1`) | `lib/features/notes/presentation/screens/notes_feed_screen.dart:280-320` | **Close / Manual-check-required** (Adaptive grid present; dual-pane split on 600dp+ requires manual inspection) |

---

## 2. Screen-by-Screen Parity Matrix (§4)

### Screen 01 — Onboarding and What's New (§4.1)
| Behavior | Target Evidence | Notes Code Today file:line | Parity Status |
| :--- | :--- | :--- | :--- |
| **Welcome Tour Presentation** | Spring-animated modal bottom sheet (`smooth_sheets`) with rubber-band resistance (`docs/screens/01_ONBOARDING_AND_WHATS_NEW.md §3`) | `lib/features/onboarding/presentation/welcome_tour_screen.dart:1-150` | **Gap** (Currently full-screen Scaffold instead of bottom sheet) |
| **Continue Action** | `HapticFeedback.lightImpact()` and `has_seen_onboarding` SharedPreferences persistence (`docs/screens/01 §3`) | `lib/features/onboarding/presentation/welcome_tour_screen.dart:115` | **Match** |
| **What's New Display** | Version-gated (`last_seen_version_code < 1089`), Glass/Classic variants, exact 5 target rows (`docs/screens/01 §2`) | `lib/features/onboarding/presentation/whats_new_sheet.dart:18-40` | **Match** (Uses `smooth_sheets` with exact target rows and icons) |

### Screen 02 — Notes Feed (§4.2)
| Behavior | Target Evidence | Notes Code Today file:line | Parity Status |
| :--- | :--- | :--- | :--- |
| **Card Geometry** | `ContinuousRectangleBorder` squircle at 18dp radius (`docs/screens/02 §2.A`) | `lib/features/notes/presentation/widgets/note_card.dart:73` | **Match** |
| **Swipe Actions** | Right Pin (Orange `#FF8C27`, haptic tick), Left Move (Blue `#0088FF`), Trash (Red `#FE2C54`) (`docs/screens/02 §2.B`) | `lib/features/notes/presentation/widgets/note_card.dart:28-60` | **Close** (Currently uses `accentGold` for Pin; missing orange and haptic tick on swipe trigger) |
| **Card Tap Transition** | Shared-element expansion into editor canvas (`docs/screens/02 §2.B`) | `lib/features/notes/presentation/screens/notes_feed_screen.dart:452` | **Gap** (Plain `MaterialPageRoute`, missing `Hero` wrapper on card and editor) |
| **Long Press Batch Mode** | 500ms threshold, haptic mediumImpact, `{count} Selected`, Move, Lock, Pin, Batch Export, Trash (`docs/screens/02 §2.C`) | `lib/features/notes/presentation/screens/notes_feed_screen.dart:140-230` | **Close** (Batch mode functional; long-press threshold and haptic call need harmonization) |
| **Search Engine** | Title, body, tags, attachments filtering with exact hint copy (`docs/screens/02 §1`) | `lib/features/notes/presentation/screens/notes_feed_screen.dart:210-250` | **Match** |
| **Card Badges** | Audio pill with duration, checklist progress (`{checked}/{total}`), PDF badge, locked padlock (`docs/screens/02 §2.A`) | `lib/features/notes/presentation/widgets/note_card.dart:110-180` | **Match** |
| **Quick Capture Bar** | 4 actions: Text Note, Checklist, Live Audio Modal, Scanner (`docs/screens/02 §2.D`) | `lib/features/notes/presentation/screens/notes_feed_screen.dart:310-350` | **Match** |

### Screen 03 — Note Editor Canvas (§4.3)
| Behavior | Target Evidence | Notes Code Today file:line | Parity Status |
| :--- | :--- | :--- | :--- |
| **Editor Architecture** | TextField-based editor without leaking raw formatting syntax (`docs/screens/03 §2.1`, Prompt 6 Item 1) | `lib/features/notes/presentation/screens/note_editor_screen.dart:1-949` | **Match (Honest Custom Editor)** |
| **Table Actions** | Insert/delete row/column, convert to text, copy, share, delete (`docs/screens/03 §3.4`) | `lib/features/notes/data/repositories/markdown_table_helper.dart:1-120` | **Match** |
| **Math Engine** | Suggest, Insert, Off modes; calculation evaluated on `=` trigger (`docs/screens/03 §2.2`) | `lib/features/notes/data/repositories/math_notes_engine.dart:1-90` | **Match** |
| **Find & Replace** | Pinned overlay above keyboard, match count, chevron scroll-to-match, Replace All (`docs/screens/03 §1`, `docs/screens/10`) | `lib/features/notes/presentation/widgets/find_and_replace_bar.dart:1-150` | **Match** |
| **Note Link Selector** | Typing `>>` opens floating note link selector and replaces trigger with link (`docs/screens/03 §2.2`) | `lib/features/notes/presentation/screens/note_editor_screen.dart:420-460` | **Match** |
| **Heading Collapse** | Double-tap heading collapses/expands nested content (`docs/screens/03 §2.1`) | `lib/features/notes/presentation/screens/note_editor_screen.dart` | **UNKNOWN (Blocked by TextField architecture)** |
| **Text Loupe** | Magnification bubble above finger during pin drag (`docs/screens/03 §3.5`, `text_loupe.lgs`) | Flutter `TextField` built-in `TextMagnifier` (`selection_overlay.dart`) | **Match (Built-in Platform Magnifier)** |
| **Attachment Drag Reorder** | Touch-and-hold drag handle to reorder attachments between text lines (`docs/screens/03 §3.5`) | `lib/features/notes/presentation/screens/note_editor_screen.dart` | **UNKNOWN (Blocked by TextField flat string model)** |
| **Undo / Redo Tooltip & Gesture** | Tooltip says "Hold for Redo", button must trigger Redo on long-press (`docs/screens/03 §1`) | `lib/features/notes/presentation/screens/note_editor_screen.dart:212-218` | **Wrong (Defect)** (Tooltip promises Hold for Redo, but `IconButton` lacks `onLongPress`) |
| **Auto-Save & Security** | Continuous save on keystroke (<1ms latency); locked note editing with session auth (`docs/screens/03 §1`) | `lib/features/notes/presentation/screens/note_editor_screen.dart:180-205` | **Match** |

### Screen 04 — Media, Audio, and Scanner (§4.4)
| Behavior | Target Evidence | Notes Code Today file:line | Parity Status |
| :--- | :--- | :--- | :--- |
| **Live Audio Recording Modal** | Real-time timer, amplitude waveform feedback, haptic on start/stop (`docs/screens/04 §1`) | `lib/features/notes/presentation/widgets/audio_recording_modal.dart:1-210` | **Match** |
| **Audio Memo Card & Seekbar** | Duration display, interactive seekbar that actually seeks (`just_audio`), transcript toggle (`docs/screens/04 §1`) | `lib/features/notes/presentation/widgets/audio_memo_card.dart:1-180` | **Match** |
| **Media Attachments** | Photo, file, and audio attachment records saved to disk with `AttachmentEntity` (`docs/screens/04 §1`) | `lib/features/notes/presentation/screens/note_editor_screen.dart:330-360` | **Match** |
| **Document Scanner** | Edge detection, 4-point perspective warp, and multipage PDF compilation (`docs/screens/04 §2`) | `lib/features/notes/presentation/widgets/attachment_picker_sheet.dart:85` | **Gap** (Button claims "Detect edges and scan multipage PDF" but launches plain image picker; native perspective warp is unproven) |

### Screen 05 — Folders and Trash (§4.5)
| Behavior | Target Evidence | Notes Code Today file:line | Parity Status |
| :--- | :--- | :--- | :--- |
| **System Folders & Counts** | All Notes, Pinned, Locked, Math Notes with dynamic counts (`docs/screens/05 §1`) | `lib/features/folders/presentation/screens/folders_screen.dart:1-220` | **Match** |
| **Tags Section** | Tag chips extracted from hashtags matching feed search (`docs/screens/05 §1`) | `lib/features/folders/presentation/screens/folders_screen.dart:140-175` | **Match** |
| **Custom Folder Operations** | Create, rename, delete, emoji icon, and pastel accent color (`docs/screens/05 §1`) | `lib/features/folders/presentation/screens/folders_screen.dart:180-260` | **Match** |
| **Trash Management** | Swipe right restores, swipe left deletes permanently; 30-day countdown display (`docs/screens/05 §2`) | `lib/features/folders/presentation/screens/trash_screen.dart:1-190` | **Match** |

### Screen 06 — Security and Vault (§4.6)
| Behavior | Target Evidence | Notes Code Today file:line | Parity Status |
| :--- | :--- | :--- | :--- |
| **Startup Passcode & Biometric** | Fail-closed passcode screen, PBKDF2 + AES-256 encryption (`docs/screens/06 §1`, Prompt 5) | `lib/core/security/security_service.dart:1-160`, `lib/core/security/passcode_screen.dart:1-200` | **Match** |
| **Hide in Recent Apps** | `hideInRecents` key synchronizes with Android `FLAG_SECURE` in `MainActivity.kt` (`docs/screens/06 §1`) | `lib/core/security/security_service.dart:130-150`, `android/app/.../MainActivity.kt:18-28` | **Match** |
| **Locked Note Snippet Hiding** | Plaintext snippet never rendered in feed, search, or widgets while locked (`docs/screens/06 §1`) | `lib/features/notes/presentation/widgets/note_card.dart:95-105` | **Match** |

### Screen 07 — Settings and Backup (§4.7)
| Behavior | Target Evidence | Notes Code Today file:line | Parity Status |
| :--- | :--- | :--- | :--- |
| **Settings Group Order** | 8 Groups: Premium Banner, Writing & Organizing, Sync & Storage, Security, Appearance, Writing & Calculations, Support, General (`docs/screens/07 §1`) | `lib/features/settings/presentation/screens/settings_screen.dart:450-850` | **Match** |
| **Live Settings Application** | Accent color, OLED, Glass/Classic, theme mode, language, math mode, auto-save apply immediately (`docs/screens/07 §2.A`) | `lib/core/theme/app_theme_controller.dart:40-110`, `lib/features/settings/presentation/screens/settings_screen.dart:80-160` | **Match** |
| **Honest Sync & Real Backup** | Disconnected sync row; real ZIP backup creation & restore; Workmanager daily background schedule (`docs/screens/07 §2.B`, Prompt 6 Item 3) | `lib/features/backup/data/repositories/backup_repository.dart:95-135`, `lib/features/settings/presentation/screens/settings_screen.dart:185-325` | **Match** |

### Screen 08 — Context Menus and Long-Press (§4.8)
| Behavior | Target Evidence | Notes Code Today file:line | Parity Status |
| :--- | :--- | :--- | :--- |
| **Feed Card Long-Press Menu** | Blur sigma 16, dim, haptic `mediumImpact` at 500ms, target action order (Pin, Lock, Duplicate, Move, Share, Delete) (`docs/screens/08 §1`) | `lib/features/notes/presentation/screens/notes_feed_screen.dart:135-180` | **Close** (Custom blur dialog present, needs `HapticFeedback.mediumImpact()` on 500ms long-press trigger) |
| **Folder Long-Press Menu** | Edit Folder, Move Folder, Delete Folder (`docs/screens/08 §2`) | `lib/features/folders/presentation/screens/folders_screen.dart:190-230` | **Match** |
| **Attachment Long-Press Menu** | View As (Small/Large), Copy, Cut, Save to Gallery, Delete (`docs/screens/08 §3`) | `lib/features/notes/presentation/screens/note_editor_screen.dart:365-395` | **Match** |
| **Web Link Live Preview** | Interactive live snapshot preview of URL on long-press (`docs/screens/08 §4`) | `lib/features/notes/presentation/screens/note_editor_screen.dart` | **UNKNOWN (No headless webview snapshot engine in app)** |
| **Undo Long-Press Redo** | Long-press on undo button triggers redo (`docs/screens/08 §5`) | `lib/features/notes/presentation/screens/note_editor_screen.dart:212-218` | **Wrong (Defect)** (Tooltip says "Hold for Redo", but `onLongPress` not wired) |

### Screen 09 — Page Appearance Customizer (§4.9)
| Behavior | Target Evidence | Notes Code Today file:line | Parity Status |
| :--- | :--- | :--- | :--- |
| **Sheet Presentation** | Draggable modal sheet with spring physics (`smooth_sheets`) (`docs/screens/09 §1`) | `lib/features/notes/presentation/widgets/page_appearance_sheet.dart:45` | **Gap** (Uses plain `showModalBottomSheet` instead of `smooth_sheets`) |
| **Appearance Controls** | Cover image, background tint & photo, blur levels (Off, Subtle, Heavy), typography, NoteTextScaler, custom TTF/OTF FontLoader (`docs/screens/09 §2`) | `lib/features/notes/presentation/widgets/page_appearance_sheet.dart:1-260` | **Match** |
| **Per-Note vs Global Scope** | Sheet controls clearly state per-note scope and preview live (`docs/screens/09 §2`) | `lib/features/notes/presentation/widgets/page_appearance_sheet.dart:180-240` | **Match** |

### Screen 10 — Find & Replace Overlay (§4.10)
| Behavior | Target Evidence | Notes Code Today file:line | Parity Status |
| :--- | :--- | :--- | :--- |
| **Overlay Placement & Navigation** | Floating bar above keyboard, match count `{current} of {total}`, chevron viewport scrolling, Replace All (`docs/screens/10 §1-2`) | `lib/features/notes/presentation/widgets/find_and_replace_bar.dart:1-160` | **Match** |

### Screen 11 — Paywall & Ad-Gate Sheet (§4.11)
| Behavior | Target Evidence | Notes Code Today file:line | Parity Status |
| :--- | :--- | :--- | :--- |
| **Sheet Presentation** | Draggable modal sheet with spring physics (`smooth_sheets`) (`docs/screens/11 §1`) | `lib/features/premium/presentation/screens/premium_sheet.dart:16` | **Gap** (Uses plain `showModalBottomSheet` instead of `smooth_sheets`) |
| **Content & Gate Honesty** | Prices $14.99/yr and $29.99 lifetime; honest disabled buttons pending store setup & AdMob config; zero fake unlocks (`docs/screens/11 §1-2`, Prompt 6 Item 3b) | `lib/features/premium/presentation/screens/premium_sheet.dart:40-160` | **Match** |

### Screen 12 — Widget Configurator (§4.12)
| Behavior | Target Evidence | Notes Code Today file:line | Parity Status |
| :--- | :--- | :--- | :--- |
| **Configurator Options** | Note/folder picker, Theme (Light/Dark/System), Transparency (Solid 100% / Glass 80%), Text size (`docs/screens/12 §1-2`) | `lib/features/widgets/presentation/screens/widget_configurator_screen.dart:1-180` | **Match** |
| **Locked Note Leak Prevention** | Locked notes never leak plaintext body to preferences or widget preview (`docs/screens/12 §2`, Prompt 5) | `lib/features/widgets/data/services/widget_sync_service.dart:35-55` | **Match** |

---

## 3. Immediate Action Plan & Fix Schedule

1. **Global Transitions & Feed Card Expansion (Screen 02 & Global):**
   - Wrap `NoteCard` with `Hero(tag: 'note_hero_${note.id}', child: ...)` in `note_card.dart`.
   - Wrap editor container with matching `Hero(tag: 'note_hero_${widget.note?.id ?? "new"}', child: ...)` in `note_editor_screen.dart`.
   - Update `notes_feed_screen.dart` card tap to navigate with hero expansion.
   - Fix Pin swipe action color to orange (`AppColors.tagOrange` / `#FF8C27`) and add `HapticFeedback.selectionClick()` on swipe trigger.
   - Author widget test proving `Hero` tags match and navigate.
2. **Spring Sheets Migration (Screen 09, 11 & Global):**
   - Migrate `PageAppearanceSheet` to `smooth_sheets` (`showModalSheet` with `BouncingSheetPhysics` and Glass backdrop blur).
   - Migrate `PremiumSheet` to `smooth_sheets` (`showModalSheet` with `BouncingSheetPhysics`).
   - Author widget tests verifying sheet presentation and spring physics.
3. **Editor Tooltip & Gesture Fix (Screen 03):**
   - Wire `onLongPress: () => _redo()` on the Undo button in `note_editor_screen.dart` to honor the `"Hold for Redo"` tooltip.
   - Author test in `test/editor_and_features_test.dart`.
4. **Document Scanner Honest Labeling (Screen 04):**
   - Update scanner tile label in `attachment_picker_sheet.dart` to `"Document Photo Capture"` and describe camera capture honestly.
5. **Feed Card Long-Press Haptic (Screen 08):**
   - Fire `HapticFeedback.mediumImpact()` at 500ms long-press threshold on card in `notes_feed_screen.dart`.
