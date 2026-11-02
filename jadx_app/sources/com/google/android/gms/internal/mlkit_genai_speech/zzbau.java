package com.google.android.gms.internal.mlkit_genai_speech;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
final class zzbau extends InputStream {
    private byte[][] zza;
    private byte[] zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private boolean zzf;

    public zzbau(byte[] bArr) {
        this.zza = null;
        int length = bArr.length;
        this.zzb = length <= 0 ? null : bArr;
        this.zze = length;
    }

    private final void zza() {
        int i10 = this.zzc + 1;
        this.zzc = i10;
        this.zzd = 0;
        byte[][] bArr = this.zza;
        if (bArr == null || i10 >= bArr.length) {
            this.zzb = null;
        } else {
            this.zzb = bArr[i10];
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.zze;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.zzf) {
            return;
        }
        this.zzf = true;
        byte[][] bArr = this.zza;
        if (bArr != null) {
            for (byte[] bArr2 : bArr) {
                zzbav.zza(bArr2);
            }
        } else {
            byte[] bArr3 = this.zzb;
            if (bArr3 != null) {
                zzbav.zza(bArr3);
            }
        }
        this.zzb = null;
        this.zza = null;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = this.zzb;
        if (bArr == null) {
            return -1;
        }
        int i10 = this.zzd;
        int i11 = i10 + 1;
        this.zzd = i11;
        byte b10 = bArr[i10];
        this.zze--;
        if (i11 == bArr.length) {
            zza();
        }
        return b10;
    }

    public zzbau(byte[][] bArr, int i10) {
        this.zza = bArr;
        this.zze = i10;
        if (bArr.length > 0) {
            this.zzb = bArr[0];
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = i11;
        while (true) {
            byte[] bArr2 = this.zzb;
            if (bArr2 == null) {
                break;
            }
            int[] iArr = {i12, bArr2.length - this.zzd, this.zze};
            int i13 = iArr[0];
            for (int i14 = 1; i14 < 3; i14++) {
                int i15 = iArr[i14];
                if (i15 < i13) {
                    i13 = i15;
                }
            }
            System.arraycopy(this.zzb, this.zzd, bArr, i10, i13);
            i10 += i13;
            i12 -= i13;
            this.zze -= i13;
            if (i12 == 0) {
                int i16 = this.zzd + i13;
                this.zzd = i16;
                if (i16 != this.zzb.length) {
                    break;
                }
                zza();
                break;
            }
            zza();
        }
        int i17 = i11 - i12;
        if (i17 > 0 || this.zze > 0) {
            return i17;
        }
        return -1;
    }
}
