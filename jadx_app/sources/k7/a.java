package k7;

/* JADX INFO: loaded from: classes.dex */
public final class a<T> extends c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f29961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f29962b;

    /* JADX WARN: Multi-variable type inference failed */
    public a(Object obj, d dVar) {
        if (obj == 0) {
            throw new NullPointerException("Null payload");
        }
        this.f29961a = obj;
        if (dVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.f29962b = dVar;
    }

    @Override // k7.c
    public final Integer a() {
        return null;
    }

    @Override // k7.c
    public final T b() {
        return this.f29961a;
    }

    @Override // k7.c
    public final d c() {
        return this.f29962b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return cVar.a() == null && this.f29961a.equals(cVar.b()) && this.f29962b.equals(cVar.c());
    }

    public final int hashCode() {
        return this.f29962b.hashCode() ^ (((1000003 * 1000003) ^ this.f29961a.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f29961a + ", priority=" + this.f29962b + "}";
    }
}
