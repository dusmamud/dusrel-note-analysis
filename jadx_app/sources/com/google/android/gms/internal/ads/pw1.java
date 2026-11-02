package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class pw1 implements gy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f14516a;

    public pw1(Bundle bundle) {
        this.f14516a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundleA = j32.a(bundle, "device");
        bundleA.putBundle("android_mem_info", this.f14516a);
        bundle.putBundle("device", bundleA);
    }
}
