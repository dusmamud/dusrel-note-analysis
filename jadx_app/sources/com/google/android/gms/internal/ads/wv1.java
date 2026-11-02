package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class wv1 implements gy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18779b;

    public wv1(String str, boolean z10) {
        this.f18778a = str;
        this.f18779b = z10;
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("gct", this.f18778a);
        if (this.f18779b) {
            bundle.putString("de", "1");
        }
    }
}
