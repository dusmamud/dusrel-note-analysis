package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import k8.j;
import k8.k;

/* JADX INFO: loaded from: classes.dex */
public interface IAccountAccessor extends IInterface {

    public static abstract class Stub extends j implements IAccountAccessor {
        public Stub() {
            super("com.google.android.gms.common.internal.IAccountAccessor");
        }

        public static IAccountAccessor asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return iInterfaceQueryLocalInterface instanceof IAccountAccessor ? (IAccountAccessor) iInterfaceQueryLocalInterface : new zzt(iBinder);
        }

        @Override // k8.j
        public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 != 2) {
                return false;
            }
            Account accountZzb = zzb();
            parcel2.writeNoException();
            int i12 = k.f29979a;
            if (accountZzb == null) {
                parcel2.writeInt(0);
            } else {
                parcel2.writeInt(1);
                accountZzb.writeToParcel(parcel2, 1);
            }
            return true;
        }
    }

    Account zzb() throws RemoteException;
}
