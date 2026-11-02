package com.google.android.gms.internal.mlkit_genai_speech;

/* JADX INFO: loaded from: classes2.dex */
final class zzbda {
    private final zzbnl zza;
    private final zzbht zzb = zzbhu.zza();
    private final zzbht zzc = zzbhu.zza();
    private final zzbht zzd = zzbhu.zza();
    private volatile long zze;

    public zzbda(zzbnl zzbnlVar) {
        this.zza = zzbnlVar;
    }

    public final void zza(boolean z10) {
        if (z10) {
            this.zzc.zza(1L);
        } else {
            this.zzd.zza(1L);
        }
    }

    public final void zzb() {
        this.zzb.zza(1L);
        this.zze = this.zza.zza();
    }
}
