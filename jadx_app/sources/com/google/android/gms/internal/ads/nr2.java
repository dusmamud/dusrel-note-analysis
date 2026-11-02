package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class nr2 extends rr2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vr2 f13467e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr2(vr2 vr2Var) {
        super(vr2Var);
        Objects.requireNonNull(vr2Var);
        this.f13467e = vr2Var;
    }

    @Override // com.google.android.gms.internal.ads.rr2
    public final Object a(int i10) {
        return this.f13467e.c()[i10];
    }
}
