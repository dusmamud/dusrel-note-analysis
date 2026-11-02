package com.google.android.gms.internal.play_billing;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public class u extends Binder implements IInterface {
    private static w globalInterceptor;

    public u(String str) {
        attachInterface(this, str);
    }

    public static synchronized void installTransactionInterceptorPackagePrivate(w wVar) {
        if (wVar == null) {
            throw new IllegalArgumentException("null interceptor");
        }
    }

    private boolean routeToSuperOrEnforceInterface(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 > 16777215) {
            return super.onTransact(i10, parcel, parcel2, i11);
        }
        parcel.enforceInterface(getInterfaceDescriptor());
        return false;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    public boolean dispatchTransaction(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        return false;
    }

    public void enforceNoDataAvail(Parcel parcel) {
        int i10 = v.f22817a;
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(j2.j.a(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }

    @Override // android.os.Binder
    public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (routeToSuperOrEnforceInterface(i10, parcel, parcel2, i11)) {
            return true;
        }
        return dispatchTransaction(i10, parcel, parcel2, i11);
    }
}
