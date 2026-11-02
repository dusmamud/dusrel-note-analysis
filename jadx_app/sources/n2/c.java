package n2;

import java.io.IOException;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public interface c {

    public static class a extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f31547a;

        public a(Throwable th, int i10) {
            super(th);
            this.f31547a = i10;
        }
    }

    int a();

    void b(d.a aVar);

    void c(d.a aVar);

    UUID d();

    default boolean e() {
        return false;
    }

    boolean f(String str);

    a g();

    h2.b h();
}
