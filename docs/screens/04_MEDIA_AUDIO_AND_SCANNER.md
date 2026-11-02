# Screen 04: Media, Audio Recorder & Document Scanner

> **Extracted Evidence:** `en-US.json` (`guide_voice`, `guide_scan`, `guide_transcripts`), `MainActivity.java`  
> **Key Libraries:** `record`, `just_audio`, `cunning_document_scanner`, `pdf`, `pdfrx`  
> **Date:** 2026-11-01  

---

## 1. Live Voice Recording & Audio Memo Modal

```
┌─────────────────────────────────────────────────────────┐
│                      Recording Audio                    │
│                                                         │
│                         00:42                           │
│              ▂ ▄ █ ▅ ▇ ▃ ▅ █ ▇ ▅ ▃ ▄ ▂ ▅                 │
│               (Live Audio Waveform)                     │
│                                                         │
│  "We need to test the Impeller Vulkan cache pre-loader  │
│   before deploying the APK on Android 15..."            │
│                 (Live Speech-to-Text)                   │
│                                                         │
│      [ ⏸️ Pause ]       [ ⏹️ Stop & Save ]                │
└─────────────────────────────────────────────────────────┘
```

### UI/UX Behaviors:
* **Microphone Initialization:** Handled by `record` package with `AndroidAudioSource.MIC`.
* **Real-Time Waveform:** Dynamically updates with incoming audio amplitude.
* **Live Transcription:** Words appear as text in real time while speaking. The transcript is permanently saved alongside the audio file.
* **Embedded Player Card in Note:**
  * Displays audio title, total duration (`0:42`), and interactive seekbar (`just_audio`).
  * Has a *"View Transcript"* toggle that expands/collapses the full transcribed text.
  * Haptic vibration on record start and stop (`allowHapticsAndSystemSoundsDuringRecording`).

---

## 2. Smart Document Camera Scanner

### Flow & Interactions:
1. **Camera Edge Detection:** Powered by `cunning_document_scanner`.
   * Camera viewfinder automatically detects white paper edges on desks/tables.
   * Auto-snaps photo when steady, or allows manual shutter click.
2. **Perspective Crop & Filter:**
   * User can drag corner pins to adjust 4-point perspective warp.
   * Filters: B&W Document (high contrast), Color Document, Original Photo.
3. **Multi-Page Compilation:**
   * Tap *"Add Page"* to scan subsequent pages (Page 1 of 5...).
   * Tap *"Done"* -> compiles all scanned pages into a single compressed PDF file via `pdf` package.
4. **Embedded Note View:**
   * Shows first page preview thumbnail with badge *"PDF · 3 Pages"*.
   * Tapping opens high-performance PDF viewer powered by `pdfrx`.

