package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.ads.md3;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public final class ol {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final md3 f21991a = new md3(1);

    public static byte[] a(int i10) {
        byte[] bArr = new byte[i10];
        ((SecureRandom) f21991a.get()).nextBytes(bArr);
        return bArr;
    }
}
