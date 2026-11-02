package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class pu1 implements gy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f14498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14499b;

    public pu1(double d10, boolean z10) {
        this.f14498a = d10;
        this.f14499b = z10;
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundleA = j32.a(bundle, "device");
        bundle.putBundle("device", bundleA);
        Bundle bundleA2 = j32.a(bundleA, "battery");
        bundleA.putBundle("battery", bundleA2);
        bundleA2.putBoolean("is_charging", this.f14499b);
        bundleA2.putDouble("battery_level", this.f14498a);
    }
}
