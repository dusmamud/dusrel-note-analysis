package h8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class h implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f27650a;

    public h(IBinder iBinder) {
        this.f27650a = iBinder;
    }

    public final void Y(int i10, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f27650a.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f27650a;
    }

    public final Parcel x() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        return parcelObtain;
    }
}
