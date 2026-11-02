package pe;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b<?> f32985a;

    public c(b<?> bVar) {
        this.f32985a = bVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f32985a.close();
    }

    public void e() throws IOException {
        this.f32985a.e();
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        write(new byte[]{(byte) i10});
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f32985a.write(bArr, i10, i11);
    }
}
