package com.google.android.gms.internal.mlkit_genai_speech;

/* JADX INFO: loaded from: classes2.dex */
public enum zzco implements zzagi {
    END_REASON_UNKNOWN(0),
    END_REASON_COMPLETE(1),
    END_REASON_SCHEDULED(2),
    END_REASON_MODEL_UNAVAILABLE(3),
    END_REASON_DOWNLOAD_ERROR(4),
    END_REASON_NO_INTERNET_CONNECTION(5);

    private final int zzh;

    zzco(int i10) {
        this.zzh = i10;
    }

    public static zzco zzb(int i10) {
        if (i10 == 0) {
            return END_REASON_UNKNOWN;
        }
        if (i10 == 1) {
            return END_REASON_COMPLETE;
        }
        if (i10 == 2) {
            return END_REASON_SCHEDULED;
        }
        if (i10 == 3) {
            return END_REASON_MODEL_UNAVAILABLE;
        }
        if (i10 == 4) {
            return END_REASON_DOWNLOAD_ERROR;
        }
        if (i10 != 5) {
            return null;
        }
        return END_REASON_NO_INTERNET_CONNECTION;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzh);
    }

    @Override // com.google.android.gms.internal.mlkit_genai_speech.zzagi
    public final int zza() {
        return this.zzh;
    }
}
