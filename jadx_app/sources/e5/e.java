package e5;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Comparable<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f25784d;

    public e(String from, int i10, int i11, String to) {
        kotlin.jvm.internal.j.e(from, "from");
        kotlin.jvm.internal.j.e(to, "to");
        this.f25781a = i10;
        this.f25782b = i11;
        this.f25783c = from;
        this.f25784d = to;
    }

    @Override // java.lang.Comparable
    public final int compareTo(e eVar) {
        e other = eVar;
        kotlin.jvm.internal.j.e(other, "other");
        int i10 = this.f25781a - other.f25781a;
        return i10 == 0 ? this.f25782b - other.f25782b : i10;
    }
}
