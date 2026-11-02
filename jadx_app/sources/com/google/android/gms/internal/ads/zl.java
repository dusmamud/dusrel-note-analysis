package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zl implements nh3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zl f20262b = new zl(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zl f20263c = new zl(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20264a;

    public /* synthetic */ zl(int i10) {
        this.f20264a = i10;
    }

    @Override // com.google.android.gms.internal.ads.nh3
    public final boolean zza(int i10) {
        switch (this.f20264a) {
            case 0:
                return i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4;
            default:
                return i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3;
        }
    }
}
