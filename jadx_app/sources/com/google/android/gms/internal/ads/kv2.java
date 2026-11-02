package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class kv2 {
    public static void a(long j10, String str) {
        if (j10 >= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 17);
        sb2.append(str);
        sb2.append(" (");
        sb2.append(j10);
        sb2.append(") must be >= 0");
        throw new IllegalArgumentException(sb2.toString());
    }

    public static void b(boolean z10) {
        if (!z10) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
