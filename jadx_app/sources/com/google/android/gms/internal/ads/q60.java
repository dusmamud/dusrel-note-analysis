package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q60 extends rq implements s60 {
    @Override // com.google.android.gms.internal.ads.s60
    public final void zza(List list) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeTypedList(list);
        zzdb(1, parcelZzcZ);
    }
}
