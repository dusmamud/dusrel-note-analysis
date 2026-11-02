package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class f43 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f43 f9064b = new f43();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f9065a = new ConcurrentHashMap();

    public final void a(e43 e43Var, Class cls) throws GeneralSecurityException {
        e43 e43Var2 = (e43) this.f9065a.putIfAbsent(cls, e43Var);
        if (e43Var2 != null && !e43Var2.equals(e43Var)) {
            throw new GeneralSecurityException("Different key creator for parameters class already inserted");
        }
    }
}
