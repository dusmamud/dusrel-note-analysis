package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class pe3 {
    public static String a(ee3 ee3Var) throws GeneralSecurityException {
        int iOrdinal = ee3Var.ordinal();
        if (iOrdinal == 0) {
            return "SHA-1";
        }
        if (iOrdinal == 1) {
            return "SHA-224";
        }
        if (iOrdinal == 2) {
            return "SHA-256";
        }
        if (iOrdinal == 3) {
            return "SHA-384";
        }
        if (iOrdinal == 4) {
            return "SHA-512";
        }
        throw new GeneralSecurityException("Unsupported hash ".concat(ee3Var.toString()));
    }
}
