package c;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public interface f extends IInterface {
    public static final String O = "android$support$customtabs$IPostMessageService".replace('$', com.amazon.a.a.o.c.a.b.f5867a);

    public static abstract class a extends Binder implements f {
        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            String str = f.O;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 == 2) {
                c.a.x(parcel.readStrongBinder()).Z1((Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
                parcel2.writeNoException();
                return true;
            }
            if (i10 != 3) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            c.a.x(parcel.readStrongBinder()).q((Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null), parcel.readString());
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}
