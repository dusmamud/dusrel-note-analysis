package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.ib;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public abstract class el<KeyT extends ib, PrimitiveT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<KeyT> f21355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class<PrimitiveT> f21356b;

    public el() {
        throw null;
    }

    public el(Class cls, Class cls2) {
        this.f21355a = cls;
        this.f21356b = cls2;
    }

    public abstract PrimitiveT a(KeyT keyt) throws GeneralSecurityException;
}
