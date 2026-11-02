package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class et1 implements gy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f8933a;

    public et1(Bundle bundle) {
        this.f8933a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundle2 = this.f8933a;
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("installed_adapter_data", bundle2);
    }
}
