package com.google.android.gms.internal.mlkit_vision_document_scanner;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzui extends zza implements zzuk {
    public zzui(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.docscan.ui.aidls.IDocumentScannerService");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzuk
    public final void zzc(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzb(1, parcelZza);
    }
}
