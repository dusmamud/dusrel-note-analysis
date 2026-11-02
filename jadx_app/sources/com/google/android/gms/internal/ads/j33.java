package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class j33 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f11096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f11097b;

    public /* synthetic */ j33(Map map, Map map2) {
        this.f11096a = map;
        this.f11097b = map2;
    }

    public final Enum a(Object obj) throws GeneralSecurityException {
        Enum r10 = (Enum) this.f11097b.get(obj);
        if (r10 != null) {
            return r10;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    public final Object b(x83 x83Var) throws GeneralSecurityException {
        Object obj = this.f11096a.get(x83Var);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(x83Var)));
    }
}
