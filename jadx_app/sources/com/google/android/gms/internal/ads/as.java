package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class as {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6863c;

    public as(int i10, long j10, String str) {
        this.f6861a = j10;
        this.f6862b = str;
        this.f6863c = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof as)) {
            return false;
        }
        as asVar = (as) obj;
        return asVar.f6861a == this.f6861a && asVar.f6863c == this.f6863c;
    }

    public final int hashCode() {
        return (int) this.f6861a;
    }
}
