package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class nf0 extends rq implements of0 {
    public nf0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.of0
    public final String zze() throws RemoteException {
        Parcel parcelZzda = zzda(1, zzcZ());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.of0
    public final int zzf() throws RemoteException {
        Parcel parcelZzda = zzda(2, zzcZ());
        int i10 = parcelZzda.readInt();
        parcelZzda.recycle();
        return i10;
    }
}
