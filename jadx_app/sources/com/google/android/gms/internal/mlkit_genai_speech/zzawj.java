package com.google.android.gms.internal.mlkit_genai_speech;

/* JADX INFO: loaded from: classes2.dex */
public final class zzawj {
    private final String zza;
    private final Object zzb;

    private zzawj(String str, Object obj) {
        this.zza = str;
        this.zzb = obj;
    }

    public static zzawj zza(String str) {
        return new zzawj("internal:health-check-consumer-listener", null);
    }

    public static zzawj zzb(String str, Object obj) {
        return new zzawj("internal:disable-subchannel-reconnect", obj);
    }

    public final String toString() {
        return this.zza;
    }
}
