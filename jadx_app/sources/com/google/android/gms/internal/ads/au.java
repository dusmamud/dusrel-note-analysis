package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public enum au implements lh3 {
    CELLULAR_NETWORK_TYPE_UNSPECIFIED(0),
    TWO_G(1),
    THREE_G(2),
    LTE(4);

    public static final int zze = 0;
    public static final int zzf = 1;
    public static final int zzg = 2;
    public static final int zzh = 4;
    private static final mh3<au> zzi = new a();
    private final int zzj;

    public class a implements mh3<au> {
    }

    au(int i10) {
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
