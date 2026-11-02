package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class ds1 implements gy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8466a;

    public ds1(boolean z10) {
        this.f8466a = z10;
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ((Bundle) obj).putString("adid_p", true != this.f8466a ? "0" : "1");
    }
}
