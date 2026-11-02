package y8;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class j<T> implements i<T>, Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<? extends i<? super T>> f37193a;

    public j(List list) {
        this.f37193a = list;
    }

    @Override // y8.i
    public final boolean apply(T t6) {
        int i10 = 0;
        while (true) {
            List<? extends i<? super T>> list = this.f37193a;
            if (i10 >= list.size()) {
                return true;
            }
            if (!list.get(i10).apply(t6)) {
                return false;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f37193a.equals(((j) obj).f37193a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f37193a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Predicates.and(");
        boolean z10 = true;
        for (T t6 : this.f37193a) {
            if (!z10) {
                sb2.append(',');
            }
            sb2.append(t6);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
