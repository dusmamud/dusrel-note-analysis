package sc;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class m<A, B> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f34199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B f34200b;

    public m(A a10, B b10) {
        this.f34199a = a10;
        this.f34200b = b10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.j.a(this.f34199a, mVar.f34199a) && kotlin.jvm.internal.j.a(this.f34200b, mVar.f34200b);
    }

    public final int hashCode() {
        A a10 = this.f34199a;
        int iHashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f34200b;
        return iHashCode + (b10 != null ? b10.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f34199a + ", " + this.f34200b + ')';
    }
}
