package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class wt implements nh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wt f18749a = new wt();

    @Override // com.google.android.gms.internal.ads.nh3
    public final boolean zza(int i10) {
        vt vtVar;
        switch (i10) {
            case 0:
                vtVar = vt.AD_INITIATER_UNSPECIFIED;
                break;
            case 1:
                vtVar = vt.BANNER;
                break;
            case 2:
                vtVar = vt.DFP_BANNER;
                break;
            case 3:
                vtVar = vt.INTERSTITIAL;
                break;
            case 4:
                vtVar = vt.DFP_INTERSTITIAL;
                break;
            case 5:
                vtVar = vt.NATIVE_EXPRESS;
                break;
            case 6:
                vtVar = vt.AD_LOADER;
                break;
            case 7:
                vtVar = vt.REWARD_BASED_VIDEO_AD;
                break;
            case 8:
                vtVar = vt.BANNER_SEARCH_ADS;
                break;
            case 9:
                vtVar = vt.GOOGLE_MOBILE_ADS_SDK_ADAPTER;
                break;
            case 10:
                vtVar = vt.APP_OPEN;
                break;
            case 11:
                vtVar = vt.REWARDED_INTERSTITIAL;
                break;
            default:
                vtVar = null;
                break;
        }
        return vtVar != null;
    }
}
