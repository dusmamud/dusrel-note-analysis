package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class lv2 implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final lv2 f12585c = new lv2(0, new int[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f12586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12587b;

    public lv2(int i10, int[] iArr) {
        this.f12586a = iArr;
        this.f12587b = i10;
    }

    public final int a(int i10) {
        up2.i(i10, this.f12587b);
        return this.f12586a[i10];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lv2)) {
            return false;
        }
        lv2 lv2Var = (lv2) obj;
        int i10 = lv2Var.f12587b;
        int i11 = this.f12587b;
        if (i11 != i10) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (a(i12) != lv2Var.a(i12)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (int i10 = 0; i10 < this.f12587b; i10++) {
            iHashCode = (iHashCode * 31) + Integer.hashCode(this.f12586a[i10]);
        }
        return iHashCode;
    }

    public final String toString() {
        int i10 = this.f12587b;
        if (i10 == 0) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(i10 * 5);
        sb2.append('[');
        int[] iArr = this.f12586a;
        sb2.append(iArr[0]);
        for (int i11 = 1; i11 < i10; i11++) {
            sb2.append(", ");
            sb2.append(iArr[i11]);
        }
        sb2.append(']');
        return sb2.toString();
    }
}
