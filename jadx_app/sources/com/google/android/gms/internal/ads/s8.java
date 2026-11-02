package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class s8 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long[] f15747d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f15748a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15750c;

    public static long b(byte[] bArr, int i10, boolean z10) {
        long j10 = ((long) bArr[0]) & 255;
        if (z10) {
            j10 &= ~f15747d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (((long) bArr[i11]) & 255);
        }
        return j10;
    }

    public final long a(u4 u4Var, boolean z10, boolean z11, int i10) throws IOException {
        int i11;
        int i12 = this.f15749b;
        byte[] bArr = this.f15748a;
        if (i12 == 0) {
            if (!u4Var.f(bArr, 0, 1, z10)) {
                return -1L;
            }
            int i13 = bArr[0] & 255;
            int i14 = 0;
            while (true) {
                if (i14 >= 8) {
                    i11 = -1;
                    break;
                }
                i11 = i14 + 1;
                if ((f15747d[i14] & ((long) i13)) != 0) {
                    break;
                }
                i14 = i11;
            }
            this.f15750c = i11;
            if (i11 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f15749b = 1;
        }
        int i15 = this.f15750c;
        if (i15 > i10) {
            this.f15749b = 0;
            return -2L;
        }
        if (i15 != 1) {
            u4Var.b(bArr, 1, i15 - 1);
        }
        this.f15749b = 0;
        return b(bArr, this.f15750c, z11);
    }
}
