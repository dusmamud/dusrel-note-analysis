package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public enum kv implements lh3 {
    UNSPECIFIED(0),
    IN_MEMORY(1);

    public static final int zzc = 0;
    public static final int zzd = 1;
    private static final mh3<kv> zze = new a();
    private final int zzf;

    public class a implements mh3<kv> {
    }

    kv(int i10) {
        this.zzf = i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.lh3
    public final int zza() {
        return this.zzf;
    }
}
