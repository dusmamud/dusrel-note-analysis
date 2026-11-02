package oe;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PushbackInputStream f32593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f32594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f32595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f32596d;

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f32593a.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = this.f32595c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0];
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        long j10 = this.f32596d;
        if (j10 != -1) {
            long j11 = this.f32594b;
            if (j11 >= j10) {
                return -1;
            }
            long j12 = j10 - j11;
            if (i11 > j12) {
                i11 = (int) j12;
            }
        }
        int i12 = this.f32593a.read(bArr, i10, i11);
        if (i12 > 0) {
            this.f32594b += (long) i12;
        }
        return i12;
    }
}
