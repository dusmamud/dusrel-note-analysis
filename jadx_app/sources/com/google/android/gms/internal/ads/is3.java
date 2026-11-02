package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class is3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final is3 f10966d = new hs3().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10969c;

    public /* synthetic */ is3(hs3 hs3Var) {
        this.f10967a = hs3Var.f10456a;
        this.f10968b = hs3Var.f10457b;
        this.f10969c = hs3Var.f10458c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || is3.class != obj.getClass()) {
            return false;
        }
        is3 is3Var = (is3) obj;
        return this.f10967a == is3Var.f10967a && this.f10968b == is3Var.f10968b && this.f10969c == is3Var.f10969c;
    }

    public final int hashCode() {
        int i10 = (this.f10967a ? 1 : 0) << 2;
        boolean z10 = this.f10968b;
        return (z10 ? 1 : 0) + (z10 ? 1 : 0) + i10 + (this.f10969c ? 1 : 0);
    }
}
