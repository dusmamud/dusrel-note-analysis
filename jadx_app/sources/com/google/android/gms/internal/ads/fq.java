package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class fq implements nh3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final fq f9293b = new fq(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final fq f9294c = new fq(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9295a;

    public /* synthetic */ fq(int i10) {
        this.f9295a = i10;
    }

    @Override // com.google.android.gms.internal.ads.nh3
    public final boolean zza(int i10) {
        switch (this.f9295a) {
            case 0:
                return gq.a(i10) != null;
            default:
                return i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5;
        }
    }
}
