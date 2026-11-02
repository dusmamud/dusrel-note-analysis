package u4;

import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f34651b;

    /* JADX INFO: renamed from: u4.a$a, reason: collision with other inner class name */
    public static final class C0257a {
    }

    public a(String str, boolean z10) {
        this.f34650a = str;
        this.f34651b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j.a(this.f34650a, aVar.f34650a) && this.f34651b == aVar.f34651b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f34651b) + (this.f34650a.hashCode() * 31);
    }

    public final String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.f34650a + ", shouldRecordObservation=" + this.f34651b;
    }
}
