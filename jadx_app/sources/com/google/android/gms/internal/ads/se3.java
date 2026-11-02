package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class se3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f15896a;

    public se3(byte[] bArr, int i10) {
        byte[] bArr2 = new byte[i10];
        this.f15896a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i10);
    }

    public static se3 a(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("data must be non-null");
        }
        int length = bArr.length;
        int length2 = bArr.length;
        if (length > length2) {
            length = length2;
        }
        return new se3(bArr, length);
    }

    public final byte[] b() {
        byte[] bArr = this.f15896a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof se3) {
            return Arrays.equals(((se3) obj).f15896a, this.f15896a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f15896a);
    }

    public final String toString() {
        byte[] bArr = this.f15896a;
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (byte b10 : bArr) {
            sb2.append("0123456789abcdef".charAt((b10 & 255) >> 4));
            sb2.append("0123456789abcdef".charAt(b10 & 15));
        }
        String string = sb2.toString();
        return com.google.android.recaptcha.internal.d.b(new StringBuilder(string.length() + 7), "Bytes(", string, ")");
    }
}
