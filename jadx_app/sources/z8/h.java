package z8;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class h<F, T> extends n0<F> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y8.e<F, ? extends T> f37599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0<T> f37600b;

    public h(y8.e<F, ? extends T> function, n0<T> ordering) {
        function.getClass();
        this.f37599a = function;
        ordering.getClass();
        this.f37600b = ordering;
    }

    @Override // java.util.Comparator
    public final int compare(F left, F right) {
        y8.e<F, ? extends T> eVar = this.f37599a;
        return this.f37600b.compare(eVar.apply(left), eVar.apply(right));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof h) {
            h hVar = (h) object;
            if (this.f37599a.equals(hVar.f37599a) && this.f37600b.equals(hVar.f37600b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f37599a, this.f37600b});
    }

    public final String toString() {
        return this.f37600b + ".onResultOf(" + this.f37599a + ")";
    }
}
