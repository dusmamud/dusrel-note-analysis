package l8;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends b0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f30760a;

    public g0(b0 b0Var) {
        this.f30760a = b0Var;
    }

    @Override // l8.b0
    public final b0 a() {
        return this.f30760a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f30760a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g0) {
            return this.f30760a.equals(((g0) obj).f30760a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f30760a.hashCode();
    }

    public final String toString() {
        return this.f30760a.toString().concat(".reverse()");
    }
}
