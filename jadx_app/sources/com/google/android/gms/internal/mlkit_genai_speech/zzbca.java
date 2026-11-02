package com.google.android.gms.internal.mlkit_genai_speech;

import android.os.Parcel;
import android.os.Parcelable;
import j2.g;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
final class zzbca extends InputStream {
    InputStream zza;
    private final Parcelable zzb;

    public zzbca(Parcelable.Creator creator, Parcelable parcelable, boolean z10) {
        this.zzb = parcelable;
        zzgo.zze(creator != null);
    }

    private final InputStream zzb() {
        if (this.zza == null) {
            Parcelable parcelable = this.zzb;
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeParcelable(parcelable, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            this.zza = new ByteArrayInputStream(bArrMarshall);
        }
        return this.zza;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        return zzb().available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.zza;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i10) {
        InputStream inputStream = this.zza;
        if (inputStream != null) {
            inputStream.mark(i10);
        }
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        return zzb().read();
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        InputStream inputStream = this.zza;
        if (inputStream != null) {
            inputStream.reset();
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j10) throws IOException {
        if (j10 <= 0) {
            return 0L;
        }
        return zzb().skip(j10);
    }

    public final String toString() {
        return g.a("ParcelableInputStream[V: ", String.valueOf(this.zzb), "]");
    }

    public final int zza(Parcel parcel) {
        Parcelable parcelable = this.zzb;
        int iDataPosition = parcel.dataPosition();
        parcel.writeParcelable(parcelable, parcelable.describeContents());
        return parcel.dataPosition() - iDataPosition;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        return zzb().read(bArr, i10, i11);
    }
}
