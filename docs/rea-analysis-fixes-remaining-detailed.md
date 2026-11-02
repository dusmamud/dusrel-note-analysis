# REA Ground-Truth Analysis: Remaining Fixes & Core Engine Specification

> **Target Package:** `com.inotesapp.inotes` v2.2.2 (Build 1089)  
> **Host Analysis Environment:** Orgo AI VPS (`blank-6091`, Ubuntu 24.04 x64, REA CLI 6.8.0, Node v22.23.4)  
> **Source Evidence:** REA MCP, `libapp.so` Dart AOT Snapshot, Decompiled JADX XMLs, `en-US.json` (and 19 locale files), `docs/screens/`, `docs/analysis/`  
> **Date:** 2026-11-02  

---

## 1. Disputed Items Re-Verification & Ground Truth

### 1.1 Accent Palette Hex Values
* **Target Evidence:** Extracted from decompiled `res/values/colors.xml` and `libapp.so` 32-bit ARGB values in `docs/analysis/09_COLOR_PALETTES_AND_WIDGET_RESOURCES.md`:
  - Gold (Apple Notes Signature Accent): `#E4AF0A`
  - Vibrant Blue: `#0088FF`
  - Teal / Mint: `#00C8B3`
  - Purple / Violet: `#CB30E0`
  - Coral Red: `#FE2C54`
  - Warm Orange: `#FF8C27`
  - Forest Green: `#34C759`
* **Status:** Ground truth verified. Replaces any previous unverified iOS standard values.

### 1.2 Paywall Plans, Pricing & Currency
* **Target Evidence:** Verified in `docs/screens/11_PAYWALL_AND_AD_GATE.md` (lines 20-27) and `en-US.json`:
  - **Yearly Plan:** `$14.99 / year` with `7-day free trial`
  - **Lifetime Purchase:** `$29.99` (`Pay once, own forever`)
  - **Monthly Plan:** **DOES NOT EXIST** in target app evidence.
  - **Currency:** USD (`$`), with dynamic Google Play / RevenueCat localized currency rendering at runtime.
  - **Ad-Gate Integration:** Proven by strings `ad_gate_watch_scan` ("Watch Ad · Scan 1 Document"), `ad_gate_watch_export` ("Watch Ad · Export Notes"), `ad_gate_watch_folder` ("Watch Ad · Create 1 Folder"), and reward button "Watch a Short Ad · Use Once".
* **Status:** Verified. Previous numbers (₹389/₹59/₹899 or $389/$59/$899) are strictly contradicted by target evidence.

### 1.3 Glass "Unsupported Device" Dialog Trigger
* **Target Evidence:**
  - Strings verified in 19 translations (`en-US.json:1101-1102`):
    - `ui_style_unsupported_title`: *"Unsupported Device"*
    - `ui_style_unsupported_message`: *"Switch to Glass anyway?"*
  - Decompiled JADX class `dev.liquidglass.liquid_glass.PipelineCacheKeeper` intercepts and restores `flutter.impeller.vkcache` (Vulkan Impeller shader cache).
  - Exact Dart runtime hardware check method signature in compiled AOT snapshot: **UNKNOWN**.
  - Documented implementation check: Check Android SDK version (`>= 29` for hardware blur / `RenderEffect`) or hardware capability; if unsupported, show adaptive alert dialog. Selecting Cancel retains Classic; selecting OK forces Glass anyway.

### 1.4 Notes Feed Batch Action Bar & Folder Edit Mode
* **Target Evidence (`docs/rea-analysis-welcome-feed-detailed.md:148-154`):**
  - Trigger: Long-press on card or "Select Notes" from `•••` action menu.
  - Header Title: Shows `"{count} Selected"`, right button: `"Select All"` / `"Deselect All"`.
  - Batch Action Bar (5 actions, replacing bottom capture bar):
    1. **Move to Folder** (`Icons.folder_outlined`)
    2. **Lock Notes** (`Icons.lock_outline`)
    3. **Pin / Unpin** (`Icons.push_pin_rounded`)
    4. **Batch Export** (`Icons.ios_share_rounded`)
    5. **Trash** (`Icons.delete_outline_rounded`, red)
  - Folder Edit Mode: Multi-select folders for batch deletion or reordering.

