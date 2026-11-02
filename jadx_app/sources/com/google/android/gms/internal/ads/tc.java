package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class tc implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pc f16353b;

    public tc(int i10, pc pcVar) {
        this.f16352a = i10;
        this.f16353b = pcVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.f16352a, ((tc) obj).f16352a);
    }
}
