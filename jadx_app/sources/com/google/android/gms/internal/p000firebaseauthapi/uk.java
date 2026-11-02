package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class uk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f22332a = r.a(new byte[0]);

    public static final r a(int i10) {
        return r.a(ByteBuffer.allocate(5).put((byte) 0).putInt(i10).array());
    }

    public static final r b(int i10) {
        return r.a(ByteBuffer.allocate(5).put((byte) 1).putInt(i10).array());
    }
}
