package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class m0<K, V> extends LinkedHashMap<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m0<?, ?> f2129b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2130a = true;

    static {
        m0<?, ?> m0Var = new m0<>();
        f2129b = m0Var;
        m0Var.f2130a = false;
    }

    public static int b(Object a10) {
        if (!(a10 instanceof byte[])) {
            if (a10 instanceof a0.a) {
                throw new UnsupportedOperationException();
            }
            return a10.hashCode();
        }
        byte[] bArr = (byte[]) a10;
        int length = bArr.length;
        Charset charset = a0.f2032a;
        int i10 = length;
        for (byte b10 : bArr) {
            i10 = (i10 * 31) + b10;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public final void c() {
        if (!this.f2130a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        c();
        super.clear();
    }

    public final m0<K, V> d() {
        if (isEmpty()) {
            return new m0<>();
        }
        m0<K, V> m0Var = new m0<>(this);
        m0Var.f2130a = true;
        return m0Var;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean z10;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    Iterator<Map.Entry<K, V>> it = entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Map.Entry<K, V> next = it.next();
                            if (map.containsKey(next.getKey())) {
                                V value = next.getValue();
                                Object obj2 = map.get(next.getKey());
                                if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                                }
                            }
                        } else {
                            z10 = true;
                        }
                    }
                }
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iB = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            iB += b(entry.getValue()) ^ b(entry.getKey());
        }
        return iB;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k10, V v2) {
        c();
        Charset charset = a0.f2032a;
        k10.getClass();
        v2.getClass();
        return (V) super.put(k10, v2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> m10) {
        c();
        for (K k10 : m10.keySet()) {
            Charset charset = a0.f2032a;
            k10.getClass();
            m10.get(k10).getClass();
        }
        super.putAll(m10);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        c();
        return (V) super.remove(obj);
    }
}