### 1.5 Settings Screen Group Hierarchy (8 Groups)
* **Target Evidence (`docs/rea-analysis-appearance-folders-settings-core-detailed.md:144-172`):**
  1. **Premium Banner Card:** Red-to-gold gradient card ("Upgrade to Premium").
  2. **Writing & Organizing Group:** Sort Notes By, Notes Start With, Sort Checked Items.
  3. **Sync & Storage Group:** Sync (starred row), Backup (LocalAutoBackup), Storage Breakdown.
  4. **Security & Vault Group:** App Lock (Passcode/Biometrics), Note Lock, Hide in Recents (`FLAG_SECURE`).
  5. **Appearance Row:** Dedicated row navigating to Appearance Screen.
  6. **Writing & Calculations Group:** Auto Save, Math Results Mode ("Suggest Result", "Insert Result", "Off"), Math Examples.
  7. **Support & Feedback Group:** Rate Us, Share App, App Support, Restore Purchases.
  8. **General & About Group:** Language (21 locales), What's New, About & Legal (New app package `com.dusrel.note`).

### 1.6 Billing SDK & Ad-Gate Proof
* **Target Evidence:** `purchases_flutter` (RevenueCat) in `docs/analysis/02_DEPENDENCIES_AND_PLUGINS.md` and AdMob / Google Mobile Ads SDK in manifest/jadx.
* **Ad-Gate Reward:** User can watch rewarded video ad to unlock single-use quota (Scan, Audio, Export, or Folder creation) without paying.

### 1.7 30-Day Trash Auto-Purge
* **Target Evidence:**
  - `en-US.json:168`: *"Deleted notes and folders wait here for **30 days**. Recover them, or delete them for good."*
  - `en-US.json:991`: *"Deleted notes use storage until they are permanently deleted after 30 days."*
  - Runtime execution method: Target uses timestamp comparison `trashedAt < now - 30 days` alongside optional WorkManager periodic job. Automated background scheduler vs on-open query: **UNKNOWN** in binary symbols. Implemented behavior: Query purge notes with `trashedAt < now - 30 days` upon store initialization and Trash screen display.

---

## 2. Comprehensive Item-by-Item Verification Table

| Subsystem / Item | Target REA Evidence | Notes Code Today (file:line) | Status |
| :--- | :--- | :--- | :--- |
| **textScale Unit Multiplier** | `libapp.so` variable font scaling; body text = `16.0 * textScale` | `page_appearance_sheet.dart:234` stores raw 12–28 sp into `note.textScale` | **Gap (Critical Bug)** |
| **Analyzer Suppressions** | No analyzer warnings permitted in production CI | `analysis_options.yaml:12-14` contains `deprecated_member_use: ignore` | **Wrong** |
| **App Version Single Source of Truth** | New app build identity; never display target 2.2.2/1089 | `settings_screen.dart:673` hardcodes "Build 33"; `pubspec.yaml` is `1.0.0+1` | **Wrong** |
| **Glass Dialog Gating** | Dialog shown only on unsupported hardware; OK forces Glass | `style_screen.dart:104` triggers dialog unconditionally on every Glass tap | **Gap** |
| **Storage Breakdown Honesty** | Storage computes actual file sizes for Notes, Photos, Scans, Audio | `settings_screen.dart:455-458` hardcodes `0.0 KB` constants | **Wrong** |
| **Localization Wiring** | 21 translation files with real `.tr()` calls and active locale switch | `lib/` has 0 `.tr()` calls; language selector only sets local state | **Gap** |
| **Folders Screen Tags Section** | Tags chips with counts from hashtags / Tag entities | `folders_screen.dart:180` missing dedicated Tags chip section | **Gap** |
| **Custom Font Loader** | Custom font radio with `FontLoader` or remove fake option | `page_appearance_sheet.dart:201` radio has no font file picker or loader | **Gap** |
| **Notes Feed Batch Bar Actions** | Move, Lock, Pin, Batch Export, Trash + Select All | `notes_feed_screen.dart:616` has Pin, Move, Trash; missing Lock & Batch Export | **Gap** |
| **ObjectBox Store & Models** | `libobjectbox.so` bindings, `objectbox.g.dart`, real DB queries | `note_repository_impl.dart:36` still reads/writes SharedPreferences JSON | **Gap** |
| **Rich Text Editor Blocks** | Real tables (insert/delete col/row), Undo/Redo, Math engine | `note_editor_screen.dart` has partial markdown/math; table lacks full controls | **Gap** |
| **Fail-Closed Security & PBKDF2** | AES-256-CBC, PBKDF2 key derivation, zero fallback to raw text | `security_service.dart:65` uses single SHA-256; returns raw input on error | **Gap** |
| **Media Attachments Records** | Real `AttachmentEntity` with file paths, MIME, size, audio duration | Scanner/camera saves file to disk but lacks structured DB attachment relation | **Gap** |
| **Local Auto Backup Engine** | Local daily/weekly ZIP backup, markdown & PDF export | `backup_repository.dart` does not exist | **Gap** |
| **Paywall & Gating Realism** | $14.99/yr, $29.99 lifetime; real purchase or REA ad-gate reward | `premium_screen.dart` has unverified tiers; missing Step 0 prices | **Wrong** |

