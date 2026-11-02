package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class dw1 implements gy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8528a;

    public dw1(boolean z10) {
        this.f8528a = z10;
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ((Bundle) obj).putBoolean("is_gbid", this.f8528a);
    }
}
