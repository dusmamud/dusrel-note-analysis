package z8;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f<K, V> implements Map.Entry<K, V> {
    @Override // java.util.Map.Entry
    public final boolean equals(Object object) {
        if (object instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) object;
            if (y8.g.a(getKey(), entry.getKey()) && y8.g.a(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        K key = getKey();
        V value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    public final String toString() {
        return getKey() + com.amazon.a.a.o.b.f.f5856b + getValue();
    }
}
