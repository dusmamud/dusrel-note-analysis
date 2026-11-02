package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class zh3 extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f20211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f20212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f20216f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f20217g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f20218h;

    public final boolean e() {
        ByteBuffer byteBuffer;
        Iterator it = this.f20211a;
        do {
            this.f20214d++;
            if (!it.hasNext()) {
                return false;
            }
            byteBuffer = (ByteBuffer) it.next();
            this.f20212b = byteBuffer;
        } while (!byteBuffer.hasRemaining());
        this.f20215e = this.f20212b.position();
        if (this.f20212b.hasArray()) {
            this.f20216f = true;
            this.f20217g = this.f20212b.array();
            this.f20218h = this.f20212b.arrayOffset();
        } else {
            this.f20216f = false;
            this.f20217g = null;
        }
        return true;
    }

    public final void f(int i10) {
        int i11 = this.f20215e + i10;
        this.f20215e = i11;
        if (i11 == this.f20212b.limit()) {
            e();
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f20214d == this.f20213c) {
            return -1;
        }
        if (this.f20216f) {
            int i10 = this.f20217g[this.f20215e + this.f20218h] & 255;
            f(1);
            return i10;
        }
        int i11 = this.f20212b.get(this.f20215e) & 255;
        f(1);
        return i11;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f20214d == this.f20213c) {
            return -1;
        }
        int iLimit = this.f20212b.limit();
        int i12 = this.f20215e;
        int i13 = iLimit - i12;
        if (i11 > i13) {
            i11 = i13;
        }
        if (this.f20216f) {
            System.arraycopy(this.f20217g, i12 + this.f20218h, bArr, i10, i11);
            f(i11);
            return i11;
        }
        int iPosition = this.f20212b.position();
        this.f20212b.position(this.f20215e);
        this.f20212b.get(bArr, i10, i11);
        this.f20212b.position(iPosition);
        f(i11);
        return i11;
    }
}
