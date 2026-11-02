package com.google.android.gms.internal.auth;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class d5 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d5 f20515e = new d5(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f20517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f20518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f20519d;

    public d5(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f20516a = i10;
        this.f20517b = iArr;
        this.f20518c = objArr;
        this.f20519d = z10;
    }

    public static d5 a() {
        return new d5(0, new int[8], new Object[8], true);
    }

    public final void b(int i10, Object obj) {
        if (!this.f20519d) {
            throw new UnsupportedOperationException();
        }
        c(this.f20516a + 1);
        int[] iArr = this.f20517b;
        int i11 = this.f20516a;
        iArr[i11] = i10;
        this.f20518c[i11] = obj;
        this.f20516a = i11 + 1;
    }

    public final void c(int i10) {
        int[] iArr = this.f20517b;
        if (i10 > iArr.length) {
            int i11 = this.f20516a;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f20517b = Arrays.copyOf(iArr, i10);
            this.f20518c = Arrays.copyOf(this.f20518c, i10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof d5)) {
            return false;
        }
        d5 d5Var = (d5) obj;
        int i10 = this.f20516a;
        if (i10 == d5Var.f20516a) {
            int[] iArr = this.f20517b;
            int[] iArr2 = d5Var.f20517b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.f20518c;
            Object[] objArr2 = d5Var.f20518c;
            int i12 = this.f20516a;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f20516a;
        int i11 = i10 + 527;
        int[] iArr = this.f20517b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 * 31) + i12;
        Object[] objArr = this.f20518c;
        int i15 = this.f20516a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return (i14 * 31) + iHashCode;
    }

    public d5() {
        this(0, new int[8], new Object[8], true);
    }
}
