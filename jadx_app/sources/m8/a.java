package m8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f31379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f31380b;

    public a(IBinder iBinder, String str) {
        this.f31379a = iBinder;
        this.f31380b = str;
    }

    public final void Y(int i10, Parcel parcel) throws RemoteException {
        try {
            this.f31379a.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f31379a;
    }

    public final Parcel x() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f31380b);
        return parcelObtain;
    }
}
