package u1;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f34636a = new LinkedHashMap();

    /* JADX INFO: renamed from: u1.a$a, reason: collision with other inner class name */
    public static final class C0253a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0253a f34637b = new C0253a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return j.a(this.f34636a, ((a) obj).f34636a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34636a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f34636a + ')';
    }
}
