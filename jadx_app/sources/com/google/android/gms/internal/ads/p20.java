package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class p20 extends rq implements r20 {
    @Override // com.google.android.gms.internal.ads.r20
    public final void zze(String str) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeString(str);
        zzdb(1, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.r20
    public final void zzf() throws RemoteException {
        zzdb(2, zzcZ());
    }
}
