package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class dv implements nh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dv f8515a = new dv();

    @Override // com.google.android.gms.internal.ads.nh3
    public final boolean zza(int i10) {
        cv cvVar;
        if (i10 == 0) {
            cvVar = cv.VIDEO_ERROR_CODE_UNSPECIFIED;
        } else if (i10 == 1) {
            cvVar = cv.OPENGL_RENDERING_FAILED;
        } else if (i10 != 2) {
            cvVar = i10 != 3 ? null : cv.ANDROID_TARGET_API_TOO_LOW;
        } else {
            cvVar = cv.CACHE_LOAD_FAILED;
        }
        return cvVar != null;
    }
}
