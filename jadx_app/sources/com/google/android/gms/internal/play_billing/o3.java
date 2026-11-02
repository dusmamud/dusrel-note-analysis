package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
public final class o3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f22750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22751b;

    public o3(Object obj, int i10) {
        this.f22750a = obj;
        this.f22751b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o3)) {
            return false;
        }
        o3 o3Var = (o3) obj;
        return this.f22750a == o3Var.f22750a && this.f22751b == o3Var.f22751b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f22750a) * 65535) + this.f22751b;
    }
}
