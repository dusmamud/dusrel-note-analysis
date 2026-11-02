package com.google.android.gms.internal.ads;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class lh extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f12401b;

    public lh(BufferedInputStream bufferedInputStream, long j10) {
        super(bufferedInputStream);
        this.f12400a = j10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i10 = super.read();
        if (i10 != -1) {
            this.f12401b++;
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = super.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f12401b += (long) i12;
        }
        return i12;
    }
}
