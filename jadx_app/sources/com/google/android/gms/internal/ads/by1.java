package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class by1 implements gy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7513a;

    @Override // com.google.android.gms.internal.ads.gy1
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.f7513a) {
            bundle.putBoolean("sdk_prefetch", true);
        }
    }
}
