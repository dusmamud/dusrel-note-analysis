package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class cv1 implements gy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f8051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f8052b;

    public cv1(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f8051a = jSONObject;
        this.f8052b = jSONObject2;
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        JSONObject jSONObject = this.f8051a;
        if (jSONObject != null) {
            bundle.putString("fwd_cld", jSONObject.toString());
        }
        JSONObject jSONObject2 = this.f8052b;
        if (jSONObject2 != null) {
            bundle.putString("fwd_common_cld", jSONObject2.toString());
        }
    }
}
