package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public enum cu implements lh3 {
    NETWORKTYPE_UNSPECIFIED(0),
    CELL(1),
    WIFI(2);

    public static final int zzd = 0;
    public static final int zze = 1;
    public static final int zzf = 2;
    private static final mh3<cu> zzg = new a();
    private final int zzh;

    public class a implements mh3<cu> {
    }

    cu(int i10) {
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
