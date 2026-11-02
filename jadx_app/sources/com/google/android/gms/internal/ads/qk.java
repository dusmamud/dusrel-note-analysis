package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class qk implements nh3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final qk f14908b = new qk(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final qk f14909c = new qk(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14910a;

    public /* synthetic */ qk(int i10) {
        this.f14910a = i10;
    }

    @Override // com.google.android.gms.internal.ads.nh3
    public final boolean zza(int i10) {
        switch (this.f14910a) {
            case 0:
                switch (i10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        return true;
                    default:
                        return false;
                }
            default:
                return i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3;
        }
    }
}
