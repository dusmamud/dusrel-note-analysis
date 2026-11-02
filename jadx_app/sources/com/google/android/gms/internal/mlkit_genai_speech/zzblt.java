package com.google.android.gms.internal.mlkit_genai_speech;

import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
final class zzblt {
    final Object zza;
    Future zzb;
    boolean zzc;

    public zzblt(Object obj) {
        this.zza = obj;
    }

    public final Future zza() {
        this.zzc = true;
        return this.zzb;
    }

    public final void zzb(Future future) {
        boolean z10;
        synchronized (this.zza) {
            try {
                z10 = this.zzc;
                if (!z10) {
                    this.zzb = future;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            future.cancel(false);
        }
    }
}