---

## 3. UNKNOWN List & Evidence Gaps

1. **Exact Hardware Capability Blur Check in Dart:**
   - *Evidence Gap:* Target `libapp.so` Dart AOT snapshot does not export plaintext function names for the GPU capability test. JADX proves `PipelineCacheKeeper` manages Vulkan cache files, but whether the Dart layer checks an Android SDK version or catches a shader compile exception is **UNKNOWN**.
   - *Implemented Behavior:* Documented capability check inspecting Android SDK version (`SDK_INT >= 29` for native `RenderEffect` hardware blur support).
2. **AppFlowy Editor Compatibility with file_picker ^13.3.1:**
   - *Evidence Gap:* `appflowy_editor` published releases pin `file_picker ^10.3.10`. Version solving with `file_picker ^13.3.1` failed in CI Run #26.
   - *Status:* If no compatible version combination pub-solves cleanly on Flutter 3.44, AppFlowy cannot be introduced without breaking CI. In that case, custom blocks (rich tables, math, undo) will be implemented on the existing editor.
3. **Target Cloud Sync Provider SDK:**
   - *Evidence Gap:* `en-US.json` mentions "Sync your notes across all devices signed in to your Google account", but target binary uses Google Drive App Data Folder API via custom channel rather than standard Firebase. Cloud sync engine is marked **UNKNOWN** and remains gated behind Premium.

---

# Prompt 6 Re-Verification: Closing UNKNOWNs Honestly & Removing Fake Gates
*Date: 2026-11-02 (Executed on Orgo AI VPS blank-6091)*

## 1. Ground-Truth Analysis & Re-Verification Findings

### 1.1 Item 1: AppFlowy Editor Compatibility & Editor Positioning
- **Target Evidence:** Target app `com.inotesapp.inotes` uses rich formatting with custom spans, tables, and math evaluation.
- **Pub-Solve Proof on VPS:**
  - Ran `flutter pub get` on VPS with `appflowy_editor: any` alongside `file_picker ^13.3.1`: resolver downgraded `appflowy_editor` to obsolete `0.0.4` (from 2022).
  - Explicit constraint `appflowy_editor: ^6.2.0` fails with:
    `Because appflowy_editor >=6.1.0 depends on file_picker ^10.2.0 and project depends on file_picker ^13.3.1, appflowy_editor >=6.1.0 is forbidden.`
  - Constraint `appflowy_editor: ">=0.2.0"` fails with:
    `appflowy_editor >=0.2.0 <2.5.0 depends on intl ^0.18.0 (conflicts with flutter SDK intl 0.20.2), and >=2.4.0 <6.1.0 depends on file_picker ^8.0.2.`
- **Final Editor Position:**
  **Custom TextField-based editor, AppFlowy blocked by file_picker evidence.**
  All features (Undo & Redo, Markdown tables with row/col insert/delete, find with Replace All, math Suggest/Insert/Off, and keyboard shortcuts) are verified and maintained in `note_editor_screen.dart` and `markdown_table_helper.dart` with dedicated automated tests.

