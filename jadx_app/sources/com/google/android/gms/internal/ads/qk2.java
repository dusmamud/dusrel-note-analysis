package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class qk2 {
    public static final qk2 zza;
    public static final qk2 zzb;
    public static final qk2 zzc;
    public static final qk2 zzd;
    public static final qk2 zze;
    public static final qk2 zzf;
    private static final /* synthetic */ qk2[] zzg;

    static {
        qk2 qk2Var = new qk2("RESULT_UNKNOWN", 0);
        zza = qk2Var;
        qk2 qk2Var2 = new qk2("RESULT_NOOP_LOCAL_PROGRAM_STILL_VALID", 1);
        zzb = qk2Var2;
        qk2 qk2Var3 = new qk2("RESULT_UPDATED", 2);
        zzc = qk2Var3;
        qk2 qk2Var4 = new qk2("RESULT_NOOP_NO_NEW_PROGRAM", 3);
        zzd = qk2Var4;
        qk2 qk2Var5 = new qk2("RESULT_FAILURE_INVALID_RESPONSE", 4);
        zze = qk2Var5;
        qk2 qk2Var6 = new qk2("RESULT_FAILURE_FETCHER_HTTP_RUNTIME_EXCEPTION", 5);
        zzf = qk2Var6;
        zzg = new qk2[]{qk2Var, qk2Var2, qk2Var3, qk2Var4, qk2Var5, qk2Var6};
    }

    public static qk2[] values() {
        return (qk2[]) zzg.clone();
    }
}
