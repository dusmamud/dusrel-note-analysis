package z8;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class p<T> extends n0<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3.d f37632a;

    public p(a3.d comparator) {
        this.f37632a = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(T a10, T b10) {
        return this.f37632a.compare(a10, b10);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof p) {
            return this.f37632a.equals(((p) object).f37632a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f37632a.hashCode();
    }

    public final String toString() {
        return this.f37632a.toString();
    }
}
