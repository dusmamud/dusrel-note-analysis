package com.google.android.gms.internal.mlkit_genai_speech;

/* JADX INFO: loaded from: classes2.dex */
public final class zzatx {
    private final String zza;
    private final Object zzb;

    private zzatx(String str, Object obj) {
        this.zza = str;
        this.zzb = obj;
    }

    public static zzatx zza(String str) {
        return new zzatx(str, null);
    }

    public static zzatx zzb(String str, Object obj) {
        return new zzatx("KotlinResponseBufferSize", obj);
    }

    public final String toString() {
        return this.zza;
    }
}
