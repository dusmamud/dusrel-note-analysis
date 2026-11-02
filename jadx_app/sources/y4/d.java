package y4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IBinder f36950a;

    @Override // y4.e
    public final void S(String[] strArr) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(e.f36951e0);
            parcelObtain.writeStringArray(strArr);
            this.f36950a.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f36950a;
    }
}
