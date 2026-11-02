package com.amazon.d.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface g extends IInterface {

    public static abstract class a extends Binder implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final int f6059a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f6060b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f6061c = "com.amazon.venezia.command.ExceptionResult";

        /* JADX INFO: renamed from: com.amazon.d.a.g$a$a, reason: collision with other inner class name */
        public static class C0084a implements g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f6062a;

            public C0084a(IBinder iBinder) {
                this.f6062a = iBinder;
            }

            @Override // com.amazon.d.a.g
            public String a() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f6061c);
                    this.f6062a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f6062a;
            }

            @Override // com.amazon.d.a.g
            public Map b() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f6061c);
                    this.f6062a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String c() {
                return a.f6061c;
            }
        }

        public a() {
            attachInterface(this, f6061c);
        }

        public static g a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f6061c);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof g)) ? new C0084a(iBinder) : (g) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1) {
                parcel.enforceInterface(f6061c);
                String strA = a();
                parcel2.writeNoException();
                parcel2.writeString(strA);
                return true;
            }
            if (i10 != 2) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeString(f6061c);
                return true;
            }
            parcel.enforceInterface(f6061c);
            Map mapB = b();
            parcel2.writeNoException();
            parcel2.writeMap(mapB);
            return true;
        }
    }

    String a() throws RemoteException;

    Map b() throws RemoteException;
}
