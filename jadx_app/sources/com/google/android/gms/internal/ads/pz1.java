package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class pz1 implements gy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f14568a;

    public pz1(JSONObject jSONObject) {
        this.f14568a = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        try {
            ((JSONObject) obj).put("cache_state", this.f14568a);
        } catch (JSONException unused) {
            zze.zza("Unable to get cache_state");
        }
    }
}
