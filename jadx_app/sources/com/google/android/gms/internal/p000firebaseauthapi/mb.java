package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public final class mb {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f21818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f21819e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f21815a = ByteBuffer.allocate(23).order(ByteOrder.LITTLE_ENDIAN);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21816b = 16;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21817c = 16;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21820f = 0;

    public mb() {
        long j10 = 0;
        this.f21818d = j10;
        this.f21819e = j10;
    }

    public final void a(String str) {
        byte[] bytes = str.toString().getBytes(StandardCharsets.UTF_8);
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bytes, 0, bytes.length).order(ByteOrder.LITTLE_ENDIAN);
        int iRemaining = byteBufferOrder.remaining();
        ByteBuffer byteBuffer = this.f21815a;
        if (iRemaining <= byteBuffer.remaining()) {
            byteBuffer.put(byteBufferOrder);
            if (byteBuffer.remaining() < 8) {
                c();
                return;
            }
            return;
        }
        int iPosition = this.f21816b - byteBuffer.position();
        for (int i10 = 0; i10 < iPosition; i10++) {
            byteBuffer.put(byteBufferOrder.get());
        }
        c();
        while (byteBufferOrder.remaining() >= this.f21817c) {
            b(byteBufferOrder);
        }
        byteBuffer.put(byteBufferOrder);
    }

    public final void b(ByteBuffer byteBuffer) {
        long j10 = byteBuffer.getLong();
        long j11 = byteBuffer.getLong();
        long jRotateLeft = (Long.rotateLeft(j10 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f21818d;
        this.f21818d = jRotateLeft;
        long jRotateLeft2 = Long.rotateLeft(jRotateLeft, 27);
        long j12 = this.f21819e;
        this.f21818d = ((jRotateLeft2 + j12) * 5) + 1390208809;
        long jRotateLeft3 = (Long.rotateLeft(j11 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ j12;
        this.f21819e = jRotateLeft3;
        this.f21819e = ((Long.rotateLeft(jRotateLeft3, 31) + this.f21818d) * 5) + 944331445;
        this.f21820f += 16;
    }

    public final void c() {
        ByteBuffer byteBuffer = this.f21815a;
        byteBuffer.flip();
        while (byteBuffer.remaining() >= this.f21817c) {
            b(byteBuffer);
        }
        byteBuffer.compact();
    }
}
