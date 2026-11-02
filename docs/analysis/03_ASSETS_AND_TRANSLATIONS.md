# 03. Assets & Localization Inventory

> **Target Package:** `com.inotesapp.inotes`  
> **Source:** Extracted from `base.apk` -> `assets/flutter_assets/`  
> **Tool Used:** REA MCP Artifact Inventory (`inspect_artifact`)  
> **Date:** 2026-11-01  

---

## 1. Visual Assets & Branding

* **App Logo:** `assets/flutter_assets/assets/images/app_logo.png`
* **Demo Assets:** `assets/flutter_assets/assets/demo.bin`

---

## 2. Typography & Fonts (`FontManifest.json`)

The target app uses modern variable typography:

1. **Primary App Font:** `pretenda`  
   * Asset Path: `fonts/variable.ttf`  
   * Type: Variable TrueType Font (scales smoothly across weights from Thin to Extra Bold).
2. **Material Icons:**  
   * Asset Path: `fonts/MaterialIcons-Regular.otf`
3. **Cupertino Icons (iOS Style):**  
   * Asset Path: `packages/cupertino_icons/assets/CupertinoIcons.ttf`

---

## 3. Localization Catalog (`easy_localization`)

The app includes 21 complete language dictionaries formatted as JSON files in `assets/flutter_assets/assets/translations/`:

| Language Code | Language | File |
| :--- | :--- | :--- |
| `en-US` | English (United States) | `en-US.json` |
| `hi` | Hindi | `hi.json` |
| `es-ES` | Spanish (Spain) | `es-ES.json` |
| `fr-FR` | French (France) | `fr-FR.json` |
| `de-DE` | German (Germany) | `de-DE.json` |
| `it-IT` | Italian (Italy) | `it-IT.json` |
| `pt-BR` | Portuguese (Brazil) | `pt-BR.json` |
| `ru-RU` | Russian | `ru-RU.json` |
| `zh-CN` | Simplified Chinese | `zh-CN.json` |
| `ja-JP` | Japanese | `ja-JP.json` |
| `ko-KR` | Korean | `ko-KR.json` |
| `ar` | Arabic (RTL) | `ar.json` |
| `id-ID` | Indonesian | `id-ID.json` |
| `ms-MY` | Malay | `ms-MY.json` |
| `th-TH` | Thai | `th-TH.json` |
| `vi-VN` | Vietnamese | `vi-VN.json` |
| `tr-TR` | Turkish | `tr-TR.json` |
| `uk-UA` | Ukrainian | `uk-UA.json` |
| `fi-FI` | Finnish | `fi-FI.json` |
| `fil-PH` | Filipino | `fil-PH.json` |

> [!TIP]
> Because these translation JSON files contain every single button label, dialog title, menu action, and error message, they act as the exact functional specification (PRD) for every single feature in the app!

