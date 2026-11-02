package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f20152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f20153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20154e;

    public zd(int i10) {
        this.f20150a = i10;
        byte[] bArr = new byte[131];
        this.f20153d = bArr;
        bArr[2] = 1;
    }

    public final void a() {
        this.f20151b = false;
        this.f20152c = false;
    }

    public final void b(int i10) {
        up2.f(!this.f20151b);
        boolean z10 = i10 == this.f20150a;
        this.f20151b = z10;
        if (z10) {
            this.f20154e = 3;
            this.f20152c = false;
        }
    }

    public final void c(byte[] bArr, int i10, int i11) {
        if (this.f20151b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f20153d;
            int length = bArr2.length;
            int i13 = this.f20154e + i12;
            if (length < i13) {
                this.f20153d = Arrays.copyOf(bArr2, i13 + i13);
            }
            System.arraycopy(bArr, i10, this.f20153d, this.f20154e, i12);
            this.f20154e += i12;
        }
    }

    public final boolean d(int i10) {
        if (!this.f20151b) {
            return false;
        }
        this.f20154e -= i10;
        this.f20151b = false;
        this.f20152c = true;
        return true;
    }
}
