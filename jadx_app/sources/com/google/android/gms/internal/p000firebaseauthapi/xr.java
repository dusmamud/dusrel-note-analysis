package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class xr<JcePrimitiveT> implements wr<JcePrimitiveT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yr<JcePrimitiveT> f22500a;

    public xr(yr yrVar) {
        this.f22500a = yrVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.wr
    public final JcePrimitiveT zza(String str) throws GeneralSecurityException {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (int i11 = 0; i11 < 3; i11++) {
            Provider provider = Security.getProvider(strArr[i11]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        int size = arrayList.size();
        Exception exc = null;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            try {
                return this.f22500a.a(str, (Provider) obj);
            } catch (Exception e10) {
                if (exc == null) {
                    exc = e10;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
