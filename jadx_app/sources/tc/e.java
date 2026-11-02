package tc;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e<E> extends AbstractList<E> implements List<E>, gd.a {
    public abstract int b();

    public abstract E c(int i10);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i10) {
        return c(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return b();
    }
}
