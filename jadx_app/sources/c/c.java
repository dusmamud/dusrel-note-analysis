package c;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public interface c extends IInterface {
    public static final String L = "android$support$customtabs$ICustomTabsCallback".replace('$', com.amazon.a.a.o.c.a.b.f5867a);

    public static class b {
        public static Object a(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static void b(Parcel parcel, Parcelable parcelable, int i10) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i10);
            }
        }
    }

    void G0(Bundle bundle) throws RemoteException;

    void K0(Bundle bundle) throws RemoteException;

    void N(int i10, int i11, int i12, int i13, int i14, Bundle bundle) throws RemoteException;

    void Q0(int i10, int i11, Bundle bundle) throws RemoteException;

    Bundle U1(Bundle bundle, String str) throws RemoteException;

    void Z1(Bundle bundle) throws RemoteException;

    void c2(int i10, Uri uri, boolean z10, Bundle bundle) throws RemoteException;

    void i1(Bundle bundle) throws RemoteException;

    void k2(Bundle bundle, String str) throws RemoteException;

    void p1(int i10, Bundle bundle) throws RemoteException;

    void q(Bundle bundle, String str) throws RemoteException;

    public static abstract class a extends Binder implements c {

        /* JADX INFO: renamed from: c.c$a$a, reason: collision with other inner class name */
        public static class C0068a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f4289a;

            @Override // c.c
            public final void G0(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.L);
                    b.b(parcelObtain, bundle, 0);
                    this.f4289a.transact(11, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // c.c
            public final void K0(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.L);
                    b.b(parcelObtain, bundle, 0);
                    this.f4289a.transact(12, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // c.c
            public final void N(int i10, int i11, int i12, int i13, int i14, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.L);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeInt(i13);
                    parcelObtain.writeInt(i14);
                    b.b(parcelObtain, bundle, 0);
                    this.f4289a.transact(10, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // c.c
            public final void Q0(int i10, int i11, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.L);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    b.b(parcelObtain, bundle, 0);
                    this.f4289a.transact(8, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // c.c
            public final Bundle U1(Bundle bundle, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.L);
                    parcelObtain.writeString(str);
                    b.b(parcelObtain, bundle, 0);
                    this.f4289a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) b.a(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // c.c
            public final void Z1(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.L);
                    b.b(parcelObtain, bundle, 0);
                    this.f4289a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f4289a;
            }

            @Override // c.c
            public final void c2(int i10, Uri uri, boolean z10, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.L);
                    parcelObtain.writeInt(i10);
                    b.b(parcelObtain, uri, 0);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    b.b(parcelObtain, bundle, 0);
                    this.f4289a.transact(6, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // c.c
            public final void i1(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.L);
                    b.b(parcelObtain, bundle, 0);
                    this.f4289a.transact(9, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // c.c
            public final void k2(Bundle bundle, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.L);
                    parcelObtain.writeString(str);
                    b.b(parcelObtain, bundle, 0);
                    this.f4289a.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // c.c
            public final void p1(int i10, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.L);
                    parcelObtain.writeInt(i10);
                    b.b(parcelObtain, bundle, 0);
                    this.f4289a.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // c.c
            public final void q(Bundle bundle, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.L);
                    parcelObtain.writeString(str);
                    b.b(parcelObtain, bundle, 0);
                    this.f4289a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static c x(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(c.L);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof c)) {
                return (c) iInterfaceQueryLocalInterface;
            }
            C0068a c0068a = new C0068a();
            c0068a.f4289a = iBinder;
            return c0068a;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            String str = c.L;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i10) {
                case 2:
                    ((v.c) this).p1(parcel.readInt(), (Bundle) b.a(parcel, Bundle.CREATOR));
                    return true;
                case 3:
                    ((v.c) this).k2((Bundle) b.a(parcel, Bundle.CREATOR), parcel.readString());
                    return true;
                case 4:
                    ((v.c) this).Z1((Bundle) b.a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    ((v.c) this).q((Bundle) b.a(parcel, Bundle.CREATOR), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    ((v.c) this).c2(parcel.readInt(), (Uri) b.a(parcel, Uri.CREATOR), parcel.readInt() != 0, (Bundle) b.a(parcel, Bundle.CREATOR));
                    return true;
                case 7:
                    Bundle bundleU1 = ((v.c) this).U1((Bundle) b.a(parcel, Bundle.CREATOR), parcel.readString());
                    parcel2.writeNoException();
                    b.b(parcel2, bundleU1, 1);
                    return true;
                case 8:
                    ((v.c) this).Q0(parcel.readInt(), parcel.readInt(), (Bundle) b.a(parcel, Bundle.CREATOR));
                    return true;
                case 9:
                    ((v.c) this).i1((Bundle) b.a(parcel, Bundle.CREATOR));
                    return true;
                case 10:
                    ((v.c) this).N(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Bundle) b.a(parcel, Bundle.CREATOR));
                    return true;
                case 11:
                    ((v.c) this).G0((Bundle) b.a(parcel, Bundle.CREATOR));
                    return true;
                case 12:
                    ((v.c) this).K0((Bundle) b.a(parcel, Bundle.CREATOR));
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}
