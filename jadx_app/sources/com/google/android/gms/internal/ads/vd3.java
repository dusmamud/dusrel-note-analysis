package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class vd3 {
    public static final vd3 zza;
    public static final vd3 zzb;
    public static final vd3 zzc;
    private static final /* synthetic */ vd3[] zzd;

    static {
        vd3 vd3Var = new vd3("NIST_P256", 0);
        zza = vd3Var;
        vd3 vd3Var2 = new vd3("NIST_P384", 1);
        zzb = vd3Var2;
        vd3 vd3Var3 = new vd3("NIST_P521", 2);
        zzc = vd3Var3;
        zzd = new vd3[]{vd3Var, vd3Var2, vd3Var3};
    }

    public static vd3[] values() {
        return (vd3[]) zzd.clone();
    }
}
