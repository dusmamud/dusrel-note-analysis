package k7;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29963a;

    public b(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f29963a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f29963a.equals(((b) obj).f29963a);
    }

    public final int hashCode() {
        return this.f29963a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return androidx.concurrent.futures.c.a(new StringBuilder("Encoding{name=\""), this.f29963a, "\"}");
    }
}
