package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class o5 implements d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21958b;

    public o5(String str, String str2) {
        this.f21957a = str;
        this.f21958b = str2;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.d3
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.f21957a;
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("tenantId", str);
        }
        if (!TextUtils.isEmpty("CLIENT_TYPE_ANDROID")) {
            jSONObject.put("clientType", "CLIENT_TYPE_ANDROID");
        }
        String str2 = this.f21958b;
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put("recaptchaVersion", str2);
        }
        return jSONObject.toString();
    }
}
