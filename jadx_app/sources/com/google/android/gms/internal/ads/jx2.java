package com.google.android.gms.internal.ads;

import androidx.biometric.BiometricManager;

/* JADX INFO: loaded from: classes.dex */
public final class jx2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f11546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11549d;

    public jx2(byte[] bArr) {
        this.f11546a = bArr;
        this.f11547b = bArr.length;
    }

    public final boolean a() {
        int i10 = (this.f11546a[this.f11548c] & 255) >> this.f11549d;
        c(1);
        return 1 == (i10 & 1);
    }

    public final int b(int i10) {
        int i11 = this.f11548c;
        int i12 = i11 + 1;
        int iMin = Math.min(i10, 8 - this.f11549d);
        byte[] bArr = this.f11546a;
        int i13 = ((bArr[i11] & 255) >> this.f11549d) & (BiometricManager.Authenticators.BIOMETRIC_WEAK >> (8 - iMin));
        while (iMin < i10) {
            i13 |= (bArr[i12] & 255) << iMin;
            iMin += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        c(i10);
        return i14;
    }

    public final void c(int i10) {
        int i11;
        int i12 = i10 / 8;
        int i13 = this.f11548c + i12;
        this.f11548c = i13;
        int i14 = (i10 - (i12 * 8)) + this.f11549d;
        this.f11549d = i14;
        if (i14 > 7) {
            i13++;
            this.f11548c = i13;
            i14 -= 8;
            this.f11549d = i14;
        }
        boolean z10 = false;
        if (i13 >= 0 && (i13 < (i11 = this.f11547b) || (i13 == i11 && i14 == 0))) {
            z10 = true;
        }
        up2.f(z10);
    }
}
