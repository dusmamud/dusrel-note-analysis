package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class os1 implements gy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13957a;

    public os1(String str) {
        this.f13957a = str;
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.f13957a;
        if (str != null) {
            bundle.putString("arek", str);
        }
    }
}
