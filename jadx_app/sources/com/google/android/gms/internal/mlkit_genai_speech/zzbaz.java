package com.google.android.gms.internal.mlkit_genai_speech;

import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
final class zzbaz {
    final InputStream zza = null;
    final byte[] zzb;
    final int zzc;
    final boolean zzd;

    public zzbaz(InputStream inputStream, byte[] bArr, int i10, boolean z10) {
        this.zzb = bArr;
        this.zzc = i10;
        this.zzd = z10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TransactionData[");
        sb2.append(this.zzc);
        sb2.append("b array");
        sb2.append(true != this.zzd ? "]" : "(last)]");
        return sb2.toString();
    }
}
