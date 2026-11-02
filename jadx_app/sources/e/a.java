package e;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public interface a extends IInterface {
    public static final String U = "android$support$v4$os$IResultReceiver".replace('$', com.amazon.a.a.o.c.a.b.f5867a);

    void n2(int i10, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: e.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0134a extends Binder implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f25423a = 0;

        /* JADX INFO: renamed from: e.a$a$a, reason: collision with other inner class name */
        public static class C0135a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f25424a;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f25424a;
            }

            @Override // e.a
            public final void n2(int i10, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.U);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeTypedObject(bundle, 0);
                    this.f25424a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            String str = a.U;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            ((b.BinderC0136b) this).n2(parcel.readInt(), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}
