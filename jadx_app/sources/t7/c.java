package t7;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class c extends e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f34377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<e.b> f34378c;

    public c(long j10, long j11, Set set) {
        this.f34376a = j10;
        this.f34377b = j11;
        this.f34378c = set;
    }

    @Override // t7.e.a
    public final long a() {
        return this.f34376a;
    }

    @Override // t7.e.a
    public final Set<e.b> b() {
        return this.f34378c;
    }

    @Override // t7.e.a
    public final long c() {
        return this.f34377b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e.a)) {
            return false;
        }
        e.a aVar = (e.a) obj;
        return this.f34376a == aVar.a() && this.f34377b == aVar.c() && this.f34378c.equals(aVar.b());
    }

    public final int hashCode() {
        long j10 = this.f34376a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f34377b;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f34378c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f34376a + ", maxAllowedDelay=" + this.f34377b + ", flags=" + this.f34378c + "}";
    }
}
