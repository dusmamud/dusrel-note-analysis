package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class ku2 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f12045a;

    public ku2(Iterator it) {
        it.getClass();
        this.f12045a = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12045a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f12045a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f12045a.remove();
    }
}
