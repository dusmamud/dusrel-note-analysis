package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class md {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f12791f = {0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f12792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f12796e;

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f12792a) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f12796e;
            int length = bArr2.length;
            int i13 = this.f12794c + i12;
            if (length < i13) {
                this.f12796e = Arrays.copyOf(bArr2, i13 + i13);
            }
            System.arraycopy(bArr, i10, this.f12796e, this.f12794c, i12);
            this.f12794c += i12;
        }
    }
}
