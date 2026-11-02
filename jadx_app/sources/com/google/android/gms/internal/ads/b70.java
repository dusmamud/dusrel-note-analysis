package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class b70 extends rq implements c70 {
    @Override // com.google.android.gms.internal.ads.c70
    public final void zze() throws RemoteException {
        zzdb(1, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.c70
    public final void zzf(int i10) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeInt(i10);
        zzdb(2, parcelZzcZ);
    }
}
