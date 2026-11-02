package z8;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class d0<T> extends z0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f37551b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f37552a;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f37552a != f37551b;
    }

    @Override // java.util.Iterator
    public final T next() {
        T t6 = (T) this.f37552a;
        Object obj = f37551b;
        if (t6 == obj) {
            throw new NoSuchElementException();
        }
        this.f37552a = obj;
        return t6;
    }
}
