package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class wt1 implements gy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18757b;

    public wt1(String str, int i10) {
        this.f18756a = str;
        this.f18757b = i10;
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        int i10;
        Bundle bundle = (Bundle) obj;
        String str = this.f18756a;
        if (TextUtils.isEmpty(str) || (i10 = this.f18757b) == -1) {
            return;
        }
        Bundle bundleA = j32.a(bundle, "pii");
        bundle.putBundle("pii", bundleA);
        bundleA.putString("pvid", str);
        bundleA.putInt("pvid_s", i10);
    }
}
