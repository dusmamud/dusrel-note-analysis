package com.google.android.gms.internal.mlkit_genai_speech;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
final class zzbmi {
    final int zza;
    final int zzb;
    final int zzc;
    final AtomicInteger zzd;

    public zzbmi(float f10, float f11) {
        AtomicInteger atomicInteger = new AtomicInteger();
        this.zzd = atomicInteger;
        this.zzc = (int) (f11 * 1000.0f);
        int i10 = (int) (f10 * 1000.0f);
        this.zza = i10;
        this.zzb = i10 / 2;
        atomicInteger.set(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbmi)) {
            return false;
        }
        zzbmi zzbmiVar = (zzbmi) obj;
        return this.zza == zzbmiVar.zza && this.zzc == zzbmiVar.zzc;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.zza), Integer.valueOf(this.zzc));
    }

    public final boolean zza() {
        return this.zzd.get() > this.zzb;
    }

    public final boolean zzb() {
        AtomicInteger atomicInteger;
        int i10;
        int i11;
        do {
            atomicInteger = this.zzd;
            i10 = atomicInteger.get();
            if (i10 == 0) {
                return false;
            }
            i11 = i10 - 1000;
        } while (!atomicInteger.compareAndSet(i10, Math.max(i11, 0)));
        return i11 > this.zzb;
    }
}
