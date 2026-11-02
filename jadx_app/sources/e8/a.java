package e8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f25889a;

    public a(IBinder iBinder) {
        this.f25889a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f25889a;
    }

    public final Parcel x(int i10, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f25889a.transact(i10, parcel, parcelObtain, 0);
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
}
