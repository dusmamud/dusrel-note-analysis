package com.google.android.gms.internal.auth;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class m3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f20594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f20595b;

    static {
        Charset.forName("US-ASCII");
        f20594a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f20595b = bArr;
        ByteBuffer.wrap(bArr);
    }
}
