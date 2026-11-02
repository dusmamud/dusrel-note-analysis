package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.net.Uri;
import com.google.android.gms.internal.ads.i00;
import com.google.android.gms.internal.ads.k00;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class CsiUrlBuilder {
    private final String zza;

    public CsiUrlBuilder() {
        i00 i00Var = (i00) k00.f11588a.get();
        String strA = "https://csi.gstatic.com/csi";
        if (i00Var != null) {
            strA = i00Var.a("gads:sdk_csi_server", "https://csi.gstatic.com/csi");
        } else if (k00.a() != null) {
            k00.a().zza();
        }
        this.zza = strA;
    }

    public String generateUrl(Map<String, String> map) {
        Uri.Builder builderBuildUpon = Uri.parse(this.zza).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return builderBuildUpon.build().toString();
    }
}
