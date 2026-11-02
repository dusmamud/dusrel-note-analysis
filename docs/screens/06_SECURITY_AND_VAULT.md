# Screen 06: Security, Biometrics & Vault

> **Extracted Evidence:** `en-US.json` (`app_lock`, `guide_lock`, `guide_recovery`), `MainActivity.java`  
> **Key Libraries:** `local_auth`, `encrypt`, `pointycastle`  
> **Date:** 2026-11-01  

---

## 1. Note Lock Modal & Vault Security

```
┌─────────────────────────────────────────────────────────┐
│                      Lock This Note                     │
│                                                         │
│                      [ 🔒 Padlock ]                     │
│                                                         │
│  Choose how to protect your sensitive notes.           │
│                                                         │
│  [ • ] Use Device Biometrics (Fingerprint / Face ID)    │
│  [   ] Use Custom Note Password / PIN                   │
│                                                         │
│  Auto-Lock Timeout:                                     │
│  ( ) Immediately                                        │
│  (•) 1 minute                                           │
│  ( ) 5 minutes                                          │
│  ( ) 15 minutes                                         │
│                                                         │
│  [ Cancel ]                             [ Set Lock ]    │
└─────────────────────────────────────────────────────────┘
```

### UI/UX Behaviors:
* **AES-256 Encryption:** Locked note contents are encrypted in `ObjectBox` using `encrypt` + `pointycastle` with key derived from user password (`inotes/note_lock_kdf`).
* **Locked Note Card in Feed:**
  * Note body preview is replaced with a clean padlock icon and title. Snippet text is never rendered in memory while locked.
  * Tapping prompt triggers Android BiometricPrompt via `local_auth`.
* **Privacy in Android Recents (`applyRecentsScreenshotPolicy`):**
  * When app is sent to background, `MainActivity.java` sets Android `FLAG_SECURE` or blurs the view so sensitive notes cannot be read in the Android Recent Apps thumbnail.
* **Account Recovery Email:**
  * Allows user to verify an email address to send a recovery code if they forget their note password (`recovery_code_failed`, `guide_recovery_code`).

