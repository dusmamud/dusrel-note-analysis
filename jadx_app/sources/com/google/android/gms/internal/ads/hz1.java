package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class hz1 implements gy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10534a;

    public hz1(String str) {
        this.f10534a = str;
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        try {
            ((JSONObject) obj).put("ms", this.f10534a);
        } catch (JSONException e10) {
            zze.zzb("Failed putting Ad ID.", e10);
        }
    }
}
