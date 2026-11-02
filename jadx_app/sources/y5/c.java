package y5;

/* JADX INFO: loaded from: classes.dex */
public interface c extends y5.a {

    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f37130b = new a("NONE");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f37131c = new a("FULL");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f37132a;

        public a(String str) {
            this.f37132a = str;
        }

        public final String toString() {
            return this.f37132a;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f37133b = new b("VERTICAL");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f37134c = new b("HORIZONTAL");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f37135a;

        public b(String str) {
            this.f37135a = str;
        }

        public final String toString() {
            return this.f37135a;
        }
    }

    /* JADX INFO: renamed from: y5.c$c, reason: collision with other inner class name */
    public static final class C0302c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0302c f37136b = new C0302c("FLAT");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0302c f37137c = new C0302c("HALF_OPENED");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f37138a;

        public C0302c(String str) {
            this.f37138a = str;
        }

        public final String toString() {
            return this.f37138a;
        }
    }

    C0302c a();

    boolean b();

    a c();

    b d();
}
