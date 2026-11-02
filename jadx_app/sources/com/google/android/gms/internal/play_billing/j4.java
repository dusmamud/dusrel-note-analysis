package com.google.android.gms.internal.play_billing;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class j4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f22718a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f22719b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f22719b = bArr;
        ByteBuffer.wrap(bArr);
    }

    public static int a(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }
}
