package z8;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class s0<T> extends n0<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0<? super T> f37659a;

    public s0(n0<? super T> forwardOrder) {
        this.f37659a = forwardOrder;
    }

    @Override // z8.n0
    public final <S extends T> n0<S> a() {
        return this.f37659a;
    }

    @Override // java.util.Comparator
    public final int compare(T a10, T b10) {
        return this.f37659a.compare(b10, a10);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof s0) {
            return this.f37659a.equals(((s0) object).f37659a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f37659a.hashCode();
    }

    public final String toString() {
        return this.f37659a + ".reverse()";
    }
}
