package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class c42 {
    public static final c42 zza;
    public static final c42 zzb;
    public static final c42 zzc;
    private static final /* synthetic */ c42[] zzd;

    static {
        c42 c42Var = new c42("Rewarded", 0);
        zza = c42Var;
        c42 c42Var2 = new c42("Interstitial", 1);
        zzb = c42Var2;
        c42 c42Var3 = new c42("AppOpen", 2);
        zzc = c42Var3;
        zzd = new c42[]{c42Var, c42Var2, c42Var3};
    }

    public static c42[] values() {
        return (c42[]) zzd.clone();
    }
}
