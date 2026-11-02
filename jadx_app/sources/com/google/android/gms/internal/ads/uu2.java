package com.google.android.gms.internal.ads;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class uu2 extends OutputStream {
    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i10) {
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        bArr.getClass();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        bArr.getClass();
        up2.k(i10, i11 + i10, bArr.length);
    }
}
