package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ok {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ok f21989b = new ok();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f21990a = new ConcurrentHashMap();

    public final <ParametersT extends mc> void a(nk<ParametersT> nkVar, Class<ParametersT> cls) throws GeneralSecurityException {
        nk nkVar2 = (nk) this.f21990a.putIfAbsent(cls, nkVar);
        if (nkVar2 != null && !nkVar2.equals(nkVar)) {
            throw new GeneralSecurityException("Different key creator for parameters class already inserted");
        }
    }
}
