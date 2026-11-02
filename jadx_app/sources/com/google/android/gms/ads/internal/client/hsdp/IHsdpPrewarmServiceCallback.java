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
public interface IHsdpPrewarmServiceCallback extends IInterface {

    public static abstract class Stub extends sq implements IHsdpPrewarmServiceCallback {

        public static class Proxy extends rq implements IHsdpPrewarmServiceCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.ads.internal.client.hsdp.IHsdpPrewarmServiceCallback");
            }

            @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpPrewarmServiceCallback
            public void onError(Bundle bundle) throws RemoteException {
                Parcel parcelZzcZ = zzcZ();
                tq.c(parcelZzcZ, bundle);
                zzdc(2, parcelZzcZ);
            }

            @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpPrewarmServiceCallback
            public void onPrewarmCompleted(Bundle bundle) throws RemoteException {
                Parcel parcelZzcZ = zzcZ();
                tq.c(parcelZzcZ, bundle);
                zzdc(1, parcelZzcZ);
            }
        }

        public Stub() {
            super("com.google.android.gms.ads.internal.client.hsdp.IHsdpPrewarmServiceCallback");
        }

        public static IHsdpPrewarmServiceCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.hsdp.IHsdpPrewarmServiceCallback");
            return iInterfaceQueryLocalInterface instanceof IHsdpPrewarmServiceCallback ? (IHsdpPrewarmServiceCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.gms.internal.ads.sq
        public boolean dispatchTransaction(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1) {
                Bundle bundle = (Bundle) tq.b(parcel, Bundle.CREATOR);
                tq.f(parcel);
                onPrewarmCompleted(bundle);
            } else {
                if (i10 != 2) {
                    return false;
                }
                Bundle bundle2 = (Bundle) tq.b(parcel, Bundle.CREATOR);
                tq.f(parcel);
                onError(bundle2);
            }
            return true;
        }
    }

    void onError(Bundle bundle) throws RemoteException;

    void onPrewarmCompleted(Bundle bundle) throws RemoteException;
}
