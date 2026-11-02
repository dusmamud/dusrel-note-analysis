package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class vr implements wr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f22397a;

    public vr(int i10) {
        this.f22397a = new ArrayList();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.wr
    public Object zza(String str) throws GeneralSecurityException {
        yr yrVar = (yr) this.f22397a;
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (int i11 = 0; i11 < 2; i11++) {
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
                return yrVar.a(str, (Provider) obj);
            } catch (Exception e10) {
                if (exc == null) {
                    exc = e10;
                }
            }
        }
        return yrVar.a(str, null);
    }

    public vr(yr yrVar) {
        this.f22397a = yrVar;
    }
}
