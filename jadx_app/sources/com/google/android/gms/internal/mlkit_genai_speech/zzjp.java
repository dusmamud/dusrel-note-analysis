package com.google.android.gms.internal.mlkit_genai_speech;

import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjp {
    private String zza = null;
    private Boolean zzb = null;

    public final zzjp zza(boolean z10) {
        this.zzb = Boolean.TRUE;
        return this;
    }

    public final zzjp zzb(String str) {
        String.format(Locale.ROOT, str, 0);
        this.zza = str;
        return this;
    }

    public final ThreadFactory zzc() {
        String str = this.zza;
        return new zzjo(Executors.defaultThreadFactory(), str, str != null ? new AtomicLong(0L) : null, this.zzb, null, null);
    }
}
