package qb;

import com.google.android.gms.internal.ads.ki;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f33407b;

    public d(int i10, int i11) {
        this.f33406a = i10;
        this.f33407b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f33406a == dVar.f33406a && this.f33407b == dVar.f33407b;
    }

    public final int hashCode() {
        return (this.f33406a * 31) + this.f33407b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GoogleInstallmentsInfo(commitmentPaymentsCount=");
        sb2.append(this.f33406a);
        sb2.append(", renewalCommitmentPaymentsCount=");
        return ki.b(sb2, this.f33407b, ')');
    }
}
