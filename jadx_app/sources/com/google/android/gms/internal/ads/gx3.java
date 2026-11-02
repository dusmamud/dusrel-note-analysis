package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class gx3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9988e;

    public gx3(Object obj, int i10, int i11, long j10, int i12) {
        this.f9984a = obj;
        this.f9985b = i10;
        this.f9986c = i11;
        this.f9987d = j10;
        this.f9988e = i12;
    }

    public final gx3 a(Object obj) {
        return this.f9984a.equals(obj) ? this : new gx3(obj, this.f9985b, this.f9986c, this.f9987d, this.f9988e);
    }

    public final boolean b() {
        return this.f9985b != -1;
    }

    public final boolean c(gx3 gx3Var) {
        if (gx3Var == null) {
            return false;
        }
        if (this == gx3Var) {
            return true;
        }
        return this.f9984a.equals(gx3Var.f9984a) && this.f9985b == gx3Var.f9985b && this.f9986c == gx3Var.f9986c && this.f9987d == gx3Var.f9987d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gx3)) {
            return false;
        }
        gx3 gx3Var = (gx3) obj;
        return c(gx3Var) && this.f9988e == gx3Var.f9988e;
    }

    public final int hashCode() {
        return ((((((((this.f9984a.hashCode() + 527) * 31) + this.f9985b) * 31) + this.f9986c) * 31) + ((int) this.f9987d)) * 31) + this.f9988e;
    }

    public gx3(long j10, Object obj) {
        this(obj, -1, -1, j10, -1);
    }

    public gx3(Object obj, int i10, long j10) {
        this(obj, -1, -1, j10, i10);
    }
}
