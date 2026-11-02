package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class n8 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13212c;

    public /* synthetic */ n8(long j10, long j11, long j12) {
        this.f13210a = j10;
        this.f13211b = j11;
        this.f13212c = j12;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.f13210a, ((n8) obj).f13210a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n8)) {
            return false;
        }
        n8 n8Var = (n8) obj;
        return this.f13210a == n8Var.f13210a && this.f13211b == n8Var.f13211b && this.f13212c == n8Var.f13212c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f13210a), Long.valueOf(this.f13211b), Long.valueOf(this.f13212c));
    }
}
