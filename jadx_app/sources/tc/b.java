package tc;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b<T> implements Iterator<T>, gd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f34510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T f34511b;

    public abstract void b();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f34510a;
        if (i10 == 0) {
            this.f34510a = 3;
            b();
            return this.f34510a == 1;
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public final T next() {
        int i10 = this.f34510a;
        if (i10 == 1) {
            this.f34510a = 0;
            return this.f34511b;
        }
        if (i10 != 2) {
            this.f34510a = 3;
            b();
            if (this.f34510a == 1) {
                this.f34510a = 0;
                return this.f34511b;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
