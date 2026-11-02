package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class y6 implements d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Serializable f22516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Serializable f22517b;

    public rj a() {
        return new rj(Collections.unmodifiableMap((HashMap) this.f22516a), Collections.unmodifiableMap((HashMap) this.f22517b));
    }

    public void b(Enum r10, Object obj) {
        ((HashMap) this.f22516a).put(r10, obj);
        ((HashMap) this.f22517b).put(obj, r10);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.d3
    public String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token", (String) this.f22516a);
        jSONObject.put("returnSecureToken", true);
        String str = (String) this.f22517b;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
