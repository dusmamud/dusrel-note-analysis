package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class du implements nh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final du f8500a = new du();

    @Override // com.google.android.gms.internal.ads.nh3
    public final boolean zza(int i10) {
        cu cuVar;
        if (i10 == 0) {
            cuVar = cu.NETWORKTYPE_UNSPECIFIED;
        } else if (i10 != 1) {
            cuVar = i10 != 2 ? null : cu.WIFI;
        } else {
            cuVar = cu.CELL;
        }
        return cuVar != null;
    }
}
