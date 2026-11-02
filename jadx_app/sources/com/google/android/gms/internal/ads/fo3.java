package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes.dex */
public final class fo3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f9269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f9270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f9272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f9273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9276h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f9277i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final eo3 f9278j;

    public fo3() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f9277i = cryptoInfo;
        this.f9278j = new eo3(cryptoInfo);
    }

    public final void a(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.f9272d == null) {
            int[] iArr = new int[1];
            this.f9272d = iArr;
            this.f9277i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f9272d;
        iArr2[0] = iArr2[0] + i10;
    }
}
