package sc;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class p<A, B, C> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f34207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B f34208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C f34209c;

    /* JADX WARN: Multi-variable type inference failed */
    public p(String str, String str2, Object obj) {
        this.f34207a = obj;
        this.f34208b = str;
        this.f34209c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.j.a(this.f34207a, pVar.f34207a) && kotlin.jvm.internal.j.a(this.f34208b, pVar.f34208b) && kotlin.jvm.internal.j.a(this.f34209c, pVar.f34209c);
    }

    public final int hashCode() {
        A a10 = this.f34207a;
        int iHashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f34208b;
        int iHashCode2 = (iHashCode + (b10 == null ? 0 : b10.hashCode())) * 31;
        C c10 = this.f34209c;
        return iHashCode2 + (c10 != null ? c10.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f34207a + ", " + this.f34208b + ", " + this.f34209c + ')';
    }
}
