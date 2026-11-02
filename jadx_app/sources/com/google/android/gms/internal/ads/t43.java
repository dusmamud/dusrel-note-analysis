package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class t43 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f16248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f16249b;

    public /* synthetic */ t43(Iterator it, Iterator it2) {
        this.f16248a = it;
        this.f16249b = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16248a.hasNext() || this.f16249b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it = this.f16248a;
        return it.hasNext() ? it.next() : this.f16249b.next();
    }
}
