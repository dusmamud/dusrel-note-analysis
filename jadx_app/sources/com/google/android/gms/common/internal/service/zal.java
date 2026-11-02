package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import j8.a;
import j8.c;

/* JADX INFO: loaded from: classes.dex */
public final class zal extends a implements IInterface {
    public zal(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    public final void zae(zak zakVar) throws RemoteException {
        Parcel parcelZaa = zaa();
        c.d(parcelZaa, zakVar);
        zad(1, parcelZaa);
    }
}
