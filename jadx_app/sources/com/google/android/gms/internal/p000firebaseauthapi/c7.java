package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;
import io.flutter.plugins.firebase.auth.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class c7 implements d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f21228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f21229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f21230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f21231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f21232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f21233f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f21234g;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.d3
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(this.f21231d)) {
            jSONObject.put("sessionInfo", this.f21229b);
            jSONObject.put("code", this.f21230c);
        } else {
            jSONObject.put("phoneNumber", this.f21228a);
            jSONObject.put("temporaryProof", this.f21231d);
        }
        String str = this.f21232e;
        if (str != null) {
            jSONObject.put(Constants.ID_TOKEN, str);
        }
        if (!this.f21233f) {
            jSONObject.put("operation", 2);
        }
        String str2 = this.f21234g;
        if (str2 != null) {
            jSONObject.put("tenantId", str2);
        }
        return jSONObject.toString();
    }
}
