package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes.dex */
public final class go {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f9865a = "0123456789abcdef".toCharArray();

    public static byte[] a(String str) {
        int length = str.length();
        if ((length & 1) != 0) {
            throw new IllegalArgumentException("String must be of even-length");
        }
        byte[] bArr = new byte[length >> 1];
        for (int i10 = 0; i10 < length; i10 += 2) {
            bArr[i10 / 2] = (byte) (Character.digit(str.charAt(i10 + 1), 16) + (Character.digit(str.charAt(i10), 16) << 4));
        }
        return bArr;
    }

    public static long b(double d10, DisplayMetrics displayMetrics) {
        return Math.round(d10 / ((double) displayMetrics.density));
    }
}
