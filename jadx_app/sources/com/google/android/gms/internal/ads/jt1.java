package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class jt1 implements gy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11495b;

    public jt1(String str, boolean z10) {
        this.f11494a = str;
        this.f11495b = z10;
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.f11494a;
        if (str != null) {
            Bundle bundleA = j32.a(bundle, "pii");
            bundleA.putString("afai", str);
            bundleA.putBoolean("is_afai_lat", this.f11495b);
        }
    }
}
