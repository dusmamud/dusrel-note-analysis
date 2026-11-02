package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ee3 {
    public static final ee3 zza;
    public static final ee3 zzb;
    public static final ee3 zzc;
    public static final ee3 zzd;
    public static final ee3 zze;
    private static final /* synthetic */ ee3[] zzf;

    static {
        ee3 ee3Var = new ee3("SHA1", 0);
        zza = ee3Var;
        ee3 ee3Var2 = new ee3("SHA224", 1);
        zzb = ee3Var2;
        ee3 ee3Var3 = new ee3("SHA256", 2);
        zzc = ee3Var3;
        ee3 ee3Var4 = new ee3("SHA384", 3);
        zzd = ee3Var4;
        ee3 ee3Var5 = new ee3("SHA512", 4);
        zze = ee3Var5;
        zzf = new ee3[]{ee3Var, ee3Var2, ee3Var3, ee3Var4, ee3Var5};
    }

    public static ee3[] values() {
        return (ee3[]) zzf.clone();
    }
}
