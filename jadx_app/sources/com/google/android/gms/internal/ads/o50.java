package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class o50 extends rq implements p50 {
    @Override // com.google.android.gms.internal.ads.p50
    public final void zza(String str) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeString(str);
        zzdb(1, parcelZzcZ);
    }
}
