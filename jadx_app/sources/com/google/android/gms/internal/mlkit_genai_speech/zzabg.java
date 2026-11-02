package com.google.android.gms.internal.mlkit_genai_speech;

/* JADX INFO: loaded from: classes2.dex */
public final class zzabg {
    private zzxp zza;
    private Integer zzb;
    private Long zzc;
    private Long zzd;

    public final zzabg zzb(zzxp zzxpVar) {
        this.zza = zzxpVar;
        return this;
    }

    public final zzabg zzc(Long l10) {
        this.zzd = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzabg zzd(Long l10) {
        this.zzc = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzabg zze(Integer num) {
        this.zzb = num;
        return this;
    }

    public final zzabi zzf() {
        return new zzabi(this, null);
    }
}
