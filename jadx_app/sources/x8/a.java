package x8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f36580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36581b;

    public a(IBinder iBinder, String str) {
        this.f36580a = iBinder;
        this.f36581b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f36580a;
    }

    public final void x(int i10, Parcel parcel) throws RemoteException {
        try {
            this.f36580a.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
