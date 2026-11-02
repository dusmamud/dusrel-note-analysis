package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public abstract class c<E> extends AbstractList<E> implements a0.c<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2035a;

    public c(boolean isMutable) {
        this.f2035a = isMutable;
    }

    @Override // androidx.datastore.preferences.protobuf.a0.c
    public final boolean I() {
        return this.f2035a;
    }

    public final void a() {
        if (!this.f2035a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> c10) {
        a();
        return super.addAll(c10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object o10) {
        if (o10 == this) {
            return true;
        }
        if (!(o10 instanceof List)) {
            return false;
        }
        if (!(o10 instanceof RandomAccess)) {
            return super.equals(o10);
        }
        List list = (List) o10;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!get(i10).equals(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.a0.c
    public final void f() {
        if (this.f2035a) {
            this.f2035a = false;
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode = (iHashCode * 31) + get(i10).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public abstract E remove(int index);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object o10) {
        a();
        int iIndexOf = indexOf(o10);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> c10) {
        a();
        return super.removeAll(c10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<?> c10) {
        a();
        return super.retainAll(c10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int index, Collection<? extends E> c10) {
        a();
        return super.addAll(index, c10);
    }
}
