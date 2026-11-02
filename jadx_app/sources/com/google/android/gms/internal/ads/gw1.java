package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class gw1 implements gy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f9979a;

    public gw1(Boolean bool) {
        this.f9979a = bool;
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        Boolean bool = this.f9979a;
        if (bool != null) {
            bundle.putBoolean("hw_accel", bool.booleanValue());
        }
    }
}
