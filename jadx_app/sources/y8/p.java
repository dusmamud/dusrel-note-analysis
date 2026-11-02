package y8;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class p<T> implements o<T>, Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d3.d f37203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile transient boolean f37204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient T f37205c;

    public p(d3.d delegate) {
        this.f37203a = delegate;
    }

    @Override // y8.o
    public final T get() {
        if (!this.f37204b) {
            synchronized (this) {
                try {
                    if (!this.f37204b) {
                        T t6 = (T) this.f37203a.get();
                        this.f37205c = t6;
                        this.f37204b = true;
                        return t6;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f37205c;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (this.f37204b) {
            obj = "<supplier that returned " + this.f37205c + ">";
        } else {
            obj = this.f37203a;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
