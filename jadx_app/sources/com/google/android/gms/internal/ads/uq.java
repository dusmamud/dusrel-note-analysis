package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class uq extends rq implements wq {
    @Override // com.google.android.gms.internal.ads.wq
    public final Bundle f(Bundle bundle) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        tq.c(parcelZzcZ, bundle);
        Parcel parcelZzda = zzda(1, parcelZzcZ);
        Bundle bundle2 = (Bundle) tq.b(parcelZzda, Bundle.CREATOR);
        parcelZzda.recycle();
        return bundle2;
    }
}
