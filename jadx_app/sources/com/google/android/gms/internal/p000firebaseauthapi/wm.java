package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class wm implements tm {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final rg.a f22444c = rg.a.zza;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f22445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f22446b;

    public wm(byte[] bArr, Provider provider) throws GeneralSecurityException {
        if (!f22444c.a()) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode, as BoringCrypto module is not available");
        }
        this.f22445a = new SecretKeySpec(bArr, "AES");
        this.f22446b = provider;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.tm
    public final byte[] a(byte[] bArr, int i10) throws GeneralSecurityException {
        if (i10 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength must not be larger than 16");
        }
        Mac mac = Mac.getInstance("AESCMAC", this.f22446b);
        mac.init(this.f22445a);
        byte[] bArrDoFinal = mac.doFinal(bArr);
        return i10 == bArrDoFinal.length ? bArrDoFinal : Arrays.copyOf(bArrDoFinal, i10);
    }
}
