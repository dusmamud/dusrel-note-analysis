package com.google.android.gms.ads.internal.client.hsdp;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.rq;
import com.google.android.gms.internal.ads.sq;
import com.google.android.gms.internal.ads.tq;

/* JADX INFO: loaded from: classes.dex */
public interface IHsdpServiceCallback extends IInterface {

    public static abstract class Stub extends sq implements IHsdpServiceCallback {

        public static class Proxy extends rq implements IHsdpServiceCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.ads.internal.client.hsdp.IHsdpServiceCallback");
            }

            @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpServiceCallback
            public void onDismissed(Bundle bundle) throws RemoteException {
                Parcel parcelZzcZ = zzcZ();
                tq.c(parcelZzcZ, bundle);
                zzdb(2, parcelZzcZ);
            }

            @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpServiceCallback
            public void onError(Bundle bundle) throws RemoteException {
                Parcel parcelZzcZ = zzcZ();
                tq.c(parcelZzcZ, bundle);
                zzdb(3, parcelZzcZ);
            }

            @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpServiceCallback
            public void onShown(Bundle bundle) throws RemoteException {
                Parcel parcelZzcZ = zzcZ();
                tq.c(parcelZzcZ, bundle);
                zzdb(1, parcelZzcZ);
            }
        }

        public Stub() {
            super("com.google.android.gms.ads.internal.client.hsdp.IHsdpServiceCallback");
        }

        public static IHsdpServiceCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.hsdp.IHsdpServiceCallback");
            return iInterfaceQueryLocalInterface instanceof IHsdpServiceCallback ? (IHsdpServiceCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.gms.internal.ads.sq
        public boolean dispatchTransaction(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1) {
                Bundle bundle = (Bundle) tq.b(parcel, Bundle.CREATOR);
                tq.f(parcel);
                onShown(bundle);
            } else if (i10 == 2) {
                Bundle bundle2 = (Bundle) tq.b(parcel, Bundle.CREATOR);
                tq.f(parcel);
                onDismissed(bundle2);
            } else {
                if (i10 != 3) {
                    return false;
                }
                Bundle bundle3 = (Bundle) tq.b(parcel, Bundle.CREATOR);
                tq.f(parcel);
                onError(bundle3);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void onDismissed(Bundle bundle) throws RemoteException;

    void onError(Bundle bundle) throws RemoteException;

    void onShown(Bundle bundle) throws RemoteException;
}
