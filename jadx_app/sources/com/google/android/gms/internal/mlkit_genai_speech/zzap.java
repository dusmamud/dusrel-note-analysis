package com.google.android.gms.internal.mlkit_genai_speech;

/* JADX INFO: loaded from: classes2.dex */
public enum zzap implements zzagi {
    UNKNOWN(0),
    DIRECT_API(1),
    MLKIT_SDK(2),
    UNRECOGNIZED(-1);

    private final int zzf;

    zzap(int i10) {
        this.zzf = i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzf);
    }

    @Override // com.google.android.gms.internal.mlkit_genai_speech.zzagi
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzf;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
