package com.google.android.gms.internal.p000firebaseauthapi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class rr {
    public static final rr zza;
    public static final rr zzb;
    public static final rr zzc;
    private static final /* synthetic */ rr[] zzd;

    static {
        rr rrVar = new rr("NIST_P256", 0);
        zza = rrVar;
        rr rrVar2 = new rr("NIST_P384", 1);
        zzb = rrVar2;
        rr rrVar3 = new rr("NIST_P521", 2);
        zzc = rrVar3;
        zzd = new rr[]{rrVar, rrVar2, rrVar3};
    }

    public rr() {
        throw null;
    }

    public static rr[] values() {
        return (rr[]) zzd.clone();
    }
}
