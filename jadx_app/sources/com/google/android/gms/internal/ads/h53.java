package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public final class h53 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g53 f10085a = new g53();

    public static byte[] a(int i10) {
        byte[] bArr = new byte[i10];
        ((SecureRandom) f10085a.get()).nextBytes(bArr);
        return bArr;
    }
}
