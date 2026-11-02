package com.google.android.gms.internal.mlkit_genai_speech;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzbii extends zzbgt {
    final /* synthetic */ zzbjd zza;

    public /* synthetic */ zzbii(zzbjd zzbjdVar, zzbjc zzbjcVar) {
        Objects.requireNonNull(zzbjdVar);
        this.zza = zzbjdVar;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_speech.zzbgt
    public final void zza() {
        this.zza.zzZ();
    }

    @Override // com.google.android.gms.internal.mlkit_genai_speech.zzbgt
    public final void zzb() {
        zzbjd zzbjdVar = this.zza;
        if (zzbjdVar.zzM.get()) {
            return;
        }
        zzbjdVar.zzak();
    }
}
