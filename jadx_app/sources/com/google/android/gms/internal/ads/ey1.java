package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class ey1 implements gy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f8966a;

    public ey1(Bundle bundle) {
        this.f8966a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundle2 = this.f8966a;
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("shared_pref", bundle2);
    }
}
