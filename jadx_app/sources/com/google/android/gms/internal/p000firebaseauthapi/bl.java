package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bl implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f21194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f21195b;

    public bl(cl clVar, List list, List list2) {
        this.f21194a = list;
        this.f21195b = list2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new dl(this.f21194a.iterator(), this.f21195b.iterator());
    }
}
