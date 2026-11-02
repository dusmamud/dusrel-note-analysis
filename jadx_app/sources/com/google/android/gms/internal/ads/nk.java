package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class nk implements nh3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final nk f13343b = new nk(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final nk f13344c = new nk(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13345a;

    public /* synthetic */ nk(int i10) {
        this.f13345a = i10;
    }

    @Override // com.google.android.gms.internal.ads.nh3
    public final boolean zza(int i10) {
        switch (this.f13345a) {
            case 0:
                switch (i10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return true;
                    default:
                        return false;
                }
            default:
                return i10 == 0 || i10 == 1;
        }
    }
}
