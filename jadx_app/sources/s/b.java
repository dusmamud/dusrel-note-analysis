package s;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c<K, V> f34005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c<K, V> f34006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakHashMap<f<K, V>, Boolean> f34007c = new WeakHashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34008d = 0;

    public static class a<K, V> extends e<K, V> {
        @Override // s.b.e
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.f34012d;
        }

        @Override // s.b.e
        public final c<K, V> c(c<K, V> cVar) {
            return cVar.f34011c;
        }
    }

    /* JADX INFO: renamed from: s.b$b, reason: collision with other inner class name */
    public static class C0242b<K, V> extends e<K, V> {
        @Override // s.b.e
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.f34011c;
        }

        @Override // s.b.e
        public final c<K, V> c(c<K, V> cVar) {
            return cVar.f34012d;
        }
    }

    public static class c<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f34009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final V f34010b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c<K, V> f34011c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c<K, V> f34012d;

        public c(K k10, V v2) {
            this.f34009a = k10;
            this.f34010b = v2;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f34009a.equals(cVar.f34009a) && this.f34010b.equals(cVar.f34010b);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f34009a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f34010b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.f34009a.hashCode() ^ this.f34010b.hashCode();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v2) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            return this.f34009a + com.amazon.a.a.o.b.f.f5856b + this.f34010b;
        }
    }

    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c<K, V> f34013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f34014b = true;

        public d() {
        }

        @Override // s.b.f
        public final void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f34013a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f34012d;
                this.f34013a = cVar3;
                this.f34014b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f34014b) {
                return b.this.f34005a != null;
            }
            c<K, V> cVar = this.f34013a;
            return (cVar == null || cVar.f34011c == null) ? false : true;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (this.f34014b) {
                this.f34014b = false;
                this.f34013a = b.this.f34005a;
            } else {
                c<K, V> cVar = this.f34013a;
                this.f34013a = cVar != null ? cVar.f34011c : null;
            }
            return this.f34013a;
        }
    }

    public static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c<K, V> f34016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c<K, V> f34017b;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f34016a = cVar2;
            this.f34017b = cVar;
        }

        @Override // s.b.f
        public final void a(c<K, V> cVar) {
            c<K, V> cVarC = null;
            if (this.f34016a == cVar && cVar == this.f34017b) {
                this.f34017b = null;
                this.f34016a = null;
            }
            c<K, V> cVar2 = this.f34016a;
            if (cVar2 == cVar) {
                this.f34016a = b(cVar2);
            }
            c<K, V> cVar3 = this.f34017b;
            if (cVar3 == cVar) {
                c<K, V> cVar4 = this.f34016a;
                if (cVar3 != cVar4 && cVar4 != null) {
                    cVarC = c(cVar3);
                }
                this.f34017b = cVarC;
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f34017b != null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            c<K, V> cVar = this.f34017b;
            c<K, V> cVar2 = this.f34016a;
            this.f34017b = (cVar == cVar2 || cVar2 == null) ? null : c(cVar);
            return cVar;
        }
    }

    public static abstract class f<K, V> {
        public abstract void a(c<K, V> cVar);
    }

    public c<K, V> a(K k10) {
        c<K, V> cVar = this.f34005a;
        while (cVar != null && !cVar.f34009a.equals(k10)) {
            cVar = cVar.f34011c;
        }
        return cVar;
    }

    public V b(K k10, V v2) {
        c<K, V> cVarA = a(k10);
        if (cVarA != null) {
            return cVarA.f34010b;
        }
        c<K, V> cVar = new c<>(k10, v2);
        this.f34008d++;
        c<K, V> cVar2 = this.f34006b;
        if (cVar2 == null) {
            this.f34005a = cVar;
            this.f34006b = cVar;
            return null;
        }
        cVar2.f34011c = cVar;
        cVar.f34012d = cVar2;
        this.f34006b = cVar;
        return null;
    }

    public V c(K k10) {
        c<K, V> cVarA = a(k10);
        if (cVarA == null) {
            return null;
        }
        this.f34008d--;
        WeakHashMap<f<K, V>, Boolean> weakHashMap = this.f34007c;
        if (!weakHashMap.isEmpty()) {
            Iterator<f<K, V>> it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(cVarA);
            }
        }
        c<K, V> cVar = cVarA.f34012d;
        if (cVar != null) {
            cVar.f34011c = cVarA.f34011c;
        } else {
            this.f34005a = cVarA.f34011c;
        }
        c<K, V> cVar2 = cVarA.f34011c;
        if (cVar2 != null) {
            cVar2.f34012d = cVar;
        } else {
            this.f34006b = cVar;
        }
        cVarA.f34011c = null;
        cVarA.f34012d = null;
        return cVarA.f34010b;
    }

    public final boolean equals(Object obj) {
        e eVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f34008d != bVar.f34008d) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (true) {
            eVar = (e) it;
            if (!eVar.hasNext()) {
                break;
            }
            e eVar2 = (e) it2;
            if (!eVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) eVar.next();
            Object next = eVar2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (eVar.hasNext() || ((e) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f34005a, this.f34006b);
        this.f34007c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                sb2.append("]");
                return sb2.toString();
            }
            sb2.append(((Map.Entry) eVar.next()).toString());
            if (eVar.hasNext()) {
                sb2.append(", ");
            }
        }
    }
}
