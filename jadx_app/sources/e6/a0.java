package e6;

/* JADX INFO: loaded from: classes.dex */
public interface a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.c f25805a = new a.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a.b f25806b = new a.b();

    public static abstract class a {

        /* JADX INFO: renamed from: e6.a0$a$a, reason: collision with other inner class name */
        public static final class C0141a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Throwable f25807a;

            public C0141a(Throwable exception) {
                this.f25807a = exception;
            }

            public final String toString() {
                return "FAILURE (" + this.f25807a.getMessage() + ")";
            }
        }

        public static final class b extends a {
            public final String toString() {
                return "IN_PROGRESS";
            }
        }

        public static final class c extends a {
            public final String toString() {
                return "SUCCESS";
            }
        }
    }
}
