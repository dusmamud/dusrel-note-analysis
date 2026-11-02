package com.google.android.gms.internal.mlkit_genai_speech;

/* JADX INFO: loaded from: classes2.dex */
public final class zzju implements zzkh {
    private static final Object zza = new Object();
    private volatile Object zzb = zza;
    private volatile zzkh zzc;

    public zzju(zzkh zzkhVar) {
        this.zzc = zzkhVar;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_speech.zzkh
    public final Object zza() {
        Object objZza;
        Object obj = this.zzb;
        Object obj2 = zza;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objZza = this.zzb;
                if (objZza == obj2) {
                    objZza = this.zzc.zza();
                    this.zzb = objZza;
                    this.zzc = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objZza;
    }
}
