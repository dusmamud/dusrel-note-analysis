package oe;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b<?> f32587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f32588b = new byte[1];

    public c(b<?> bVar) {
        this.f32587a = bVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f32587a.close();
    }

    public void e(InputStream inputStream, int i10) throws IOException {
        this.f32587a.e(inputStream, i10);
    }

    public int f(PushbackInputStream pushbackInputStream) throws IOException {
        return 0;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        byte[] bArr = this.f32588b;
        if (read(bArr) == -1) {
            return -1;
        }
        return bArr[0];
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        return this.f32587a.read(bArr, i10, i11);
    }
}
