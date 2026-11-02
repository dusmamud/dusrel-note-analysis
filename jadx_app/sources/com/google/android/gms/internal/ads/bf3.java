package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class bf3 {
    public static final bf3 zza;
    public static final bf3 zzb;
    public static final bf3 zzc;
    private static final /* synthetic */ bf3[] zzd;

    static {
        bf3 bf3Var = new bf3("LENIENT", 0);
        zza = bf3Var;
        bf3 bf3Var2 = new bf3("LEGACY_STRICT", 1);
        zzb = bf3Var2;
        bf3 bf3Var3 = new bf3("STRICT", 2);
        zzc = bf3Var3;
        zzd = new bf3[]{bf3Var, bf3Var2, bf3Var3};
    }

    public static bf3[] values() {
        return (bf3[]) zzd.clone();
    }
}
