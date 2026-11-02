package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class uw implements nh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uw f17330a = new uw();

    @Override // com.google.android.gms.internal.ads.nh3
    public final boolean zza(int i10) {
        tw twVar;
        if (i10 == 0) {
            twVar = tw.ENUM_FALSE;
        } else if (i10 != 1) {
            twVar = i10 != 1000 ? null : tw.ENUM_UNKNOWN;
        } else {
            twVar = tw.ENUM_TRUE;
        }
        return twVar != null;
    }
}
