package m7;

/* JADX INFO: loaded from: classes.dex */
public final class i extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n.b f31377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n.a f31378b;

    public i(n.b bVar, n.a aVar) {
        this.f31377a = bVar;
        this.f31378b = aVar;
    }

    @Override // m7.n
    public final n.a a() {
        return this.f31378b;
    }

    @Override // m7.n
    public final n.b b() {
        return this.f31377a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        n.b bVar = this.f31377a;
        if (bVar == null) {
            if (nVar.b() != null) {
                return false;
            }
        } else if (!bVar.equals(nVar.b())) {
            return false;
        }
        n.a aVar = this.f31378b;
        if (aVar == null) {
            return nVar.a() == null;
        }
        return aVar.equals(nVar.a());
    }

    public final int hashCode() {
        n.b bVar = this.f31377a;
        int iHashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        n.a aVar = this.f31378b;
        return (aVar != null ? aVar.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f31377a + ", mobileSubtype=" + this.f31378b + "}";
    }
}
