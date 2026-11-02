package com.google.android.gms.internal.mlkit_genai_speech;

import android.os.Parcel;
import java.io.Closeable;

/* JADX INFO: loaded from: classes2.dex */
final class zzbbz implements Closeable {
    private Parcel zza;

    public zzbbz(Parcel parcel) {
        this.zza = parcel;
    }

    public static zzbbz zzc() {
        return new zzbbz(Parcel.obtain());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Parcel parcel = this.zza;
        if (parcel != null) {
            parcel.recycle();
            this.zza = null;
        }
    }

    public final Parcel zza() {
        zzgo.zzn(this.zza != null, "get() after close()/release()");
        return this.zza;
    }

    public final Parcel zzb() {
        Parcel parcelZza = zza();
        this.zza = null;
        return parcelZza;
    }
}
