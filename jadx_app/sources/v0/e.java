package v0;

/* JADX INFO: loaded from: classes.dex */
public final class e<T> extends d<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f35155c;

    public e() {
        super(12);
        this.f35155c = new Object();
    }

    @Override // v0.d
    public final T a() {
        T t6;
        synchronized (this.f35155c) {
            t6 = (T) super.a();
        }
        return t6;
    }

    @Override // v0.d
    public final boolean b(T t6) {
        boolean zB;
        synchronized (this.f35155c) {
            zB = super.b(t6);
        }
        return zB;
    }
}
