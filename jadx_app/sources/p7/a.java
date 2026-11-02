package p7;

/* JADX INFO: loaded from: classes.dex */
public final class a<T> implements rc.a<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f32905c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile b f32906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f32907b;

    public static rc.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        a aVar = new a();
        aVar.f32907b = f32905c;
        aVar.f32906a = bVar;
        return aVar;
    }

    @Override // rc.a
    public final T get() {
        T t6;
        T t10 = (T) this.f32907b;
        Object obj = f32905c;
        if (t10 != obj) {
            return t10;
        }
        synchronized (this) {
            try {
                t6 = (T) this.f32907b;
                if (t6 == obj) {
                    t6 = this.f32906a.get();
                    Object obj2 = this.f32907b;
                    if (obj2 != obj && obj2 != t6) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + t6 + ". This is likely due to a circular dependency.");
                    }
                    this.f32907b = t6;
                    this.f32906a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t6;
    }
}
