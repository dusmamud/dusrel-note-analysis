package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class mv2 implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final mv2 f13023c = new mv2(new long[0], 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f13024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13025b;

    public mv2(long[] jArr, int i10) {
        this.f13024a = jArr;
        this.f13025b = i10;
    }

    public final long a(int i10) {
        up2.i(i10, this.f13025b);
        return this.f13024a[i10];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mv2)) {
            return false;
        }
        mv2 mv2Var = (mv2) obj;
        int i10 = mv2Var.f13025b;
        int i11 = this.f13025b;
        if (i11 != i10) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (a(i12) != mv2Var.a(i12)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (int i10 = 0; i10 < this.f13025b; i10++) {
            iHashCode = (iHashCode * 31) + Long.hashCode(this.f13024a[i10]);
        }
        return iHashCode;
    }

    public final String toString() {
        int i10 = this.f13025b;
        if (i10 == 0) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(i10 * 5);
        sb2.append('[');
        long[] jArr = this.f13024a;
        sb2.append(jArr[0]);
        for (int i11 = 1; i11 < i10; i11++) {
            sb2.append(", ");
            sb2.append(jArr[i11]);
        }
        sb2.append(']');
        return sb2.toString();
    }
}
