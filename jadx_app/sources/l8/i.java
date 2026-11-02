package l8;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class i extends b0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator f30765a;

    public i(Comparator comparator) {
        comparator.getClass();
        this.f30765a = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f30765a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            return this.f30765a.equals(((i) obj).f30765a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f30765a.hashCode();
    }

    public final String toString() {
        return this.f30765a.toString();
    }
}
