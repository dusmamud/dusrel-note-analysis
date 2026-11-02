package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes.dex */
public final class md3 extends ThreadLocal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12804a;

    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0028 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        SecureRandom secureRandom;
        Provider provider;
        switch (this.f12804a) {
            case 0:
                try {
                    return (Cipher) ce3.f7830b.f7836a.zza("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e10) {
                    throw new IllegalStateException(e10);
                }
            default:
                Provider providerA = com.google.android.gms.internal.p000firebaseauthapi.nj.a();
                if (providerA == null) {
                    provider = null;
                    provider = (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
                    if (provider != null) {
                        secureRandom = SecureRandom.getInstance("SHA1PRNG", provider);
                    } else {
                        secureRandom = new SecureRandom();
                    }
                    break;
                } else {
                    try {
                        secureRandom = SecureRandom.getInstance("SHA1PRNG", providerA);
                    } catch (GeneralSecurityException unused) {
                        provider = null;
                        try {
                            provider = (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
                        } catch (Throwable unused2) {
                        }
                        if (provider != null) {
                            try {
                                secureRandom = SecureRandom.getInstance("SHA1PRNG", provider);
                            } catch (GeneralSecurityException unused3) {
                                secureRandom = new SecureRandom();
                            }
                        } else {
                            secureRandom = new SecureRandom();
                        }
                    }
                    break;
                }
                secureRandom.nextLong();
                return secureRandom;
        }
    }
}
