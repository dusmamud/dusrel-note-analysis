package s;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a<K, V> extends b<K, V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap<K, b.c<K, V>> f34004e = new HashMap<>();

    @Override // s.b
    public final b.c<K, V> a(K k10) {
        return this.f34004e.get(k10);
    }

    @Override // s.b
    public final V b(K k10, V v2) {
        b.c<K, V> cVarA = a(k10);
        if (cVarA != null) {
            return cVarA.f34010b;
        }
        b.c<K, V> cVar = new b.c<>(k10, v2);
        this.f34008d++;
        b.c<K, V> cVar2 = this.f34006b;
        if (cVar2 == null) {
            this.f34005a = cVar;
            this.f34006b = cVar;
        } else {
            cVar2.f34011c = cVar;
            cVar.f34012d = cVar2;
            this.f34006b = cVar;
        }
        this.f34004e.put(k10, cVar);
        return null;
    }

    @Override // s.b
    public final V c(K k10) {
        V v2 = (V) super.c(k10);
        this.f34004e.remove(k10);
        return v2;
    }
}
