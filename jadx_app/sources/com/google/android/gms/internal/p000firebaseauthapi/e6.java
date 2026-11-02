package com.google.android.gms.internal.p000firebaseauthapi;

import io.flutter.plugins.firebase.auth.Constants;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class e6 implements d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f21320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f21321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f21322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f21323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f21324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f21325f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final vr f21326g = new vr(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final vr f21327h = new vr(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f21328i;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.d3
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("returnSecureToken", true);
        vr vrVar = this.f21327h;
        if (!((List) vrVar.f22397a).isEmpty()) {
            List list = (List) vrVar.f22397a;
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < list.size(); i10++) {
                jSONArray.put(list.get(i10));
            }
            jSONObject.put("deleteProvider", jSONArray);
        }
        List list2 = (List) this.f21326g.f22397a;
        int size = list2.size();
        int[] iArr = new int[size];
        for (int i11 = 0; i11 < list2.size(); i11++) {
            String str = (String) list2.get(i11);
            str.getClass();
            int i12 = 2;
            switch (str) {
                case "DISPLAY_NAME":
                    break;
                case "EMAIL":
                    i12 = 1;
                    break;
                case "PHOTO_URL":
                    i12 = 4;
                    break;
                case "PASSWORD":
                    i12 = 5;
                    break;
                default:
                    i12 = 0;
                    break;
            }
            iArr[i11] = i12;
        }
        if (size > 0) {
            JSONArray jSONArray2 = new JSONArray();
            for (int i13 = 0; i13 < size; i13++) {
                jSONArray2.put(iArr[i13]);
            }
            jSONObject.put("deleteAttribute", jSONArray2);
        }
        String str2 = this.f21320a;
        if (str2 != null) {
            jSONObject.put(Constants.ID_TOKEN, str2);
        }
        String str3 = this.f21322c;
        if (str3 != null) {
            jSONObject.put("email", str3);
        }
        String str4 = this.f21323d;
        if (str4 != null) {
            jSONObject.put("password", str4);
        }
        String str5 = this.f21321b;
        if (str5 != null) {
            jSONObject.put("displayName", str5);
        }
        String str6 = this.f21325f;
        if (str6 != null) {
            jSONObject.put("photoUrl", str6);
        }
        String str7 = this.f21324e;
        if (str7 != null) {
            jSONObject.put("oobCode", str7);
        }
        String str8 = this.f21328i;
        if (str8 != null) {
            jSONObject.put("tenantId", str8);
        }
        return jSONObject.toString();
    }
}
