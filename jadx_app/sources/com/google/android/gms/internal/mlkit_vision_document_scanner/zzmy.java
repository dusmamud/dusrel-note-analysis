package com.google.android.gms.internal.mlkit_vision_document_scanner;

/* JADX INFO: loaded from: classes2.dex */
public enum zzmy implements zzan {
    FORMAT_UNKNOWN(0),
    FORMAT_JPEG(1),
    FORMAT_PDF(2);

    private final int zzd;

    zzmy(int i10) {
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzan
    public final int zza() {
        return this.zzd;
    }
}
