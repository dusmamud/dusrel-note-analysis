package com.google.android.gms.internal.p000firebaseauthapi;

import j2.g;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f22120a;

    public r(byte[] bArr, int i10) {
        byte[] bArr2 = new byte[i10];
        this.f22120a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i10);
    }

    public static r a(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("data must be non-null");
        }
        int length = bArr.length;
        if (length > bArr.length) {
            length = bArr.length;
        }
        return new r(bArr, length);
    }

    public final byte[] b() {
        byte[] bArr = this.f22120a;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return Arrays.equals(((r) obj).f22120a, this.f22120a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f22120a);
    }

    public final String toString() {
        return g.a("Bytes(", g.k(this.f22120a), ")");
    }
}
