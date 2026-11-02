package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class wx3 {
    public static final wx3 zza;
    public static final wx3 zzb;
    public static final wx3 zzc;
    private static final /* synthetic */ wx3[] zzd;

    static {
        wx3 wx3Var = new wx3("PASS_THROUGH", 0);
        zza = wx3Var;
        wx3 wx3Var2 = new wx3("DISCARD_AFTER_NEXT_SAMPLE_METADATA", 1);
        zzb = wx3Var2;
        wx3 wx3Var3 = new wx3("DISCARDING", 2);
        zzc = wx3Var3;
        zzd = new wx3[]{wx3Var, wx3Var2, wx3Var3};
    }

    public static wx3[] values() {
        return (wx3[]) zzd.clone();
    }
}
