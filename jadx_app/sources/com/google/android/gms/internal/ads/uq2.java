package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class uq2 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f17246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Collection f17247b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f17248c = zs2.zza;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gr2 f17249d;

    public uq2(gr2 gr2Var) {
        this.f17249d = gr2Var;
        this.f17246a = gr2Var.f9922d.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f17246a.hasNext() || this.f17248c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f17248c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f17246a.next();
            entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f17247b = collection;
            this.f17248c = collection.iterator();
        }
        return this.f17248c.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f17248c.remove();
        Collection collection = this.f17247b;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f17246a.remove();
        }
        this.f17249d.f9923e--;
    }
}
