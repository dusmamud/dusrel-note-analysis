package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class id0 extends rq implements kd0 {
    @Override // com.google.android.gms.internal.ads.kd0
    public final void L1(List list) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeTypedList(list);
        zzdb(1, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.kd0
    public final void zzf(String str) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeString(str);
        zzdb(2, parcelZzcZ);
    }
}
