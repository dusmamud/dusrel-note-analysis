package com.google.android.gms.internal.mlkit_genai_speech;

/* JADX INFO: loaded from: classes2.dex */
final class zzbf implements zzagk {
    static final zzagk zza = new zzbf();

    private zzbf() {
    }

    @Override // com.google.android.gms.internal.mlkit_genai_speech.zzagk
    public final boolean zza(int i10) {
        zzbg zzbgVar;
        if (i10 != 0) {
            zzbgVar = i10 != 1 ? null : zzbg.OPTIMIZE_LATENCY;
        } else {
            zzbgVar = zzbg.DEFAULT_OPTIMIZE_QUALITY;
        }
        return zzbgVar != null;
    }
}
