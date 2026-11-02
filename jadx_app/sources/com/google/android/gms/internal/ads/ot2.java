package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ot2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f13973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13977e = 0;

    public ot2(byte[] bArr, int i10, int i11) {
        this.f13973a = bArr;
        this.f13975c = i10;
        this.f13976d = i10;
        this.f13974b = i11;
        i();
    }

    public final void a() {
        int i10 = this.f13977e + 1;
        this.f13977e = i10;
        if (i10 == 8) {
            this.f13977e = 0;
            int i11 = this.f13976d;
            this.f13976d = i11 + (true == h(i11 + 1) ? 2 : 1);
        }
        i();
    }

    public final void b(int i10) {
        int i11 = this.f13976d;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.f13976d = i13;
        int i14 = (i10 - (i12 * 8)) + this.f13977e;
        this.f13977e = i14;
        if (i14 > 7) {
            this.f13976d = i13 + 1;
            this.f13977e = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 > this.f13976d) {
                i();
                return;
            } else if (h(i11)) {
                this.f13976d++;
                i11 += 2;
            }
        }
    }

    public final boolean c(int i10) {
        int i11;
        int i12 = this.f13976d;
        int i13 = i10 / 8;
        int i14 = i12 + i13;
        int i15 = (this.f13977e + i10) - (i13 * 8);
        if (i15 > 7) {
            i14++;
            i15 -= 8;
        }
        while (true) {
            i12++;
            i11 = this.f13974b;
            if (i12 > i14 || i14 > i11) {
                break;
            }
            if (h(i12)) {
                i14++;
                i12 += 2;
            }
        }
        if (i14 >= i11) {
            return i14 == i11 && i15 == 0;
        }
        return true;
    }

    public final boolean d() {
        int i10 = this.f13973a[this.f13976d] & (128 >> this.f13977e);
        a();
        return i10 != 0;
    }

    public final int e(int i10) {
        int i11;
        byte[] bArr;
        this.f13977e += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f13977e;
            int i13 = 2;
            bArr = this.f13973a;
            if (i11 <= 8) {
                break;
            }
            int i14 = i11 - 8;
            this.f13977e = i14;
            int i15 = this.f13976d;
            i12 |= (bArr[i15] & 255) << i14;
            if (true != h(i15 + 1)) {
                i13 = 1;
            }
            this.f13976d = i15 + i13;
        }
        int i16 = this.f13976d;
        int i17 = i12 | ((bArr[i16] & 255) >> (8 - i11));
        int i18 = 32 - i10;
        if (i11 == 8) {
            this.f13977e = 0;
            this.f13976d = i16 + (true != h(i16 + 1) ? 1 : 2);
        }
        int i19 = ((-1) >>> i18) & i17;
        i();
        return i19;
    }

    public final int f() {
        int iG = g();
        int i10 = iG % 2;
        return ((iG + 1) / 2) * (i10 == 0 ? -1 : 1);
    }

    public final int g() {
        int i10 = 0;
        while (!d()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? e(i10) : 0);
    }

    public final boolean h(int i10) {
        int i11 = i10 - 2;
        if (this.f13975c > i11 || i10 >= this.f13974b) {
            return false;
        }
        byte[] bArr = this.f13973a;
        return bArr[i10] == 3 && bArr[i11] == 0 && bArr[i10 + (-1)] == 0;
    }

    public final void i() {
        int i10;
        int i11 = this.f13976d;
        boolean z10 = false;
        if (i11 >= 0 && (i11 < (i10 = this.f13974b) || (i11 == i10 && this.f13977e == 0))) {
            z10 = true;
        }
        up2.f(z10);
    }
}
