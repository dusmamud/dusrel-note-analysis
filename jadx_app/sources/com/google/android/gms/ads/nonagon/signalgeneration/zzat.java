package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.vt;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zzat {
    private final String zza;

    public final Set zza() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.zza.toLowerCase(Locale.ROOT));
        return hashSet;
    }

    public final String zzb() {
        return this.zza.toLowerCase(Locale.ROOT);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final vt zzc() {
        String str = this.zza;
        switch (str.hashCode()) {
            case -1999289321:
                if (str.equals("NATIVE")) {
                    return vt.AD_LOADER;
                }
                break;
            case -1372958932:
                if (str.equals("INTERSTITIAL")) {
                    return vt.INTERSTITIAL;
                }
                break;
            case 543046670:
                if (str.equals("REWARDED")) {
                    return vt.REWARD_BASED_VIDEO_AD;
                }
                break;
            case 1951953708:
                if (str.equals("BANNER")) {
                    return vt.BANNER;
                }
                break;
        }
        return vt.AD_INITIATER_UNSPECIFIED;
    }
}
