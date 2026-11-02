package com.google.android.gms.internal.mlkit_genai_speech;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
final class zzjh {
    private final zzha zza = new zzha();
    private final String zzb;
    private volatile Logger zzc;

    public zzjh(Class cls) {
        this.zzb = cls.getName();
    }

    public final Logger zza() {
        Logger logger = this.zzc;
        if (logger != null) {
            return logger;
        }
        synchronized (this.zza) {
            try {
                Logger logger2 = this.zzc;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.zzb);
                this.zzc = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
