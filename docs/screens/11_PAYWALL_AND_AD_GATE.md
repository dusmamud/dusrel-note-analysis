# Screen 11: Paywall & Ad-Gate Bottom Sheet

> **Extracted Evidence:** `en-US.json` (`ad_gate_*`, `ad_blocker_*`), `purchases_flutter` (RevenueCat)  
> **Presentation Mode:** Modal Bottom Sheet / Interstitial Card  
> **Date:** 2026-11-01  

---

## 1. UI Layout & Component Anatomy

```
┌─────────────────────────────────────────────────────────┐
│                      (Drag Handle)                     │
│                                                         │
│                     ⭐ Notes Premium                    │
│             Ad-free · All features unlocked             │
│                                                         │
│  ✨ Unlimited Voice Recordings with Transcription       │
│  ✨ Unlimited Document Scans & PDF Compilations         │
│  ✨ Unlimited Custom Folders & Notes                    │
│  ✨ Cloud Sync with Google Drive                        │
│                                                         │
│  ┌───────────────────────────────────────────────────┐  │
│  │ Yearly Plan: $14.99 / year (7-day free trial)     │  │
│  │ Lifetime Purchase: $29.99 (Pay once, own forever) │  │
│  └───────────────────────────────────────────────────┘  │
│                                                         │
│             [ Upgrade to Premium (Primary) ]            │
│                                                         │
│  ────────────────────── OR ───────────────────────────  │
│                                                         │
│             [ 🎬 Watch a Short Ad · Use Once ]          │
│                                                         │
│  [ Restore Purchases ]                      [ Not Now ] │
└─────────────────────────────────────────────────────────┘
```

---

## 2. Monetization Triggers & Free-Tier Rules

1. **Free-Tier Limits:**
   * Daily limit on Voice recordings (`ad_gate_audio_title -> Unlimited Voice Recordings`).
   * Limit on Document scans (`ad_gate_watch_scan -> Watch Ad · Scan 1 Document`).
   * Limit on Batch exports (`ad_gate_watch_export -> Watch Ad · Export Notes`).
   * Limit on Folder creation (`ad_gate_watch_folder -> Watch Ad · Create 1 Folder`).
2. **"Watch Ad · Use Once" Reward:**
   * If free limit is reached, users can watch a short rewarded Ad to unlock the feature 1 time without paying!
3. **Ad Blocker Detection:**
   * If AdGuard, Private DNS, or AdBlocker is active, dialog prompts: *"The ad could not be loaded. An ad blocker or private DNS appears active. Turn it off or upgrade to Premium."*

