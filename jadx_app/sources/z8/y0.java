package z8;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y0<F, T> extends x0<F, T> implements ListIterator<T> {
    @Override // java.util.ListIterator
    public final void add(T element) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f37677a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f37677a).nextIndex();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ListIterator
    public final T previous() {
        return (T) a(((ListIterator) this.f37677a).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f37677a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(T element) {
        throw new UnsupportedOperationException();
    }
}
