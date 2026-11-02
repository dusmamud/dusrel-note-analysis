package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class dl<P> implements Iterator<P> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator<P> f21295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator<P> f21296b;

    public dl(Iterator it, Iterator it2) {
        this.f21295a = it;
        this.f21296b = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21295a.hasNext() || this.f21296b.hasNext();
    }

    @Override // java.util.Iterator
    public final P next() {
        Iterator<P> it = this.f21295a;
        return it.hasNext() ? it.next() : this.f21296b.next();
    }
}
