package sc;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements Comparable<g> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f34196b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34197a = 131604;

    @Override // java.lang.Comparable
    public final int compareTo(g gVar) {
        g other = gVar;
        kotlin.jvm.internal.j.e(other, "other");
        return this.f34197a - other.f34197a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        g gVar = obj instanceof g ? (g) obj : null;
        return gVar != null && this.f34197a == gVar.f34197a;
    }

    public final int hashCode() {
        return this.f34197a;
    }

    public final String toString() {
        return "2.2.20";
    }
}
