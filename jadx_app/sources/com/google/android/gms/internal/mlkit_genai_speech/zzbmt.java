package com.google.android.gms.internal.mlkit_genai_speech;

/* JADX INFO: loaded from: classes2.dex */
final class zzbmt extends zzbmr {
    private zzbmt() {
        throw null;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_speech.zzbmr
    public final void zza(zzbmv zzbmvVar, int i10) {
        synchronized (zzbmvVar) {
            zzbmvVar.zze = 0;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_genai_speech.zzbmr
    public final boolean zzb(zzbmv zzbmvVar, int i10, int i11) {
        synchronized (zzbmvVar) {
            try {
                if (zzbmvVar.zze != 0) {
                    return false;
                }
                zzbmvVar.zze = -1;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ zzbmt(zzbmu zzbmuVar) {
        super(null);
    }
}
