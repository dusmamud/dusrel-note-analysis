package sc;

/* JADX INFO: loaded from: classes2.dex */
public final class x implements Comparable<x> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f34223a;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(x xVar) {
        return kotlin.jvm.internal.j.f(this.f34223a & 65535, xVar.f34223a & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x) {
            return this.f34223a == ((x) obj).f34223a;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f34223a);
    }

    public final String toString() {
        return String.valueOf(this.f34223a & 65535);
    }
}
