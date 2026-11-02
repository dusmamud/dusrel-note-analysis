package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class xp2 implements vp2 {
    public static final xp2 zza;
    public static final xp2 zzb;
    public static final xp2 zzc;
    public static final xp2 zzd;
    private static final /* synthetic */ xp2[] zze;

    static {
        xp2 xp2Var = new xp2("ALWAYS_TRUE", 0);
        zza = xp2Var;
        xp2 xp2Var2 = new xp2("ALWAYS_FALSE", 1);
        zzb = xp2Var2;
        xp2 xp2Var3 = new xp2("IS_NULL", 2);
        zzc = xp2Var3;
        xp2 xp2Var4 = new xp2("NOT_NULL", 3);
        zzd = xp2Var4;
        zze = new xp2[]{xp2Var, xp2Var2, xp2Var3, xp2Var4};
    }

    public static xp2[] values() {
        return (xp2[]) zze.clone();
    }

    @Override // java.lang.Enum
    public final /* synthetic */ String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "Predicates.alwaysTrue()";
        }
        if (iOrdinal == 1) {
            return "Predicates.alwaysFalse()";
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? super.toString() : "Predicates.notNull()";
        }
        return "Predicates.isNull()";
    }

    @Override // com.google.android.gms.internal.ads.vp2
    public final /* synthetic */ boolean zza(Object obj) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return obj != null;
                }
                throw null;
            }
            if (obj == null) {
                return true;
            }
        }
        return false;
    }
}
