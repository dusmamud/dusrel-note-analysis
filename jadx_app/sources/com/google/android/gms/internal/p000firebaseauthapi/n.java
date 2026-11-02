package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.InvalidAlgorithmParameterException;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class n {
    public static String a(String str) {
        if (str.toLowerCase(Locale.US).startsWith("android-keystore://")) {
            return str.substring(19);
        }
        throw new IllegalArgumentException("key URI must start with android-keystore://");
    }

    public static void b(int i10) throws InvalidAlgorithmParameterException {
        if (i10 != 16 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i10 << 3)));
        }
    }
}
