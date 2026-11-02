package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public enum cv implements lh3 {
    VIDEO_ERROR_CODE_UNSPECIFIED(0),
    OPENGL_RENDERING_FAILED(1),
    CACHE_LOAD_FAILED(2),
    ANDROID_TARGET_API_TOO_LOW(3);

    public static final int zze = 0;
    public static final int zzf = 1;
    public static final int zzg = 2;
    public static final int zzh = 3;
    private static final mh3<cv> zzi = new a();
    private final int zzj;

    public class a implements mh3<cv> {
    }

    cv(int i10) {
        this.zzj = i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.lh3
    public final int zza() {
        return this.zzj;
    }
}
