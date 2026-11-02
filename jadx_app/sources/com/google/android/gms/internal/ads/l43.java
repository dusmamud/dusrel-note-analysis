package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class l43 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final se3 f12192a = se3.a(new byte[0]);

    public static final se3 a(int i10) {
        return se3.a(ByteBuffer.allocate(5).put((byte) 0).putInt(i10).array());
    }

    public static final se3 b(int i10) {
        return se3.a(ByteBuffer.allocate(5).put((byte) 1).putInt(i10).array());
    }
}
