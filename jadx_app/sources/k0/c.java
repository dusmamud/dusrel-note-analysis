package k0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.core.content.UnusedAppRestrictionsBackportService;

/* JADX INFO: loaded from: classes.dex */
public interface c extends IInterface {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f29622a0 = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportService".replace('$', com.amazon.a.a.o.c.a.b.f5867a);

    public static abstract class a extends Binder implements c {
        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            b bVar;
            String str = c.f29622a0;
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
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                bVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(b.W);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) {
                    k0.a aVar = new k0.a();
                    aVar.f29621a = strongBinder;
                    bVar = aVar;
                } else {
                    bVar = (b) iInterfaceQueryLocalInterface;
                }
            }
            UnusedAppRestrictionsBackportService.a aVar2 = (UnusedAppRestrictionsBackportService.a) this;
            if (bVar == null) {
                return true;
            }
            UnusedAppRestrictionsBackportService.this.a();
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}
