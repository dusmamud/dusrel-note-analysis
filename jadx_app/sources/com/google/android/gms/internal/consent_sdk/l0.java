package com.google.android.gms.internal.consent_sdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class l0 {
    public static final l0 zza;
    public static final l0 zzb;
    public static final l0 zzc;
    public static final l0 zzd;
    public static final l0 zze;
    public static final l0 zzf;
    public static final l0 zzg;
    public static final l0 zzh;
    private static final /* synthetic */ l0[] zzi;

    static {
        l0 l0Var = new l0("DEBUG_PARAM_UNKNOWN", 0);
        zza = l0Var;
        l0 l0Var2 = new l0("ALWAYS_SHOW", 1);
        zzb = l0Var2;
        l0 l0Var3 = new l0("GEO_OVERRIDE_EEA", 2);
        zzc = l0Var3;
        l0 l0Var4 = new l0("GEO_OVERRIDE_REGULATED_US_STATE", 3);
        zzd = l0Var4;
        l0 l0Var5 = new l0("GEO_OVERRIDE_OTHER", 4);
        zze = l0Var5;
        l0 l0Var6 = new l0("GEO_OVERRIDE_NON_EEA", 5);
        zzf = l0Var6;
        l0 l0Var7 = new l0("PREVIEWING_DEBUG_MESSAGES", 6);
        zzg = l0Var7;
        l0 l0Var8 = new l0("GEO_OVERRIDE_USFL", 7);
        zzh = l0Var8;
        zzi = new l0[]{l0Var, l0Var2, l0Var3, l0Var4, l0Var5, l0Var6, l0Var7, l0Var8};
    }

    public static l0[] values() {
        return (l0[]) zzi.clone();
    }
}
