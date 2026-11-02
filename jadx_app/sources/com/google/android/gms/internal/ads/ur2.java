package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ur2 extends AbstractCollection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vr2 f17278a;

    public /* synthetic */ ur2(vr2 vr2Var) {
        this.f17278a = vr2Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f17278a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        vr2 vr2Var = this.f17278a;
        Map mapF = vr2Var.f();
        return mapF != null ? mapF.values().iterator() : new pr2(vr2Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f17278a.size();
    }
}