### 1.2 Item 2: Glass Capability Gate
- **Target Evidence & Defect:** `GlassCapabilityChecker.isSupported()` previously returned `true` unconditionally, rendering the "Unsupported Device" dialog unreachable.
- **Hardware Requirement:** Native hardware blur via `RenderEffect` was introduced in Android 10 (API level 29, `Build.VERSION.SDK_INT >= 29`). On non-Android platforms (iOS, macOS, Windows, Linux), hardware blur is supported natively by the OS compositor.
- **Honest Platform Implementation:**
  - `GlassCapabilityChecker` inspects platform: if not Android, returns `true`. If Android, calls the native method channel `inotes/device` (`getAndroidSdkInt`) and requires `sdkInt >= 29`.
  - On unsupported devices, the "Unsupported Device" dialog is shown: Cancel preserves Classic mode; OK forces Glass anyway. Both paths are covered with automated widget tests.

### 1.3 Item 3a: Cloud Sync Row
- **Target Evidence:** Target APK uses custom REST endpoints for Google Drive App Data Folder API (`docs/analysis/02_DEPENDENCIES_AND_PLUGINS.md`). No client ID, refresh token, or Drive OAuth scope is configured in the rebuild repository.
- **Honest Positioning:**
  - Changed Settings Sync row title to `"Cloud Sync (Not Connected)"`.
  - Subtitle updated to: `"Cloud sync is not connected yet. Only local backups and manual archives are currently enabled."`.
  - Tap opens an informative dialog explaining sync prerequisites rather than routing to `PremiumSheet`. No fake "synced" status, badge, or timestamp is rendered.

### 1.4 Item 3b: Premium Purchase and Ad Reward
- **Target Evidence:** Target APK contains RevenueCat `purchases_flutter` and AdMob ad units (`docs/screens/11_PAYWALL_AND_AD_GATE.md`).
- **Audit of Rebuild Code:** `_purchasePremium` and `_restorePurchases` showed mock snackbars. `_watchAd` simulated a 900ms delay and called `onRewardUnlocked`.
- **Honest Removal of Fake Gates:**
  - Removed simulated delay and fake reward unlocking.
  - Buttons explicitly state `"Store Purchases Disabled (Pending Store Setup)"` and `"Rewarded Ads Disabled (Pending AdMob Config)"`.
  - No features or unlimited allowances are unlocked by tapping mock actions. Real in-app purchases and ad rewards remain marked **Still UNKNOWN**.

### 1.5 Item 3c: Backup Schedule and ZIP Backup in the UI
- **Target Evidence:** Target app provides local file export and scheduled archiving.
- **Audit of Rebuild Code:** `BackupRepository` created ZIP archives in tests, but Settings only performed a plain text Share and claimed a false "Daily local backup schedule".
- **Honest Wiring:**
  - Wired real `BackupRepository` into Settings UI: "Create Local ZIP Backup" exports structured ZIP (JSON manifest + Markdown notes) to persistent application documents directory (`/backups`).
  - Added "Restore from ZIP Backup" picking a `.zip` file via `FilePicker` and validating manifest integrity.
  - Track and display persistent `last_backup_timestamp`.
  - Configured real `workmanager` periodic task registration (`backup_periodic_task`) with a `@pragma('vm:entry-point')` callback in `main.dart` for daily backup execution.

---

## 2. Prompt 6 Verification Matrix

| Target REA Evidence | Notes Code Today file:line | Match / Gap / Wrong / UNKNOWN |
| :--- | :--- | :---: |
| **AppFlowy Editor Pub Solve** | Blocked by `file_picker ^13.3.1` & `intl 0.20.2` on VPS; custom blocks real | `lib/features/notes/presentation/screens/note_editor_screen.dart:1-949` | **Match (Honest Custom Editor)** |
| **Glass Capability Gate** | Real SDK check (`Build.VERSION.SDK_INT >= 29` on Android); dialog active | `lib/features/settings/presentation/screens/style_screen.dart:6-35` | **Fixed (Real Platform Gate)** |
| **Cloud Sync Row Honesty** | Local backup only; no fake sync status or routing to paywall | `lib/features/settings/presentation/screens/settings_screen.dart:505-525` | **Fixed (Honest Disconnected State)** |
| **Paywall & Ad Gate Honesty** | No simulated delay or fake unlocks; clear disabled labels | `lib/features/premium/presentation/screens/premium_sheet.dart:180-260` | **Fixed (Zero Fake Unlocks)** |
| **ZIP Backup & Schedule UI** | Real ZIP creation to docs dir, ZIP restore, and workmanager registration | `lib/features/settings/presentation/screens/settings_screen.dart:526-560` | **Fixed (Real ZIP & Schedule)** |

