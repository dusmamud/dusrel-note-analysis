package com.amazon.device.iap.internal.a.a;

import com.amazon.a.a.o.f;
import com.amazon.device.iap.model.Promotion;
import com.amazon.device.iap.model.PromotionPlan;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class e {
    public static List<Promotion> a(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray(com.amazon.a.a.o.b.f5820q);
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(b(jSONArray.getJSONObject(i10)));
        }
        return arrayList;
    }

    private static Promotion b(JSONObject jSONObject) throws JSONException {
        return new Promotion(jSONObject.getString(com.amazon.a.a.o.b.f5821r), a(jSONObject.getJSONArray(com.amazon.a.a.o.b.f5822s)));
    }

    private static PromotionPlan c(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        String string = jSONObject.getString(com.amazon.a.a.o.b.f5823t);
        int i10 = jSONObject.getInt(com.amazon.a.a.o.b.f5824u);
        String strOptString = jSONObject.optString(com.amazon.a.a.o.b.f5825v);
        if (f.a(strOptString) && (jSONObject2 = jSONObject.getJSONObject(com.amazon.a.a.o.b.f5826w)) != null) {
            Currency currency = Currency.getInstance(jSONObject2.getString(com.amazon.a.a.o.b.f5799a));
            strOptString = currency.getSymbol() + new BigDecimal(jSONObject2.getString(com.amazon.a.a.o.b.Y));
        }
        return new PromotionPlan(string, strOptString, i10);
    }

    private static List<PromotionPlan> a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(c(jSONArray.getJSONObject(i10)));
        }
        return arrayList;
    }
}
