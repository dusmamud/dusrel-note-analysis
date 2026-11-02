package com.google.android.gms.internal.ads;

import androidx.biometric.BiometricManager;

/* JADX INFO: loaded from: classes.dex */
public class xd2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19054a;

    public static String a(int i10) {
        char c10 = (char) ((i10 >> 24) & BiometricManager.Authenticators.BIOMETRIC_WEAK);
        int length = String.valueOf(c10).length();
        char c11 = (char) ((i10 >> 16) & BiometricManager.Authenticators.BIOMETRIC_WEAK);
        int length2 = String.valueOf(c11).length();
        char c12 = (char) ((i10 >> 8) & BiometricManager.Authenticators.BIOMETRIC_WEAK);
        int length3 = String.valueOf(c12).length();
        char c13 = (char) (i10 & BiometricManager.Authenticators.BIOMETRIC_WEAK);
        StringBuilder sb2 = new StringBuilder(length + length2 + length3 + String.valueOf(c13).length());
        sb2.append(c10);
        sb2.append(c11);
        sb2.append(c12);
        sb2.append(c13);
        return sb2.toString();
    }

    public String toString() {
        return a(this.f19054a);
    }
}
