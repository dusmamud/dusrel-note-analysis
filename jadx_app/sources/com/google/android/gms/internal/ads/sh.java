package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class sh extends ByteArrayOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ih f15927a;

    public sh(ih ihVar, int i10) {
        this.f15927a = ihVar;
        ((ByteArrayOutputStream) this).buf = ihVar.a(Math.max(i10, 256));
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f15927a.b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void e(int i10) {
        int i11 = ((ByteArrayOutputStream) this).count;
        if (i11 + i10 <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        int i12 = i11 + i10;
        ih ihVar = this.f15927a;
        byte[] bArrA = ihVar.a(i12 + i12);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArrA, 0, ((ByteArrayOutputStream) this).count);
        ihVar.b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = bArrA;
    }

    public final void finalize() {
        this.f15927a.b(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i10) {
        e(1);
        super.write(i10);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i10, int i11) {
        e(i11);
        super.write(bArr, i10, i11);
    }
}
