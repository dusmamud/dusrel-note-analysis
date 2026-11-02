package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class sr2 extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vr2 f16094a;

    public /* synthetic */ sr2(vr2 vr2Var) {
        this.f16094a = vr2Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f16094a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f16094a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        vr2 vr2Var = this.f16094a;
        Map mapF = vr2Var.f();
        return mapF != null ? mapF.keySet().iterator() : new nr2(vr2Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        vr2 vr2Var = this.f16094a;
        Map mapF = vr2Var.f();
        if (mapF != null) {
            return mapF.keySet().remove(obj);
        }
        return vr2Var.k(obj) != vr2.f18186j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f16094a.size();
    }
}
