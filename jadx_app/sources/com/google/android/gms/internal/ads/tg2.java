package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class tg2 implements pg2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f16401b;

    public tg2(byte[] bArr, int i10) {
        this.f16400a = i10;
        this.f16401b = bArr;
    }

    @Override // com.google.android.gms.internal.ads.pg2
    public final int zza() {
        return this.f16400a;
    }

    @Override // com.google.android.gms.internal.ads.pg2
    public final String zzb() throws IOException {
        return new String(this.f16401b);
    }
}
