package com.google.android.gms.internal.p000firebaseauthapi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class n8 {
    public static final n8 zza;
    public static final n8 zzb;
    public static final n8 zzc;
    public static final n8 zzd;
    private static final /* synthetic */ n8[] zze;

    static {
        n8 n8Var = new n8("SCALAR", 0);
        zza = n8Var;
        n8 n8Var2 = new n8("VECTOR", 1);
        zzb = n8Var2;
        n8 n8Var3 = new n8("PACKED_VECTOR", 2);
        zzc = n8Var3;
        n8 n8Var4 = new n8("MAP", 3);
        zzd = n8Var4;
        zze = new n8[]{n8Var, n8Var2, n8Var3, n8Var4};
    }

    public static n8[] values() {
        return (n8[]) zze.clone();
    }
}
