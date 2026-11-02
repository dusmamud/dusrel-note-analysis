package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class lh0 extends rq implements oh0 {
    @Override // com.google.android.gms.internal.ads.oh0
    public final void m2(Bundle bundle, String str, String str2) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeString(str);
        parcelZzcZ.writeString(str2);
        tq.c(parcelZzcZ, bundle);
        zzdb(3, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.oh0
    public final void zza(String str) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeString(str);
        zzdb(2, parcelZzcZ);
    }
}
