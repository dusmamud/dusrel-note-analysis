package com.google.android.gms.internal.p000firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
public abstract class jb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f21618a = "0123456789abcdef".toCharArray();

    public abstract int a();

    public abstract boolean b(jb jbVar);

    public abstract int c();

    public abstract byte[] d();

    public final boolean equals(Object obj) {
        if (!(obj instanceof jb)) {
            return false;
        }
        jb jbVar = (jb) obj;
        return c() == jbVar.c() && b(jbVar);
    }

    public final int hashCode() {
        if (c() >= 32) {
            return a();
        }
        byte[] bArrD = d();
        int i10 = bArrD[0] & 255;
        for (int i11 = 1; i11 < bArrD.length; i11++) {
            i10 |= (bArrD[i11] & 255) << (i11 << 3);
        }
        return i10;
    }

    public final String toString() {
        byte[] bArrD = d();
        StringBuilder sb2 = new StringBuilder(bArrD.length * 2);
        for (byte b10 : bArrD) {
            char[] cArr = f21618a;
            sb2.append(cArr[(b10 >> 4) & 15]);
            sb2.append(cArr[b10 & 15]);
        }
        return sb2.toString();
    }
}
