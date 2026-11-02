package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ew implements nh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ew f8947a = new ew();

    @Override // com.google.android.gms.internal.ads.nh3
    public final boolean zza(int i10) {
        dw dwVar;
        switch (i10) {
            case 0:
                dwVar = dw.AD_FORMAT_TYPE_UNSPECIFIED;
                break;
            case 1:
                dwVar = dw.BANNER;
                break;
            case 2:
                dwVar = dw.INTERSTITIAL;
                break;
            case 3:
                dwVar = dw.NATIVE_EXPRESS;
                break;
            case 4:
                dwVar = dw.NATIVE_CONTENT;
                break;
            case 5:
                dwVar = dw.NATIVE_APP_INSTALL;
                break;
            case 6:
                dwVar = dw.NATIVE_CUSTOM_TEMPLATE;
                break;
            case 7:
                dwVar = dw.DFP_BANNER;
                break;
            case 8:
                dwVar = dw.DFP_INTERSTITIAL;
                break;
            case 9:
                dwVar = dw.REWARD_BASED_VIDEO_AD;
                break;
            case 10:
                dwVar = dw.BANNER_SEARCH_ADS;
                break;
            default:
                dwVar = null;
                break;
        }
        return dwVar != null;
    }
}
