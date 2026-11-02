package com.google.android.gms.internal.p000firebaseauthapi;

import io.flutter.plugins.firebase.auth.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class u4 implements d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f22289a;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.d3
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.ID_TOKEN, this.f22289a);
        return jSONObject.toString();
    }
}
