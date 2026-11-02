package com.google.android.gms.internal.mlkit_genai_speech;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class zzbih implements Executor {
    private final zzbju zza;
    private Executor zzb;

    public zzbih(zzbju zzbjuVar) {
        this.zza = zzbjuVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        zza().execute(runnable);
    }

    public final synchronized Executor zza() {
        try {
            if (this.zzb == null) {
                Executor executor = (Executor) this.zza.zza();
                zzgo.zzd(executor, "%s.getObject()", this.zzb);
                this.zzb = executor;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zzb;
    }

    public final synchronized void zzb() {
        Executor executor = this.zzb;
        if (executor != null) {
            this.zza.zzb(executor);
            this.zzb = null;
        }
    }
}
