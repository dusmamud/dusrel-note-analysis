package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class yg2 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f19683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19684b;

    public yg2(Runnable runnable, long j10) {
        this.f19683a = runnable;
        this.f19684b = j10;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.f19684b, ((yg2) obj).f19684b);
    }
}
