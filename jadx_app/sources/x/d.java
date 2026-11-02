package x;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class d<T> implements Iterator<T>, gd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f36113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f36114c;

    public d(int i10) {
        this.f36112a = i10;
    }

    public abstract T b(int i10);

    public abstract void c(int i10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f36113b < this.f36112a;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T tB = b(this.f36113b);
        this.f36113b++;
        this.f36114c = true;
        return tB;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f36114c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i10 = this.f36113b - 1;
        this.f36113b = i10;
        c(i10);
        this.f36112a--;
        this.f36114c = false;
    }
}
