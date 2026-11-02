package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class qy1 implements gy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f15089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15090f;

    public qy1(String str, int i10, int i11, int i12, boolean z10, int i13) {
        this.f15085a = str;
        this.f15086b = i10;
        this.f15087c = i11;
        this.f15088d = i12;
        this.f15089e = z10;
        this.f15090f = i13;
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.f15085a;
        j32.b(bundle, "carrier", str, !TextUtils.isEmpty(str));
        int i10 = this.f15086b;
        j32.c(bundle, "cnt", i10, i10 != -2);
        bundle.putInt("gnt", this.f15087c);
        bundle.putInt("pt", this.f15088d);
        Bundle bundleA = j32.a(bundle, "device");
        bundle.putBundle("device", bundleA);
        Bundle bundleA2 = j32.a(bundleA, "network");
        bundleA.putBundle("network", bundleA2);
        bundleA2.putInt("active_network_state", this.f15090f);
        bundleA2.putBoolean("active_network_metered", this.f15089e);
    }
}
