package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class ex1 implements gy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f8957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f8960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f8961f;

    public ex1(String str, Integer num, String str2, String str3, String str4, String str5) {
        this.f8956a = str;
        this.f8957b = num;
        this.f8958c = str2;
        this.f8959d = str3;
        this.f8960e = str4;
        this.f8961f = str5;
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        j32.e(bundle, "pn", this.f8956a);
        Integer num = this.f8957b;
        if (num != null) {
            bundle.putInt("vc", num.intValue());
        }
        j32.e(bundle, "vnm", this.f8958c);
        j32.e(bundle, "dl", this.f8959d);
        j32.e(bundle, "ins_pn", this.f8960e);
        j32.e(bundle, "ini_pn", this.f8961f);
    }
}
