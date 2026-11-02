package s8;

import android.content.Intent;
import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class w {
    public static Intent a(Map map, String str, String str2) {
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").authority("play.google.com").path("store/apps/details").appendQueryParameter("id", str).appendQueryParameter("referrer", str2);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                if (!str3.equals("id") && !str3.equals("referrer")) {
                    builderAppendQueryParameter.appendQueryParameter(str3, (String) entry.getValue());
                }
            }
        }
        Intent intent = new Intent("android.intent.action.VIEW", builderAppendQueryParameter.build());
        intent.setPackage("com.android.vending");
        return intent;
    }

    public static Intent b(String str, String str2, String str3, Map map) {
        Intent intent = new Intent("android.intent.action.VIEW", c(map, str, str2));
        intent.setPackage("com.android.vending");
        intent.putExtra("overlay", true);
        intent.putExtra("callerId", str3);
        intent.putExtra("hsdp_caller_source", "hpoa");
        return intent;
    }

    public static Uri c(Map map, String str, String str2) {
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").authority("play.google.com").path("d").appendQueryParameter("id", str).appendQueryParameter("referrer", str2);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                if (!str3.equals("id") && !str3.equals("referrer")) {
                    builderAppendQueryParameter.appendQueryParameter(str3, (String) entry.getValue());
                }
            }
        }
        return builderAppendQueryParameter.build();
    }
}
