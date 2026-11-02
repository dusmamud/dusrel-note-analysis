package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public class t implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f22796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22797b;

    public t(IBinder iBinder, String str) {
        this.f22796a = iBinder;
        this.f22797b = str;
    }

    public final Parcel Y(int i10, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f22796a.transact(i10, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e10) {
                parcelObtain.recycle();
                throw e10;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    public final void Y1(int i10, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f22796a.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f22796a;
    }

    public final void d2(int i10, Parcel parcel) throws RemoteException {
        try {
            this.f22796a.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final Parcel x() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f22797b);
        return parcelObtain;
    }
}
