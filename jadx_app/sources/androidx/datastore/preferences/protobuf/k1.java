package androidx.datastore.preferences.protobuf;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class k1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f2091g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<k1<K, V>.c> f2092a = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<K, V> f2093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile k1<K, V>.e f2095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map<K, V> f2096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile k1<K, V>.b f2097f;

    public class a implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f2099b;

        public a() {
            this.f2098a = k1.this.f2092a.size();
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.f2099b == null) {
                this.f2099b = k1.this.f2096e.entrySet().iterator();
            }
            return this.f2099b;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i10 = this.f2098a;
            return (i10 > 0 && i10 <= k1.this.f2092a.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (a().hasNext()) {
                return a().next();
            }
            List<k1<K, V>.c> list = k1.this.f2092a;
            int i10 = this.f2098a - 1;
            this.f2098a = i10;
            return list.get(i10);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public class b extends k1<K, V>.e {
        public b() {
            super();
        }

        @Override // androidx.datastore.preferences.protobuf.k1.e, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }
    }

    public class c implements Map.Entry<K, V>, Comparable<k1<K, V>.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f2102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public V f2103b;

        public c() {
            throw null;
        }

        public c(K key, V value) {
            this.f2102a = key;
            this.f2103b = value;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object other) {
            return this.f2102a.compareTo(((c) other).f2102a);
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object o10) {
            boolean zEquals;
            boolean zEquals2;
            if (o10 != this) {
                if (o10 instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) o10;
                    Object key = entry.getKey();
                    K k10 = this.f2102a;
                    if (k10 == null) {
                        zEquals = key == null;
                    } else {
                        zEquals = k10.equals(key);
                    }
                    if (zEquals) {
                        V v2 = this.f2103b;
                        Object value = entry.getValue();
                        if (v2 == null) {
                            zEquals2 = value == null;
                        } else {
                            zEquals2 = v2.equals(value);
                        }
                        if (zEquals2) {
                        }
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.f2102a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f2103b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k10 = this.f2102a;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v2 = this.f2103b;
            return (v2 != null ? v2.hashCode() : 0) ^ iHashCode;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V newValue) {
            int i10 = k1.f2091g;
            k1.this.c();
            V v2 = this.f2103b;
            this.f2103b = newValue;
            return v2;
        }

        public final String toString() {
            return this.f2102a + com.amazon.a.a.o.b.f.f5856b + this.f2103b;
        }
    }

    public class d implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2105a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f2106b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f2107c;

        public d() {
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.f2107c == null) {
                this.f2107c = k1.this.f2093b.entrySet().iterator();
            }
            return this.f2107c;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i10 = this.f2105a + 1;
            k1 k1Var = k1.this;
            return i10 < k1Var.f2092a.size() || (!k1Var.f2093b.isEmpty() && a().hasNext());
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.f2106b = true;
            int i10 = this.f2105a + 1;
            this.f2105a = i10;
            k1 k1Var = k1.this;
            return i10 < k1Var.f2092a.size() ? k1Var.f2092a.get(this.f2105a) : a().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f2106b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f2106b = false;
            int i10 = k1.f2091g;
            k1 k1Var = k1.this;
            k1Var.c();
            if (this.f2105a >= k1Var.f2092a.size()) {
                a().remove();
                return;
            }
            int i11 = this.f2105a;
            this.f2105a = i11 - 1;
            k1Var.i(i11);
        }
    }

    public class e extends AbstractSet<Map.Entry<K, V>> {
        public e() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object entry) {
            Map.Entry entry2 = (Map.Entry) entry;
            if (contains(entry2)) {
                return false;
            }
            k1.this.h((Comparable) entry2.getKey(), entry2.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            k1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object o10) {
            Map.Entry entry = (Map.Entry) o10;
            Object obj = k1.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj != value) {
                return obj != null && obj.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object o10) {
            Map.Entry entry = (Map.Entry) o10;
            if (!contains(entry)) {
                return false;
            }
            k1.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return k1.this.size();
        }
    }

    public k1() {
        Map<K, V> map = Collections.EMPTY_MAP;
        this.f2093b = map;
        this.f2096e = map;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    public final int b(K key) {
        int i10;
        int i11;
        int i12;
        int iCompareTo;
        int size = this.f2092a.size();
        int i13 = size - 1;
        if (i13 < 0) {
            i10 = 0;
            while (i10 <= i13) {
                i12 = (i10 + i13) / 2;
                iCompareTo = key.compareTo(this.f2092a.get(i12).f2102a);
                if (iCompareTo < 0) {
                    i13 = i12 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i12;
                    }
                    i10 = i12 + 1;
                }
            }
            i11 = i10 + 1;
        } else {
            int iCompareTo2 = key.compareTo(this.f2092a.get(i13).f2102a);
            if (iCompareTo2 > 0) {
                i11 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i13;
                }
                i10 = 0;
                while (i10 <= i13) {
                    i12 = (i10 + i13) / 2;
                    iCompareTo = key.compareTo(this.f2092a.get(i12).f2102a);
                    if (iCompareTo < 0) {
                        i13 = i12 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i12;
                        }
                        i10 = i12 + 1;
                    }
                }
                i11 = i10 + 1;
            }
        }
        return -i11;
    }

    public final void c() {
        if (this.f2094c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        c();
        if (!this.f2092a.isEmpty()) {
            this.f2092a.clear();
        }
        if (this.f2093b.isEmpty()) {
            return;
        }
        this.f2093b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object o10) {
        Comparable comparable = (Comparable) o10;
        return b(comparable) >= 0 || this.f2093b.containsKey(comparable);
    }

    public final Map.Entry<K, V> d(int index) {
        return this.f2092a.get(index);
    }

    public final Set e() {
        return this.f2093b.isEmpty() ? Collections.EMPTY_SET : this.f2093b.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f2095d == null) {
            this.f2095d = new e();
        }
        return this.f2095d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object o10) {
        if (this == o10) {
            return true;
        }
        if (!(o10 instanceof k1)) {
            return super.equals(o10);
        }
        k1 k1Var = (k1) o10;
        int size = size();
        if (size == k1Var.size()) {
            int size2 = this.f2092a.size();
            if (size2 != k1Var.f2092a.size()) {
                return ((AbstractSet) entrySet()).equals(k1Var.entrySet());
            }
            for (int i10 = 0; i10 < size2; i10++) {
                if (d(i10).equals(k1Var.d(i10))) {
                }
            }
            if (size2 != size) {
                return this.f2093b.equals(k1Var.f2093b);
            }
            return true;
        }
        return false;
    }

    public final SortedMap<K, V> f() {
        c();
        if (this.f2093b.isEmpty() && !(this.f2093b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f2093b = treeMap;
            this.f2096e = treeMap.descendingMap();
        }
        return (SortedMap) this.f2093b;
    }

    public void g() {
        if (this.f2094c) {
            return;
        }
        this.f2093b = this.f2093b.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f2093b);
        this.f2096e = this.f2096e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f2096e);
        this.f2094c = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object o10) {
        Comparable comparable = (Comparable) o10;
        int iB = b(comparable);
        return iB >= 0 ? this.f2092a.get(iB).f2103b : this.f2093b.get(comparable);
    }

    public final V h(K key, V value) {
        c();
        int iB = b(key);
        if (iB >= 0) {
            return this.f2092a.get(iB).setValue(value);
        }
        c();
        if (this.f2092a.isEmpty() && !(this.f2092a instanceof ArrayList)) {
            this.f2092a = new ArrayList(16);
        }
        int i10 = -(iB + 1);
        if (i10 >= 16) {
            return f().put(key, value);
        }
        if (this.f2092a.size() == 16) {
            k1<K, V>.c cVarRemove = this.f2092a.remove(15);
            f().put(cVarRemove.f2102a, cVarRemove.f2103b);
        }
        this.f2092a.add(i10, new c(key, value));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f2092a.size();
        int iHashCode = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode += this.f2092a.get(i10).hashCode();
        }
        return this.f2093b.size() > 0 ? this.f2093b.hashCode() + iHashCode : iHashCode;
    }

    public final V i(int index) {
        c();
        V v2 = this.f2092a.remove(index).f2103b;
        if (!this.f2093b.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = f().entrySet().iterator();
            List<k1<K, V>.c> list = this.f2092a;
            Map.Entry<K, V> next = it.next();
            list.add(new c(next.getKey(), next.getValue()));
            it.remove();
        }
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object o10) {
        c();
        Comparable comparable = (Comparable) o10;
        int iB = b(comparable);
        if (iB >= 0) {
            return i(iB);
        }
        if (this.f2093b.isEmpty()) {
            return null;
        }
        return this.f2093b.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f2093b.size() + this.f2092a.size();
    }
}
