package com.google.android.gms.internal.mlkit_genai_speech;

/* JADX INFO: loaded from: classes2.dex */
final class zzafq {
    private final Object zza;
    private final int zzb;

    public zzafq(Object obj, int i10) {
        this.zza = obj;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzafq)) {
            return false;
        }
        zzafq zzafqVar = (zzafq) obj;
        return this.zza == zzafqVar.zza && this.zzb == zzafqVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
