package com.amazon.d.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface e extends IInterface {

    public static abstract class a extends Binder implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String f6044a = "com.amazon.venezia.command.DecisionExpirationContext";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f6045c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final int f6046d = 2;

        /* JADX INFO: renamed from: com.amazon.d.a.e$a$a, reason: collision with other inner class name */
        public static class C0082a implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f6047a;

            public C0082a(IBinder iBinder) {
                this.f6047a = iBinder;
            }

            @Override // com.amazon.d.a.e
            public String a() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f6044a);
                    this.f6047a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f6047a;
            }

            @Override // com.amazon.d.a.e
            public Map b() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f6044a);
                    this.f6047a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String c() {
                return a.f6044a;
            }
        }

        public a() {
            attachInterface(this, f6044a);
        }

        public static e a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f6044a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof e)) ? new C0082a(iBinder) : (e) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1) {
                parcel.enforceInterface(f6044a);
                String strA = a();
                parcel2.writeNoException();
                parcel2.writeString(strA);
                return true;
            }
            if (i10 != 2) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeString(f6044a);
                return true;
            }
            parcel.enforceInterface(f6044a);
            Map mapB = b();
            parcel2.writeNoException();
            parcel2.writeMap(mapB);
            return true;
        }
    }

    String a() throws RemoteException;

    Map b() throws RemoteException;
}
