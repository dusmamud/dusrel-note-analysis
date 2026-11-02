package y8;

/* JADX INFO: loaded from: classes2.dex */
public final class r<T> implements o<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f37206c = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile o<T> f37207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T f37208b;

    @Override // y8.o
    public final T get() {
        o<T> oVar = this.f37207a;
        q qVar = f37206c;
        if (oVar != qVar) {
            synchronized (this) {
                try {
                    if (this.f37207a != qVar) {
                        T t6 = this.f37207a.get();
                        this.f37208b = t6;
                        this.f37207a = qVar;
                        return t6;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f37208b;
    }

    public final String toString() {
        Object obj = this.f37207a;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (obj == f37206c) {
            obj = "<supplier that returned " + this.f37208b + ">";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
