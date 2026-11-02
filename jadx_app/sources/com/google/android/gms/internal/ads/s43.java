package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s43 implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f15707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f15708b;

    public s43(u43 u43Var, List list, List list2) {
        this.f15707a = list;
        this.f15708b = list2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new t43(this.f15707a.iterator(), this.f15708b.iterator());
    }
}
