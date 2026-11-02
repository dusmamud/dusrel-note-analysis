package com.google.android.gms.internal.p000firebaseauthapi;

import java.lang.Enum;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class rj<E extends Enum<E>, O> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<E, O> f22154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<O, E> f22155b;

    public rj(Map map, Map map2) {
        this.f22154a = map;
        this.f22155b = map2;
    }

    public static <E extends Enum<E>, O> y6 a() {
        y6 y6Var = new y6();
        y6Var.f22516a = new HashMap();
        y6Var.f22517b = new HashMap();
        return y6Var;
    }

    public final E b(O o10) throws GeneralSecurityException {
        E e10 = this.f22155b.get(o10);
        if (e10 != null) {
            return e10;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(o10)));
    }

    public final O c(E e10) throws GeneralSecurityException {
        O o10 = this.f22154a.get(e10);
        if (o10 != null) {
            return o10;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(e10)));
    }
}
