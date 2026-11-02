package com.amazon.a.a.h;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class b implements Serializable, Iterable<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f5541a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<a> f5542b = new ArrayList();

    public boolean a() {
        return this.f5542b.isEmpty();
    }

    public Collection<a> b() {
        return this.f5542b;
    }

    public int c() {
        return this.f5542b.size();
    }

    @Override // java.lang.Iterable
    public Iterator<a> iterator() {
        return this.f5542b.iterator();
    }

    public String toString() {
        return "MetricBatch: [" + this.f5542b + "]";
    }

    public void a(a aVar) {
        this.f5542b.add(aVar);
    }
}
