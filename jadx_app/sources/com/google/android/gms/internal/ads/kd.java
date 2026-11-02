package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class kd {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f11781e = {0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f11782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f11785d;

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f11782a) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f11785d;
            int length = bArr2.length;
            int i13 = this.f11783b + i12;
            if (length < i13) {
                this.f11785d = Arrays.copyOf(bArr2, i13 + i13);
            }
            System.arraycopy(bArr, i10, this.f11785d, this.f11783b, i12);
            this.f11783b += i12;
        }
    }
}
