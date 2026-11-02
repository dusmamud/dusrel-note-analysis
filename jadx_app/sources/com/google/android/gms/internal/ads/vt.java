package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public enum vt implements lh3 {
    AD_INITIATER_UNSPECIFIED(0),
    BANNER(1),
    DFP_BANNER(2),
    INTERSTITIAL(3),
    DFP_INTERSTITIAL(4),
    NATIVE_EXPRESS(5),
    AD_LOADER(6),
    REWARD_BASED_VIDEO_AD(7),
    BANNER_SEARCH_ADS(8),
    GOOGLE_MOBILE_ADS_SDK_ADAPTER(9),
    APP_OPEN(10),
    REWARDED_INTERSTITIAL(11);

    public static final int zzm = 0;
    public static final int zzn = 1;
    public static final int zzo = 2;
    public static final int zzp = 3;
    public static final int zzq = 4;
    public static final int zzr = 5;
    public static final int zzs = 6;
    public static final int zzt = 7;
    public static final int zzu = 8;
    public static final int zzv = 9;
    public static final int zzw = 10;
    public static final int zzx = 11;
    private static final mh3<vt> zzy = new a();
    private final int zzz;

    public class a implements mh3<vt> {
    }

    vt(int i10) {
        this.zzz = i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzz);
    }

    @Override // com.google.android.gms.internal.ads.lh3
    public final int zza() {
        return this.zzz;
    }
}
