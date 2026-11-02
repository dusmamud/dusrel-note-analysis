package com.google.android.gms.internal.p000firebaseauthapi;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class u5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f22290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f22291b;

    public static u5 a(String str) throws UnsupportedEncodingException {
        try {
            u5 u5Var = new u5();
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.optString("iss");
            jSONObject.optString("aud");
            jSONObject.optString("sub");
            u5Var.f22290a = Long.valueOf(jSONObject.optLong("iat"));
            u5Var.f22291b = Long.valueOf(jSONObject.optLong("exp"));
            jSONObject.optBoolean("is_anonymous");
            return u5Var;
        } catch (JSONException e10) {
            if (Log.isLoggable("JwtToken", 3)) {
                Log.d("JwtToken", "Failed to read JwtToken from JSONObject. ".concat(String.valueOf(e10)));
            }
            throw new UnsupportedEncodingException("Failed to read JwtToken from JSONObject. ".concat(String.valueOf(e10)));
        }
    }
}
