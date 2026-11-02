package com.google.android.gms.internal.mlkit_genai_speech;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzauu {
    private static zzauu zza;
    private final List zzb = Collections.EMPTY_LIST;
    private int zzc = 0;

    public static synchronized zzauu zza() {
        try {
            if (zza == null) {
                zza = new zzauu();
            }
        } catch (Throwable th) {
            throw th;
        }
        return zza;
    }

    public final synchronized List zzb() {
        this.zzc++;
        return this.zzb;
    }

    public final synchronized boolean zzc() {
        return false;
    }
}
