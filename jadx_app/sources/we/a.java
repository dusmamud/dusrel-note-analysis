package we;

import io.objectbox.reactive.DataObserver;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a<K, V, C extends Collection<V>> implements Map<K, C> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap f36082a;

    public abstract AbstractSet b();

    @Override // java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized C get(Object obj) {
        return (C) this.f36082a.get(obj);
    }

    @Override // java.util.Map
    public final synchronized void clear() {
        this.f36082a.clear();
    }

    @Override // java.util.Map
    public final synchronized boolean containsKey(Object obj) {
        return this.f36082a.containsKey(obj);
    }

    @Override // java.util.Map
    public final synchronized boolean containsValue(Object obj) {
        return this.f36082a.containsValue(obj);
    }

    public final synchronized void d(Integer num, DataObserver dataObserver) {
        try {
            Collection collectionB = (Collection) this.f36082a.get(num);
            if (collectionB == null) {
                collectionB = b();
                this.f36082a.put(num, collectionB);
            }
            collectionB.add(dataObserver);
            collectionB.size();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.util.Map
    public final synchronized Set<Map.Entry<K, C>> entrySet() {
        return this.f36082a.entrySet();
    }

    @Override // java.util.Map
    public final synchronized boolean equals(Object obj) {
        return this.f36082a.equals(obj);
    }

    @Override // java.util.Map
    public final synchronized int hashCode() {
        return this.f36082a.hashCode();
    }

    @Override // java.util.Map
    public final synchronized boolean isEmpty() {
        return this.f36082a.isEmpty();
    }

    @Override // java.util.Map
    public final synchronized Set<K> keySet() {
        return this.f36082a.keySet();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        Collection collection;
        Collection collection2 = (Collection) obj2;
        synchronized (this) {
            collection = (Collection) this.f36082a.put(obj, collection2);
        }
        return collection;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends C> map) {
        this.f36082a.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        Collection collection;
        synchronized (this) {
            collection = (Collection) this.f36082a.remove(obj);
        }
        return collection;
    }

    @Override // java.util.Map
    public final synchronized int size() {
        return this.f36082a.size();
    }

    @Override // java.util.Map
    public final synchronized Collection<C> values() {
        return this.f36082a.values();
    }
}
