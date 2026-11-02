package pe;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f32994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public OutputStream f32995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f32996c;

    @Override // java.io.OutputStream
    public final void write(int i10) throws IOException {
        write(new byte[]{(byte) i10}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        if (!this.f32996c) {
            this.f32995b.write(bArr, i10, i11);
            this.f32994a += (long) i11;
            return;
        }
        throw new IllegalStateException("ZipEntryOutputStream is closed");
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }
}
