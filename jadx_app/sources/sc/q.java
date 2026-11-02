package sc;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements Comparable<q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f34210a;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(q qVar) {
        return kotlin.jvm.internal.j.f(this.f34210a & 255, qVar.f34210a & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.f34210a == ((q) obj).f34210a;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f34210a);
    }

    public final String toString() {
        return String.valueOf(this.f34210a & 255);
    }
}
