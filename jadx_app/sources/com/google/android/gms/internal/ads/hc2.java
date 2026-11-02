package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class hc2 implements nh3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final hc2 f10211b = new hc2(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hc2 f10212c = new hc2(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10213a;

    public /* synthetic */ hc2(int i10) {
        this.f10213a = i10;
    }

    @Override // com.google.android.gms.internal.ads.nh3
    public final boolean zza(int i10) {
        switch (this.f10213a) {
            case 0:
                return i10 == 1 || i10 == 2;
            default:
                return i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4;
        }
    }
}
