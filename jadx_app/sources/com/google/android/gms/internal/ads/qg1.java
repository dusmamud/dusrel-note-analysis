package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class qg1 {
    public static final qg1 zza;
    public static final qg1 zzb;
    public static final qg1 zzc;
    private static final /* synthetic */ qg1[] zzd;

    static {
        qg1 qg1Var = new qg1("NONE", 0);
        zza = qg1Var;
        qg1 qg1Var2 = new qg1("SHAKE", 1);
        zzb = qg1Var2;
        qg1 qg1Var3 = new qg1("FLICK", 2);
        zzc = qg1Var3;
        zzd = new qg1[]{qg1Var, qg1Var2, qg1Var3};
    }

    public static qg1[] values() {
        return (qg1[]) zzd.clone();
    }
}
