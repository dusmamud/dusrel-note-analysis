package l9;

import android.content.Context;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f30834a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap<String, sc.m<String, JSONObject>> f30835b = new HashMap<>();

    public final synchronized JSONObject a(Context context, String str) {
        JSONObject jSONObject = null;
        String string = context.getSharedPreferences("inotes_home_widget", 0).getString(str, null);
        if (string == null) {
            return null;
        }
        sc.m<String, JSONObject> mVar = f30835b.get(str);
        if (mVar != null) {
            String str2 = mVar.f34199a;
            JSONObject jSONObject2 = mVar.f34200b;
            if (str2 == string) {
                return jSONObject2;
            }
        }
        try {
            JSONObject jSONObject3 = new JSONObject(string);
            if (jSONObject3.optInt("version") == 3) {
                jSONObject = jSONObject3;
            }
        } catch (Throwable unused) {
        }
        f30835b.put(str, new sc.m<>(string, jSONObject));
        return jSONObject;
    }
}
