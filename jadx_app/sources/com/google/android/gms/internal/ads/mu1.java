package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class mu1 implements gy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13004a;

    public mu1(boolean z10) {
        this.f13004a = z10;
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ((Bundle) obj).putBoolean("ibrr", this.f13004a);
    }
}
