package com.amazon.a.a.o.d;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class c implements Iterable<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<b, a> f5889a = new HashMap();

    public <T> c a(T t6, T t10, b bVar) {
        if (!a(t6, t10)) {
            this.f5889a.put(bVar, new a(bVar, "'" + t6 + "' != '" + t10 + "'"));
        }
        return this;
    }

    @Override // java.lang.Iterable
    public Iterator<a> iterator() {
        return this.f5889a.values().iterator();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Verifier:");
        Iterator<a> it = this.f5889a.values().iterator();
        while (it.hasNext()) {
            sb2.append("\n\t" + it.next());
        }
        return sb2.toString();
    }

    private boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public <T extends Comparable<T>> c a(T t6, T t10, b bVar) {
        if (t6.compareTo(t10) <= 0) {
            this.f5889a.put(bVar, new a(bVar, "'" + t6 + "' <= '" + t10 + "'"));
        }
        return this;
    }

    public c a(Exception exc, b bVar) {
        this.f5889a.put(bVar, new a(bVar, "Exception: " + exc));
        return this;
    }

    public boolean a() {
        return !this.f5889a.isEmpty();
    }

    public boolean a(b bVar) {
        return this.f5889a.containsKey(bVar);
    }
}
