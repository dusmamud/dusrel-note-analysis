package f1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class v1 extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileOutputStream f26343a;

    public v1(FileOutputStream fileOutputStream) {
        this.f26343a = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f26343a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i10) throws IOException {
        this.f26343a.write(i10);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] b10) throws IOException {
        kotlin.jvm.internal.j.e(b10, "b");
        this.f26343a.write(b10);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bytes, int i10, int i11) throws IOException {
        kotlin.jvm.internal.j.e(bytes, "bytes");
        this.f26343a.write(bytes, i10, i11);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
