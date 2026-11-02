package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public enum qw implements lh3 {
    PLATFORM_UNSPECIFIED(0),
    IOS(1),
    ANDROID(2);

    public static final int zzd = 0;
    public static final int zze = 1;
    public static final int zzf = 2;
    private static final mh3<qw> zzg = new a();
    private final int zzh;

    public class a implements mh3<qw> {
    }

    qw(int i10) {
        this.zzh = i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.lh3
    public final int zza() {
        return this.zzh;
    }
}
