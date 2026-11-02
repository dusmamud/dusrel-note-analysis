package com.google.android.gms.internal.mlkit_genai_speech;

/* JADX INFO: loaded from: classes2.dex */
public final class zzazt {
    private int zza;

    public /* synthetic */ zzazt(int i10, zzazu zzazuVar) {
        this.zza = i10;
    }

    public final zzazt zza(boolean z10) {
        this.zza |= 512;
        return this;
    }

    public final zzazt zzb(boolean z10) {
        this.zza |= 1;
        return this;
    }

    public final zzazt zzc(boolean z10) {
        this.zza |= 4096;
        return this;
    }

    public final zzazv zzd() {
        return new zzazv(this.zza, null);
    }
}
