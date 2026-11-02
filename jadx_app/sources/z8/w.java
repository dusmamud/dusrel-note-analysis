package z8;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class w<K, V> extends f<K, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f37668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V f37669b;

    public w(K key, V value) {
        this.f37668a = key;
        this.f37669b = value;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f37668a;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.f37669b;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V value) {
        throw new UnsupportedOperationException();
    }
}
