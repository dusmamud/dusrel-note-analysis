package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class hx1 implements gy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f10514a;

    public hx1(Bundle bundle) {
        this.f10514a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundle2 = this.f10514a;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }
}
