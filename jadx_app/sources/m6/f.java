package m6;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f31241b;

    public f(String str, Long l10) {
        this.f31240a = str;
        this.f31241b = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.j.a(this.f31240a, fVar.f31240a) && kotlin.jvm.internal.j.a(this.f31241b, fVar.f31241b);
    }

    public final int hashCode() {
        int iHashCode = this.f31240a.hashCode() * 31;
        Long l10 = this.f31241b;
        return iHashCode + (l10 == null ? 0 : l10.hashCode());
    }

    public final String toString() {
        return "Preference(key=" + this.f31240a + ", value=" + this.f31241b + ')';
    }
}
