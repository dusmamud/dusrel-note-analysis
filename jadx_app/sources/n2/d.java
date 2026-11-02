package n2;

import java.util.concurrent.CopyOnWriteArrayList;
import x2.y;

/* JADX INFO: loaded from: classes.dex */
public interface d {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f31548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final y.b f31549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CopyOnWriteArrayList<C0211a> f31550c;

        /* JADX INFO: renamed from: n2.d$a$a, reason: collision with other inner class name */
        public static final class C0211a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Object f31551a;
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public a(CopyOnWriteArrayList<C0211a> copyOnWriteArrayList, int i10, y.b bVar) {
            this.f31550c = copyOnWriteArrayList;
            this.f31548a = i10;
            this.f31549b = bVar;
        }
    }
}
