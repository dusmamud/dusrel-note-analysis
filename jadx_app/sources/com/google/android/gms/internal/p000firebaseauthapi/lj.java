package com.google.android.gms.internal.p000firebaseauthapi;

import android.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.BadPaddingException;

/* JADX INFO: loaded from: classes.dex */
public final class lj implements pb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jj f21789a;

    public lj(String str) throws GeneralSecurityException, IOException {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            this.f21789a = new jj(str, keyStore);
        } catch (IOException e10) {
            throw new GeneralSecurityException(e10);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.pb
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        jj jjVar = this.f21789a;
        try {
            return jjVar.a(bArr, bArr2);
        } catch (ProviderException e10) {
            e = e10;
            Log.w("lj", "encountered a potentially transient KeyStore error, will wait and retry", e);
            try {
                Thread.sleep((int) (Math.random() * 100.0d));
            } catch (InterruptedException unused) {
            }
            return jjVar.a(bArr, bArr2);
        } catch (BadPaddingException e11) {
            throw e11;
        } catch (GeneralSecurityException e12) {
            e = e12;
            Log.w("lj", "encountered a potentially transient KeyStore error, will wait and retry", e);
            Thread.sleep((int) (Math.random() * 100.0d));
            return jjVar.a(bArr, bArr2);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.pb
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        jj jjVar = this.f21789a;
        try {
            return jjVar.b(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e10) {
            Log.w("lj", "encountered a potentially transient KeyStore error, will wait and retry", e10);
            try {
                Thread.sleep((int) (Math.random() * 100.0d));
            } catch (InterruptedException unused) {
            }
            return jjVar.b(bArr, bArr2);
        }
    }
}
