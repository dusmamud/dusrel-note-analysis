package ua;

/* JADX INFO: loaded from: classes2.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f34898a;

    public t(Boolean bool) {
        this.f34898a = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && kotlin.jvm.internal.j.a(this.f34898a, ((t) obj).f34898a);
    }

    public final int hashCode() {
        Boolean bool = this.f34898a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "PostReceiptProductInfo(shouldConsume=" + this.f34898a + ')';
    }
}
