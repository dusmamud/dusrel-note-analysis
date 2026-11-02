package com.google.android.gms.internal.p000firebaseauthapi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class qr {
    public static final qr zza;
    public static final qr zzb;
    public static final qr zzc;
    private static final /* synthetic */ qr[] zzd;

    static {
        qr qrVar = new qr("UNCOMPRESSED", 0);
        zza = qrVar;
        qr qrVar2 = new qr("COMPRESSED", 1);
        zzb = qrVar2;
        qr qrVar3 = new qr("DO_NOT_USE_CRUNCHY_UNCOMPRESSED", 2);
        zzc = qrVar3;
        zzd = new qr[]{qrVar, qrVar2, qrVar3};
    }

    public qr() {
        throw null;
    }

    public static qr[] values() {
        return (qr[]) zzd.clone();
    }
}
