package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ay3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6966b;

    public ay3(int i10, boolean z10) {
        this.f6965a = i10;
        this.f6966b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ay3.class != obj.getClass()) {
            return false;
        }
        ay3 ay3Var = (ay3) obj;
        return this.f6965a == ay3Var.f6965a && this.f6966b == ay3Var.f6966b;
    }

    public final int hashCode() {
        return (this.f6965a * 31) + (this.f6966b ? 1 : 0);
    }
}
