package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class a<T> implements Iterator<T>, gd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T[] f30207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30208b;

    public a(T[] array) {
        j.e(array, "array");
        this.f30207a = array;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f30208b < this.f30207a.length;
    }

    @Override // java.util.Iterator
    public final T next() {
        try {
            T[] tArr = this.f30207a;
            int i10 = this.f30208b;
            this.f30208b = i10 + 1;
            return tArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f30208b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
