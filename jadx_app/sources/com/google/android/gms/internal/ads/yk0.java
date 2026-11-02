package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class yk0 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f19718a;

    public yk0(ByteBuffer byteBuffer) {
        this.f19718a = byteBuffer.duplicate();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    public final int e(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer byteBuffer2 = this.f19718a;
        if (byteBuffer2.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), byteBuffer2.remaining());
        byte[] bArr = new byte[iMin];
        byteBuffer2.get(bArr);
        byteBuffer.put(bArr);
        return iMin;
    }

    public final long f() throws IOException {
        return this.f19718a.position();
    }
}
