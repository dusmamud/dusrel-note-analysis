package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class wy3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18818b;

    public wy3(long j10, long j11) {
        this.f18817a = j10;
        this.f18818b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wy3)) {
            return false;
        }
        wy3 wy3Var = (wy3) obj;
        return this.f18817a == wy3Var.f18817a && this.f18818b == wy3Var.f18818b;
    }

    public final int hashCode() {
        return (((int) this.f18817a) * 31) + ((int) this.f18818b);
    }
}
