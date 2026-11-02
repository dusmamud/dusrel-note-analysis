package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class dr3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final dr3 f8463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final dr3 f8464c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8465a;

    static {
        dr3 dr3Var = new dr3(0L);
        f8463b = new dr3(Long.MAX_VALUE);
        f8464c = dr3Var;
    }

    public dr3(long j10) {
        this.f8465a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && dr3.class == obj.getClass() && this.f8465a == ((dr3) obj).f8465a;
    }

    public final int hashCode() {
        return ((int) this.f8465a) * 31;
    }
}
