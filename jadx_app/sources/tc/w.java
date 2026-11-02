package tc;

/* JADX INFO: loaded from: classes2.dex */
public final class w<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f34545b;

    public w(int i10, T t6) {
        this.f34544a = i10;
        this.f34545b = t6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f34544a == wVar.f34544a && kotlin.jvm.internal.j.a(this.f34545b, wVar.f34545b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f34544a) * 31;
        T t6 = this.f34545b;
        return iHashCode + (t6 == null ? 0 : t6.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f34544a + ", value=" + this.f34545b + ')';
    }
}
