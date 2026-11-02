package f3;

/* JADX INFO: loaded from: classes.dex */
public interface c0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d0 f26464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d0 f26465b;

        public a(d0 d0Var, d0 d0Var2) {
            this.f26464a = d0Var;
            this.f26465b = d0Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f26464a.equals(aVar.f26464a) && this.f26465b.equals(aVar.f26465b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f26465b.hashCode() + (this.f26464a.hashCode() * 31);
        }

        public final String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder("[");
            d0 d0Var = this.f26464a;
            sb2.append(d0Var);
            d0 d0Var2 = this.f26465b;
            if (d0Var.equals(d0Var2)) {
                str = "";
            } else {
                str = ", " + d0Var2;
            }
            return androidx.concurrent.futures.c.a(sb2, str, "]");
        }
    }

    public static class b implements c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f26466a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f26467b;

        public b(long j10) {
            this(j10, 0L);
        }

        @Override // f3.c0
        public final boolean e() {
            return false;
        }

        @Override // f3.c0
        public final a j(long j10) {
            return this.f26467b;
        }

        @Override // f3.c0
        public final long l() {
            return this.f26466a;
        }

        public b(long j10, long j11) {
            this.f26466a = j10;
            d0 d0Var = j11 == 0 ? d0.f26480c : new d0(0L, j11);
            this.f26467b = new a(d0Var, d0Var);
        }
    }

    boolean e();

    a j(long j10);

    long l();
}
