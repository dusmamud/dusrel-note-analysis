package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class kg1 {
    public static final kg1 zza;
    public static final kg1 zzb;
    public static final kg1 zzc;
    private static final /* synthetic */ kg1[] zzd;

    static {
        kg1 kg1Var = new kg1("AD_REQUESTED", 0);
        zza = kg1Var;
        kg1 kg1Var2 = new kg1("AD_LOADED", 1);
        zzb = kg1Var2;
        kg1 kg1Var3 = new kg1("AD_LOAD_FAILED", 2);
        zzc = kg1Var3;
        zzd = new kg1[]{kg1Var, kg1Var2, kg1Var3};
    }

    public static kg1[] values() {
        return (kg1[]) zzd.clone();
    }
}
