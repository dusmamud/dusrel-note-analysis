package com.amazon.a.a.o;

import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class g<T> implements Iterable<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakHashMap<T, Object> f5890a = new WeakHashMap<>();

    public void a(T t6) {
        this.f5890a.put(t6, null);
    }

    public void b(T t6) {
        this.f5890a.remove(t6);
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return this.f5890a.keySet().iterator();
    }

    public String toString() {
        return this.f5890a.keySet().toString();
    }

    public boolean a() {
        return this.f5890a.isEmpty();
    }

    public int b() {
        return this.f5890a.size();
    }
}
