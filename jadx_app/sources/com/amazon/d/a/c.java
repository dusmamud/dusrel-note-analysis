package com.amazon.d.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface c extends IInterface {

    public static abstract class a extends Binder implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String f6035a = "com.amazon.venezia.command.Command";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f6036b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f6037c = 2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final int f6038d = 3;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final int f6039e = 4;

        /* JADX INFO: renamed from: com.amazon.d.a.c$a$a, reason: collision with other inner class name */
        public static class C0080a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f6040a;

            public C0080a(IBinder iBinder) {
                this.f6040a = iBinder;
            }

            @Override // com.amazon.d.a.c
            public String a() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f6035a);
                    this.f6040a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f6040a;
            }

            @Override // com.amazon.d.a.c
            public String b() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f6035a);
                    this.f6040a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.amazon.d.a.c
            public Map c() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f6035a);
                    this.f6040a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.amazon.d.a.c
            public String d() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f6035a);
                    this.f6040a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String e() {
                return a.f6035a;
            }
        }

        public a() {
            attachInterface(this, f6035a);
        }

        public static c a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f6035a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c)) ? new C0080a(iBinder) : (c) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1) {
                parcel.enforceInterface(f6035a);
                String strB = b();
                parcel2.writeNoException();
                parcel2.writeString(strB);
                return true;
            }
            if (i10 == 2) {
                parcel.enforceInterface(f6035a);
                String strA = a();
                parcel2.writeNoException();
                parcel2.writeString(strA);
                return true;
            }
            if (i10 == 3) {
                parcel.enforceInterface(f6035a);
                String strD = d();
                parcel2.writeNoException();
                parcel2.writeString(strD);
                return true;
            }
            if (i10 != 4) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeString(f6035a);
                return true;
            }
            parcel.enforceInterface(f6035a);
            Map mapC = c();
            parcel2.writeNoException();
            parcel2.writeMap(mapC);
            return true;
        }
    }

    String a() throws RemoteException;

    String b() throws RemoteException;

    Map c() throws RemoteException;

    String d() throws RemoteException;
}
