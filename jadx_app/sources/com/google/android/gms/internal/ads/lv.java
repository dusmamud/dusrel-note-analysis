package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class lv implements nh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lv f12577a = new lv();

    @Override // com.google.android.gms.internal.ads.nh3
    public final boolean zza(int i10) {
        kv kvVar;
        if (i10 != 0) {
            kvVar = i10 != 1 ? null : kv.IN_MEMORY;
        } else {
            kvVar = kv.UNSPECIFIED;
        }
        return kvVar != null;
    }
}
