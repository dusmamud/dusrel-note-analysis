package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class bu implements nh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bu f7430a = new bu();

    @Override // com.google.android.gms.internal.ads.nh3
    public final boolean zza(int i10) {
        au auVar;
        if (i10 == 0) {
            auVar = au.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
        } else if (i10 == 1) {
            auVar = au.TWO_G;
        } else if (i10 != 2) {
            auVar = i10 != 4 ? null : au.LTE;
        } else {
            auVar = au.THREE_G;
        }
        return auVar != null;
    }
}
