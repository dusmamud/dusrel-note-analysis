package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class xx1 implements gy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f19424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f19425e;

    public xx1(String str, String str2, String str3, String str4, Long l10) {
        this.f19421a = str;
        this.f19422b = str2;
        this.f19423c = str3;
        this.f19424d = str4;
        this.f19425e = l10;
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        j32.e(bundle, "gmp_app_id", this.f19421a);
        j32.e(bundle, "fbs_aiid", this.f19422b);
        j32.e(bundle, "fbs_aeid", this.f19423c);
        j32.e(bundle, "apm_id_origin", this.f19424d);
        Long l10 = this.f19425e;
        if (l10 != null) {
            bundle.putLong("sai_timeout", l10.longValue());
        }
    }
}
