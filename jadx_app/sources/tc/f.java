package tc;

import java.util.AbstractSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f<E> extends AbstractSet<E> implements Set<E>, gd.a {
    public abstract int b();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return b();
    }
}
