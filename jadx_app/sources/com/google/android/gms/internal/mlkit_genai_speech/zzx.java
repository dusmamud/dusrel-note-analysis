package com.google.android.gms.internal.mlkit_genai_speech;

/* JADX INFO: loaded from: classes2.dex */
final class zzx implements zzagk {
    static final zzagk zza = new zzx();

    private zzx() {
    }

    @Override // com.google.android.gms.internal.mlkit_genai_speech.zzagk
    public final boolean zza(int i10) {
        zzy zzyVar;
        if (i10 == 0) {
            zzyVar = zzy.DEFAULT;
        } else if (i10 == 1) {
            zzyVar = zzy.FALLBACK_ON_LOW_CONFIDENCE;
        } else if (i10 != 2) {
            zzyVar = i10 != 99 ? null : zzy.FALLBACK_ALWAYS;
        } else {
            zzyVar = zzy.ALWAYS_ENFORCED;
        }
        return zzyVar != null;
    }
}
