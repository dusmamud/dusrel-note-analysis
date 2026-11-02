package com.google.android.gms.internal.ads;

import androidx.biometric.BiometricManager;
import io.flutter.embedding.android.KeyboardMap;

/* JADX INFO: loaded from: classes.dex */
public final class kr1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f12012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12015d;

    public kr1(byte[] bArr, int i10) {
        this.f12012a = bArr;
        this.f12015d = i10;
    }

    public final void a(pr1 pr1Var) {
        byte[] bArr = pr1Var.f14455a;
        int i10 = pr1Var.f14457c;
        this.f12012a = bArr;
        this.f12013b = 0;
        this.f12014c = 0;
        this.f12015d = i10;
        d(pr1Var.f14456b * 8);
    }

    public final int b() {
        return ((this.f12015d - this.f12013b) * 8) - this.f12014c;
    }

    public final int c() {
        up2.f(this.f12014c == 0);
        return this.f12013b;
    }

    public final void d(int i10) {
        int i11 = i10 / 8;
        this.f12013b = i11;
        this.f12014c = i10 - (i11 * 8);
        m();
    }

    public final void e() {
        int i10 = this.f12014c + 1;
        this.f12014c = i10;
        if (i10 == 8) {
            this.f12014c = 0;
            this.f12013b++;
        }
        m();
    }

    public final void f(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f12013b + i11;
        this.f12013b = i12;
        int i13 = (i10 - (i11 * 8)) + this.f12014c;
        this.f12014c = i13;
        if (i13 > 7) {
            this.f12013b = i12 + 1;
            this.f12014c = i13 - 8;
        }
        m();
    }

    public final boolean g() {
        int i10 = this.f12012a[this.f12013b] & (128 >> this.f12014c);
        e();
        return i10 != 0;
    }

    public final int h(int i10) {
        int i11;
        if (i10 == 0) {
            return 0;
        }
        this.f12014c += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f12014c;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f12014c = i13;
            byte[] bArr = this.f12012a;
            int i14 = this.f12013b;
            this.f12013b = i14 + 1;
            i12 |= (bArr[i14] & 255) << i13;
        }
        byte[] bArr2 = this.f12012a;
        int i15 = this.f12013b;
        int i16 = i12 | ((bArr2[i15] & 255) >> (8 - i11));
        int i17 = 32 - i10;
        if (i11 == 8) {
            this.f12014c = 0;
            this.f12013b = i15 + 1;
        }
        int i18 = ((-1) >>> i17) & i16;
        m();
        return i18;
    }

    public final long i(int i10) {
        if (i10 <= 32) {
            int iH = h(i10);
            String str = b32.f7042a;
            return KeyboardMap.kValueMask & ((long) iH);
        }
        int iH2 = h(i10 - 32);
        int iH3 = h(32);
        String str2 = b32.f7042a;
        return (KeyboardMap.kValueMask & ((long) iH3)) | ((((long) iH2) & KeyboardMap.kValueMask) << 32);
    }

    public final void j(byte[] bArr, int i10) {
        int i11;
        int i12 = 0;
        while (true) {
            i11 = i10 >> 3;
            if (i12 >= i11) {
                break;
            }
            byte[] bArr2 = this.f12012a;
            int i13 = this.f12013b;
            int i14 = i13 + 1;
            this.f12013b = i14;
            byte b10 = bArr2[i13];
            int i15 = this.f12014c;
            byte b11 = (byte) (b10 << i15);
            bArr[i12] = b11;
            bArr[i12] = (byte) (((bArr2[i14] & 255) >> (8 - i15)) | b11);
            i12++;
        }
        int i16 = i10 & 7;
        if (i16 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i11] & (BiometricManager.Authenticators.BIOMETRIC_WEAK >> i16));
        bArr[i11] = b12;
        int i17 = this.f12014c;
        if (i17 + i16 > 8) {
            byte[] bArr3 = this.f12012a;
            int i18 = this.f12013b;
            this.f12013b = i18 + 1;
            b12 = (byte) (b12 | ((bArr3[i18] & 255) << i17));
            bArr[i11] = b12;
            i17 -= 8;
        }
        int i19 = i17 + i16;
        this.f12014c = i19;
        byte[] bArr4 = this.f12012a;
        int i20 = this.f12013b;
        bArr[i11] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | b12);
        if (i19 == 8) {
            this.f12014c = 0;
            this.f12013b = i20 + 1;
        }
        m();
    }

    public final void k() {
        if (this.f12014c == 0) {
            return;
        }
        this.f12014c = 0;
        this.f12013b++;
        m();
    }

    public final void l(int i10) {
        up2.f(this.f12014c == 0);
        this.f12013b += i10;
        m();
    }

    public final void m() {
        int i10;
        int i11 = this.f12013b;
        boolean z10 = false;
        if (i11 >= 0 && (i11 < (i10 = this.f12015d) || (i11 == i10 && this.f12014c == 0))) {
            z10 = true;
        }
        up2.f(z10);
    }

    public kr1() {
        this.f12012a = b32.f7043b;
    }
}
