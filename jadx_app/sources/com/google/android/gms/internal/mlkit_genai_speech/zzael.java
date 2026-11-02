package com.google.android.gms.internal.mlkit_genai_speech;

/* JADX INFO: loaded from: classes2.dex */
public final class zzael {
    private static zzael zza;

    private zzael() {
    }

    public static synchronized zzael zza() {
        try {
            if (zza == null) {
                zza = new zzael();
            }
        } catch (Throwable th) {
            throw th;
        }
        return zza;
    }
}
