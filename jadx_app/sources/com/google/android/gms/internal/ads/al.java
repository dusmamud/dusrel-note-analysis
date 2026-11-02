package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class al implements nh3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final al f6772b = new al(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final al f6773c = new al(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6774a;

    public /* synthetic */ al(int i10) {
        this.f6774a = i10;
    }

    @Override // com.google.android.gms.internal.ads.nh3
    public final boolean zza(int i10) {
        switch (this.f6774a) {
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
                        return true;
                    default:
                        return false;
                }
            default:
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
        }
    }
}
