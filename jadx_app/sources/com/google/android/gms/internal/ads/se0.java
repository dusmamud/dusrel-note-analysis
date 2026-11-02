package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class se0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f15879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f15882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f15883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f15884f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f15885g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final JSONObject f15886h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f15887i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f15888j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f15889k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f15890l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f15891m;

    public se0(JSONObject jSONObject) {
        Long lValueOf;
        Long lValueOf2 = -1L;
        this.f15884f = jSONObject.optString(ImagesContract.URL);
        this.f15880b = jSONObject.optString("base_uri");
        this.f15881c = jSONObject.optString("post_parameters");
        this.f15882d = a(jSONObject.optString("drt_include"));
        this.f15891m = jSONObject.optString("content_type");
        this.f15890l = a(jSONObject.optString("use_compression"));
        this.f15883e = a(jSONObject.optString("cookies_include", com.amazon.a.a.o.b.af));
        jSONObject.optString("request_id");
        jSONObject.optString("type");
        String strOptString = jSONObject.optString("errors");
        this.f15879a = strOptString == null ? null : Arrays.asList(strOptString.split(com.amazon.a.a.o.b.f.f5855a));
        this.f15885g = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.f15886h = jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
        jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.f15887i = jSONObject.optString("pool_key");
        String strOptString2 = jSONObject.optString("start_time");
        if (TextUtils.isEmpty(strOptString2)) {
            lValueOf = lValueOf2;
        } else {
            try {
                lValueOf = Long.valueOf(strOptString2);
            } catch (NumberFormatException unused) {
                lValueOf = lValueOf2;
            }
        }
        this.f15888j = lValueOf.longValue();
        String strOptString3 = jSONObject.optString("end_time");
        if (!TextUtils.isEmpty(strOptString3)) {
            try {
                lValueOf2 = Long.valueOf(strOptString3);
            } catch (NumberFormatException unused2) {
            }
        }
        this.f15889k = lValueOf2.longValue();
    }

    public static boolean a(String str) {
        if (str != null) {
            return str.equals("1") || str.equals(com.amazon.a.a.o.b.af);
        }
        return false;
    }
}
