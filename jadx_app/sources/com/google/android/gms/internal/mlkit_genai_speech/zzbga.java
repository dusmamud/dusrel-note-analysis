package com.google.android.gms.internal.mlkit_genai_speech;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbga {
    private final Random zza = new Random();
    private final long zzb;
    private final long zzc;
    private long zzd;

    public zzbga() {
        long nanos = TimeUnit.SECONDS.toNanos(1L);
        this.zzb = nanos;
        this.zzc = TimeUnit.MINUTES.toNanos(2L);
        this.zzd = nanos;
    }

    public final long zza() {
        long j10 = this.zzd;
        double d10 = j10;
        this.zzd = Math.min((long) (1.6d * d10), this.zzc);
        double d11 = 0.2d * d10;
        double d12 = d10 * (-0.2d);
        zzgo.zze(d11 >= d12);
        return j10 + ((long) ((this.zza.nextDouble() * (d11 - d12)) + d12));
    }
}
