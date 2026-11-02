package com.google.android.gms.internal.mlkit_genai_speech;

/* JADX INFO: loaded from: classes2.dex */
public enum zzaci implements zzjy {
    SOURCE_UNSPECIFIED(0),
    SOURCE_MIC(1),
    SOURCE_PFD(2);

    private final int zze;

    zzaci(int i10) {
        this.zze = i10;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_speech.zzjy
    public final int zza() {
        return this.zze;
    }
}
