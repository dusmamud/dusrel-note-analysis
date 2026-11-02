package com.google.android.gms.internal.p000firebaseauthapi;

import io.flutter.plugins.firebase.auth.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class b6 implements d3 {
    public abstract g5 a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract String e();

    @Override // com.google.android.gms.internal.p000firebaseauthapi.d3
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.ID_TOKEN, b());
        jSONObject.put("token", e());
        jSONObject.put(Constants.PROVIDER_ID, c());
        jSONObject.put("tokenType", a().toString());
        jSONObject.put("tenantId", d());
        return jSONObject.toString();
    }
}
