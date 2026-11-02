package com.google.android.gms.internal.mlkit_genai_speech;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
final class zzbms extends zzbmr {
    private final AtomicIntegerFieldUpdater zza;

    public /* synthetic */ zzbms(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, zzbmu zzbmuVar) {
        super(null);
        this.zza = atomicIntegerFieldUpdater;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_speech.zzbmr
    public final void zza(zzbmv zzbmvVar, int i10) {
        this.zza.set(zzbmvVar, 0);
    }

    @Override // com.google.android.gms.internal.mlkit_genai_speech.zzbmr
    public final boolean zzb(zzbmv zzbmvVar, int i10, int i11) {
        return this.zza.compareAndSet(zzbmvVar, 0, -1);
    }
}
