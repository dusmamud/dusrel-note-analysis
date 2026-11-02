package com.google.android.gms.internal.mlkit_genai_speech;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class zzbgp implements zzaxi {
    @Override // com.google.android.gms.internal.mlkit_genai_speech.zzaxi
    public final /* bridge */ /* synthetic */ Object zza(String str) {
        zzgo.zzf(str.length() > 0, "empty timeout");
        zzgo.zzf(str.length() <= 9, "bad timeout format");
        long j10 = Long.parseLong(str.substring(0, str.length() - 1));
        char cCharAt = str.charAt(str.length() - 1);
        if (cCharAt == 'H') {
            return Long.valueOf(TimeUnit.HOURS.toNanos(j10));
        }
        if (cCharAt == 'M') {
            return Long.valueOf(TimeUnit.MINUTES.toNanos(j10));
        }
        if (cCharAt == 'S') {
            return Long.valueOf(TimeUnit.SECONDS.toNanos(j10));
        }
        if (cCharAt == 'u') {
            return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(j10));
        }
        if (cCharAt == 'm') {
            return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(j10));
        }
        if (cCharAt == 'n') {
            return Long.valueOf(j10);
        }
        throw new IllegalArgumentException("Invalid timeout unit: " + cCharAt);
    }

    @Override // com.google.android.gms.internal.mlkit_genai_speech.zzaxi
    public final /* bridge */ /* synthetic */ String zzb(Object obj) {
        long jMax = Math.max(1L, ((Long) obj).longValue());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (jMax < 100000000) {
            return jMax + "n";
        }
        if (jMax < 100000000000L) {
            return timeUnit.toMicros(jMax) + "u";
        }
        if (jMax < 100000000000000L) {
            return timeUnit.toMillis(jMax) + "m";
        }
        if (jMax < 100000000000000000L) {
            return timeUnit.toSeconds(jMax) + "S";
        }
        if (jMax < 6000000000000000000L) {
            return timeUnit.toMinutes(jMax) + "M";
        }
        return timeUnit.toHours(jMax) + "H";
    }
}
