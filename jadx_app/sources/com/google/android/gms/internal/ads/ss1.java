package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class ss1 implements gy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16111a;

    public ss1(String str) {
        this.f16111a = str;
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ((Bundle) obj).putString("ms", this.f16111a);
    }
}
