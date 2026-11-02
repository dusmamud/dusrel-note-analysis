package com.amazon.d.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface h extends IInterface {

    public static abstract class a extends Binder implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final int f6063a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f6064b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f6065c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final int f6066d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final int f6067e = 5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final int f6068f = 6;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final int f6069g = 7;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f6070h = "com.amazon.venezia.command.FailureResult";

        /* JADX INFO: renamed from: com.amazon.d.a.h$a$a, reason: collision with other inner class name */
        public static class C0085a implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f6071a;

            public C0085a(IBinder iBinder) {
                this.f6071a = iBinder;
            }

            @Override // com.amazon.d.a.h
            public String a() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f6070h);
                    this.f6071a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f6071a;
            }

            @Override // com.amazon.d.a.h
            public String b() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f6070h);
                    this.f6071a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.amazon.d.a.h
            public String c() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f6070h);
                    this.f6071a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.amazon.d.a.h
            public String d() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f6070h);
                    this.f6071a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.amazon.d.a.h
            public boolean e() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f6070h);
                    this.f6071a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.amazon.d.a.h
            public Map f() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f6070h);
                    this.f6071a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.amazon.d.a.h
            public String g() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f6070h);
                    this.f6071a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String h() {
                return a.f6070h;
            }
        }

        public a() {
            attachInterface(this, f6070h);
        }

        public static h a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f6070h);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof h)) ? new C0085a(iBinder) : (h) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1598968902) {
                parcel2.writeString(f6070h);
                return true;
            }
            switch (i10) {
                case 1:
                    parcel.enforceInterface(f6070h);
                    String strA = a();
                    parcel2.writeNoException();
                    parcel2.writeString(strA);
                    return true;
                case 2:
                    parcel.enforceInterface(f6070h);
                    String strB = b();
                    parcel2.writeNoException();
                    parcel2.writeString(strB);
                    return true;
                case 3:
                    parcel.enforceInterface(f6070h);
                    String strC = c();
                    parcel2.writeNoException();
                    parcel2.writeString(strC);
                    return true;
                case 4:
                    parcel.enforceInterface(f6070h);
                    String strD = d();
                    parcel2.writeNoException();
                    parcel2.writeString(strD);
                    return true;
                case 5:
                    parcel.enforceInterface(f6070h);
                    boolean zE = e();
                    parcel2.writeNoException();
                    parcel2.writeInt(zE ? 1 : 0);
                    return true;
                case 6:
                    parcel.enforceInterface(f6070h);
                    Map mapF = f();
                    parcel2.writeNoException();
                    parcel2.writeMap(mapF);
                    return true;
                case 7:
                    parcel.enforceInterface(f6070h);
                    String strG = g();
                    parcel2.writeNoException();
                    parcel2.writeString(strG);
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }
    }

    String a() throws RemoteException;

    String b() throws RemoteException;

    String c() throws RemoteException;

    String d() throws RemoteException;

    boolean e() throws RemoteException;

    Map f() throws RemoteException;

    String g() throws RemoteException;
}
