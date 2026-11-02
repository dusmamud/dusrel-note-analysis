package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Provider;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class yf {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final rg.a f22537c = rg.a.zza;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f22538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f22539b;

    public yf(byte[] bArr, Provider provider) throws GeneralSecurityException {
        if (!f22537c.a()) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f22538a = new SecretKeySpec(bArr, "ChaCha20");
        this.f22539b = provider;
    }
}
