package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class dq3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gx3 f8428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f8430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f8432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f8433f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f8434g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f8435h;

    public dq3(gx3 gx3Var, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12) {
        up2.a(!z12 || z10);
        up2.a(!z11 || z10);
        this.f8428a = gx3Var;
        this.f8429b = j10;
        this.f8430c = j11;
        this.f8431d = j12;
        this.f8432e = j13;
        this.f8433f = z10;
        this.f8434g = z11;
        this.f8435h = z12;
    }

    public final dq3 a(long j10, long j11) {
        return (j10 == this.f8429b && j11 == this.f8430c) ? this : new dq3(this.f8428a, j10, j11, this.f8431d, this.f8432e, this.f8433f, this.f8434g, this.f8435h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dq3.class == obj.getClass()) {
            dq3 dq3Var = (dq3) obj;
            if (this.f8429b == dq3Var.f8429b && this.f8431d == dq3Var.f8431d && this.f8432e == dq3Var.f8432e && this.f8433f == dq3Var.f8433f && this.f8434g == dq3Var.f8434g && this.f8435h == dq3Var.f8435h && Objects.equals(this.f8428a, dq3Var.f8428a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.f8428a.hashCode() + 527) * 31) + ((int) this.f8429b)) * 31) + ((int) this.f8431d)) * 31) + ((int) this.f8432e)) * 961) + (this.f8433f ? 1 : 0)) * 31) + (this.f8434g ? 1 : 0)) * 31) + (this.f8435h ? 1 : 0);
    }
}
