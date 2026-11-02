# 01. Target APK Stack & Framework Analysis

> **Target Package:** `com.inotesapp.inotes`  
> **Source Files:** [`base.apk`](file:///D:/0/dusrel/notes/file-apk/base.apk), [`split_config.arm64_v8a.apk`](file:///D:/0/dusrel/notes/file-apk/split_config.arm64_v8a.apk)  
> **Tool Used:** REA (Reverse Engineer Anything) MCP & Binary Inspection  
> **Date:** 2026-11-01  

---

## 1. Executive Summary

`com.inotesapp.inotes` is a modern, high-performance note-taking Android application built using the **Flutter framework (Dart AOT)**. It utilizes the **Android App Bundle (AAB / Split APK)** delivery model and stores all user data locally via **ObjectBox** (a high-speed NoSQL embedded C++ database engine).

---

## 2. REA MCP Ground Truth Verification

### A. Engine & Build Architecture (`identify_flutter_build`)
* **Framework:** Flutter
* **Detection Status:** `flutter_detected: true`
* **Target ABI:** `arm64-v8a` (64-bit ARM)
* **Dart Snapshot Hash:** `0451907c2eaa8467e848c0067bfe8ed4`
* **Toolchain:** Clang 19.0.1 (LLVM toolchain based on `r530567e`)
* **Flutter Engine GNU Build ID:** `4aaf535c0e422061c5fcfe5be3e1cc90d44cc1ee`

### B. Core Native Binaries (`lib/arm64-v8a/`)
* **`libapp.so` (18.8 MB):** Contains the complete compiled application logic:
  * `_kDartSnapshotText`: 13.6 MB (13,650,960 bytes) of compiled ARM64 machine code instructions.
  * `_kDartSnapshotData`: 5.0 MB (5,061,776 bytes) of serialized Dart isolate heap objects.
* **`libflutter.so` (11.8 MB):** The Flutter C++ rendering engine.
* **`libobjectbox-jni.so`:** Native C++ JNI bridge for ObjectBox embedded database.
* **`libdartjni.so`:** Official Dart-JNI interoperability bridge.
* **`libdatastore_shared_counter.so`:** Android Jetpack DataStore atomic counter bridge.

### C. Signature & Integrity (`inspect_apk_signature`)
* **Signing Schemes:** APK Signature Scheme v2 and v3 enabled.
* **Strongest Scheme:** `v3`
* **Source Stamp:** Certified Google Play Store signed release.
* **Signer Certificate SHA-256:** `2e8ca2a99a7f8984d5ffd36264650ec0767df45abb2f8a21f8a4b3a7e795e8c3`
* **Source Stamp SHA-256:** `3257d599a49d2c961a471ca9843f59d341a405884583fc087df4237b733bbd6d`

---

## 3. App Bundle Architecture Division

| Split APK Component | Size | Contents | REA Status |
| :--- | :--- | :--- | :--- |
| [`base.apk`](file:///D:/0/dusrel/notes/file-apk/base.apk) | 18.5 MB | Android Manifest, Java wrapper (`classes.dex`, `classes2.dex`), Flutter assets, fonts, JSON translations | Inspected |
| [`split_config.arm64_v8a.apk`](file:///D:/0/dusrel/notes/file-apk/split_config.arm64_v8a.apk) | 31.8 MB | Native binaries (`libapp.so`, `libflutter.so`, `libobjectbox-jni.so`) | Inspected |
| `split_config.xxhdpi.apk` | 73.5 KB | Device density graphic drawables | Pulled |
| `split_config.<lang>.apk` | ~33 KB | Language configurations (bn, en, gu, hi, kn, mr, ta, te) | Pulled |

