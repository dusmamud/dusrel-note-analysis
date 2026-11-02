package com.amazon.d.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface b extends IInterface {

    public static abstract class a extends Binder implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final int f6032a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f6033b = "com.amazon.venezia.command.ChoiceContext";

        /* JADX INFO: renamed from: com.amazon.d.a.b$a$a, reason: collision with other inner class name */
        public static class C0079a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f6034a;

            public C0079a(IBinder iBinder) {
                this.f6034a = iBinder;
            }

            @Override // com.amazon.d.a.b
            public Map a() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f6033b);
                    this.f6034a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f6034a;
            }

            public String b() {
                return a.f6033b;
            }
        }

        public a() {
            attachInterface(this, f6033b);
        }

        public static b a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f6033b);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C0079a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 != 1) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeString(f6033b);
                return true;
            }
            parcel.enforceInterface(f6033b);
            Map mapA = a();
            parcel2.writeNoException();
            parcel2.writeMap(mapA);
            return true;
        }
    }

    Map a() throws RemoteException;
}
