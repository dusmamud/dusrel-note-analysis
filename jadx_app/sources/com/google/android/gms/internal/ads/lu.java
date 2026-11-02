package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class lu implements nh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lu f12571a = new lu();

    @Override // com.google.android.gms.internal.ads.nh3
    public final boolean zza(int i10) {
        ku kuVar;
        if (i10 == 0) {
            kuVar = ku.UNSPECIFIED;
        } else if (i10 == 1) {
            kuVar = ku.CONNECTING;
        } else if (i10 == 2) {
            kuVar = ku.CONNECTED;
        } else if (i10 == 3) {
            kuVar = ku.DISCONNECTING;
        } else if (i10 != 4) {
            kuVar = i10 != 5 ? null : ku.SUSPENDED;
        } else {
            kuVar = ku.DISCONNECTED;
        }
        return kuVar != null;
    }
}
