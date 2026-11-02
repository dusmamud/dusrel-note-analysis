package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class rk {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final rk f22156b = new rk();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f22157a = new HashMap();

    public final synchronized void a(String str, mc mcVar) throws GeneralSecurityException {
        try {
            if (!this.f22157a.containsKey(str)) {
                this.f22157a.put(str, mcVar);
                return;
            }
            if (((mc) this.f22157a.get(str)).equals(mcVar)) {
                return;
            }
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + String.valueOf(this.f22157a.get(str)) + "), cannot insert " + String.valueOf(mcVar));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Map<String, mc> map) throws GeneralSecurityException {
        for (Map.Entry<String, mc> entry : map.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
    }
}
