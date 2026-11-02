package com.google.android.gms.internal.mlkit_genai_speech;

import j2.g;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbhs implements Runnable {
    private static final Logger zza = Logger.getLogger(zzbhs.class.getName());
    private final Runnable zzb;

    public zzbhs(Runnable runnable) {
        this.zzb = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.run();
        } catch (Throwable th) {
            zza.logp(Level.SEVERE, "io.grpc.internal.LogExceptionRunnable", "run", "Exception while executing runnable ".concat(this.zzb.toString()), th);
            int i10 = zzgv.zza;
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new AssertionError(th);
            }
            throw ((Error) th);
        }
    }

    public final String toString() {
        return g.a("LogExceptionRunnable(", this.zzb.toString(), ")");
    }
}
