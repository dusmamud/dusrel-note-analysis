package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class gn3 implements bi {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final jf f9857h = jf.l(gn3.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9858a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ByteBuffer f9861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f9862e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public yk0 f9864g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f9863f = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9860c = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9859b = true;

    public gn3(String str) {
        this.f9858a = str;
    }

    public final synchronized void a() {
        try {
            if (this.f9860c) {
                return;
            }
            try {
                jf jfVar = f9857h;
                String str = this.f9858a;
                jfVar.i(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
                yk0 yk0Var = this.f9864g;
                long j10 = this.f9862e;
                long j11 = this.f9863f;
                ByteBuffer byteBuffer = yk0Var.f19718a;
                int iPosition = byteBuffer.position();
                byteBuffer.position((int) j10);
                ByteBuffer byteBufferSlice = byteBuffer.slice();
                byteBufferSlice.limit((int) j11);
                byteBuffer.position(iPosition);
                this.f9861d = byteBufferSlice;
                this.f9860c = true;
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract void b(ByteBuffer byteBuffer);

    public final synchronized void c() {
        try {
            a();
            jf jfVar = f9857h;
            String str = this.f9858a;
            jfVar.i(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
            ByteBuffer byteBuffer = this.f9861d;
            if (byteBuffer != null) {
                this.f9859b = true;
                byteBuffer.rewind();
                b(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    byteBuffer.slice();
                }
                this.f9861d = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.bi
    public final void e(yk0 yk0Var, ByteBuffer byteBuffer, long j10, wh whVar) throws IOException {
        this.f9862e = yk0Var.f();
        byteBuffer.remaining();
        this.f9863f = j10;
        this.f9864g = yk0Var;
        yk0Var.f19718a.position((int) (yk0Var.f() + j10));
        this.f9860c = false;
        this.f9859b = false;
        c();
    }
}
