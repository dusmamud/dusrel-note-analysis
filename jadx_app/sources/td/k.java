package td;

/* JADX INFO: loaded from: classes2.dex */
public final class k<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f34592b = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f34593a;

    public static final class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f34594a;

        public a(Throwable th) {
            this.f34594a = th;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return kotlin.jvm.internal.j.a(this.f34594a, ((a) obj).f34594a);
            }
            return false;
        }

        public final int hashCode() {
            Throwable th = this.f34594a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // td.k.b
        public final String toString() {
            return "Closed(" + this.f34594a + ')';
        }
    }

    public static class b {
        public String toString() {
            return "Failed";
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return kotlin.jvm.internal.j.a(this.f34593a, ((k) obj).f34593a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f34593a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f34593a;
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
