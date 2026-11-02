package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public enum tw implements lh3 {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_UNKNOWN(zzf);

    public static final int zzd = 0;
    public static final int zze = 1;
    public static final int zzf = 1000;
    private static final mh3<tw> zzg = new a();
    private final int zzh;

    public class a implements mh3<tw> {
    }

    tw(int i10) {
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
