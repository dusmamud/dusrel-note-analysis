package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class vu2 extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f18223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f18224b;

    public vu2(InputStream inputStream, long j10) {
        super(inputStream);
        this.f18224b = -1L;
        inputStream.getClass();
        up2.b("limit must be non-negative", j10 >= 0);
        this.f18223a = j10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.f18223a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i10) {
        ((FilterInputStream) this).in.mark(i10);
        this.f18224b = this.f18223a;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f18223a == 0) {
            return -1;
        }
        int i10 = ((FilterInputStream) this).in.read();
        if (i10 != -1) {
            this.f18223a--;
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f18224b == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f18223a = this.f18224b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(Math.min(j10, this.f18223a));
        this.f18223a -= jSkip;
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        long j10 = this.f18223a;
        if (j10 == 0) {
            return -1;
        }
        int i12 = ((FilterInputStream) this).in.read(bArr, i10, (int) Math.min(i11, j10));
        if (i12 != -1) {
            this.f18223a -= (long) i12;
        }
        return i12;
    }
}
