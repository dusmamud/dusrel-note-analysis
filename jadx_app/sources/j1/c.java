package j1;

import java.util.Map;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f29079a;

        public a(String name) {
            j.e(name, "name");
            this.f29079a = name;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            return j.a(this.f29079a, ((a) obj).f29079a);
        }

        public final int hashCode() {
            return this.f29079a.hashCode();
        }

        public final String toString() {
            return this.f29079a;
        }
    }

    public static final class b<T> {
    }

    public abstract Map<a<?>, Object> a();

    public abstract <T> boolean b(a<T> aVar);

    public abstract <T> T c(a<T> aVar);
}
