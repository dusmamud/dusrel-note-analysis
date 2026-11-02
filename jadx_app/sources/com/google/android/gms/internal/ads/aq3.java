package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class aq3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f6846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6847c;

    public /* synthetic */ aq3(zp3 zp3Var) {
        this.f6845a = zp3Var.f20325a;
        this.f6846b = zp3Var.f20326b;
        this.f6847c = zp3Var.f20327c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq3)) {
            return false;
        }
        aq3 aq3Var = (aq3) obj;
        return this.f6845a == aq3Var.f6845a && this.f6846b == aq3Var.f6846b && this.f6847c == aq3Var.f6847c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f6845a), Float.valueOf(this.f6846b), Long.valueOf(this.f6847c));
    }
}
