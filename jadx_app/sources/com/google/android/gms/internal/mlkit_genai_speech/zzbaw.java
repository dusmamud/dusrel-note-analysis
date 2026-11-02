package com.google.android.gms.internal.mlkit_genai_speech;

/* JADX INFO: loaded from: classes2.dex */
final class zzbaw {
    private long zza;
    private long zzb;
    private volatile boolean zzc;

    public zzbaw(int i10) {
    }

    public final synchronized boolean zza(long j10) {
        long j11 = this.zzb;
        if (j11 - j10 >= 0) {
            j10 = j11;
        }
        this.zzb = j10;
        if (this.zza - j10 >= 131072 || !this.zzc) {
            return false;
        }
        this.zzc = false;
        return true;
    }

    public final boolean zzb() {
        return this.zzc;
    }

    public final synchronized boolean zzc(long j10) {
        long j11 = this.zza + j10;
        this.zza = j11;
        if (j11 - this.zzb < 131072 || this.zzc) {
            return false;
        }
        this.zzc = true;
        return true;
    }
}
