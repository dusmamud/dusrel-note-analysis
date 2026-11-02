package com.google.android.gms.internal.mlkit_genai_speech;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaxr {
    private zzaxs zza;
    private zzaxs zzb;
    private zzaxt zzc;
    private String zzd;
    private boolean zze;

    private zzaxr() {
        throw null;
    }

    public final zzaxr zza(String str) {
        this.zzd = str;
        return this;
    }

    public final zzaxr zzb(zzaxs zzaxsVar) {
        this.zza = zzaxsVar;
        return this;
    }

    public final zzaxr zzc(zzaxs zzaxsVar) {
        this.zzb = zzaxsVar;
        return this;
    }

    public final zzaxr zzd(boolean z10) {
        this.zze = true;
        return this;
    }

    public final zzaxr zze(zzaxt zzaxtVar) {
        this.zzc = zzaxtVar;
        return this;
    }

    public final zzaxv zzf() {
        return new zzaxv(this.zzc, this.zzd, this.zza, this.zzb, null, false, false, this.zze, null);
    }

    public /* synthetic */ zzaxr(zzaxu zzaxuVar) {
    }
}
