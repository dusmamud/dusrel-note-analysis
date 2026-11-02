package com.google.android.gms.internal.mlkit_genai_speech;

/* JADX INFO: loaded from: classes2.dex */
final class zzazj implements Runnable {
    final Runnable zza;
    boolean zzb;
    boolean zzc;

    public zzazj(Runnable runnable) {
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzb) {
            return;
        }
        this.zzc = true;
        this.zza.run();
    }
}
