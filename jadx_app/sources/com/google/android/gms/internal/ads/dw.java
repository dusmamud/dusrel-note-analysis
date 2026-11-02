package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public enum dw implements lh3 {
    AD_FORMAT_TYPE_UNSPECIFIED(0),
    BANNER(1),
    INTERSTITIAL(2),
    NATIVE_EXPRESS(3),
    NATIVE_CONTENT(4),
    NATIVE_APP_INSTALL(5),
    NATIVE_CUSTOM_TEMPLATE(6),
    DFP_BANNER(7),
    DFP_INTERSTITIAL(8),
    REWARD_BASED_VIDEO_AD(9),
    BANNER_SEARCH_ADS(10);

    public static final int zzl = 0;
    public static final int zzm = 1;
    public static final int zzn = 2;
    public static final int zzo = 3;
    public static final int zzp = 4;
    public static final int zzq = 5;
    public static final int zzr = 6;
    public static final int zzs = 7;
    public static final int zzt = 8;
    public static final int zzu = 9;
    public static final int zzv = 10;
    private static final mh3<dw> zzw = new a();
    private final int zzx;

    public class a implements mh3<dw> {
    }

    dw(int i10) {
        this.zzx = i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzx);
    }

    @Override // com.google.android.gms.internal.ads.lh3
    public final int zza() {
        return this.zzx;
    }
}
