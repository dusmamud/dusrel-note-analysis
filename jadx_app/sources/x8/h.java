package x8;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f36608c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile k f36609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f36610b;

    /* JADX WARN: Multi-variable type inference failed */
    public static h b(i iVar) {
        if (iVar instanceof h) {
            return (h) iVar;
        }
        h hVar = new h();
        hVar.f36610b = f36608c;
        hVar.f36609a = iVar;
        return hVar;
    }

    @Override // x8.k
    public final Object a() {
        Object objA;
        Object obj = this.f36610b;
        Object obj2 = f36608c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objA = this.f36610b;
                if (objA == obj2) {
                    objA = this.f36609a.a();
                    Object obj3 = this.f36610b;
                    if (obj3 != obj2 && obj3 != objA) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objA + ". This is likely due to a circular dependency.");
                    }
                    this.f36610b = objA;
                    this.f36609a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objA;
    }
}
