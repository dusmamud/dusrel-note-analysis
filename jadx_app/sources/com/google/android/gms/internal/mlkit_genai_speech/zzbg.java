package com.google.android.gms.internal.mlkit_genai_speech;

/* JADX INFO: loaded from: classes2.dex */
public enum zzbg implements zzagi {
    DEFAULT_OPTIMIZE_QUALITY(0),
    OPTIMIZE_LATENCY(1);

    private final int zzd;

    zzbg(int i10) {
        this.zzd = i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzd);
    }

    @Override // com.google.android.gms.internal.mlkit_genai_speech.zzagi
    public final int zza() {
        return this.zzd;
    }
}
