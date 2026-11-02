package m6;

import com.google.android.gms.internal.ads.ki;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31275b;

    public r(String workSpecId, int i10) {
        kotlin.jvm.internal.j.e(workSpecId, "workSpecId");
        this.f31274a = workSpecId;
        this.f31275b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return kotlin.jvm.internal.j.a(this.f31274a, rVar.f31274a) && this.f31275b == rVar.f31275b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31275b) + (this.f31274a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb2.append(this.f31274a);
        sb2.append(", generation=");
        return ki.b(sb2, this.f31275b, ')');
    }
}
