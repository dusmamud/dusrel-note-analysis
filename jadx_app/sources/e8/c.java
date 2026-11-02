package e8;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a implements e {
    @Override // e8.e
    public final String zzc() throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        Parcel parcelX = x(1, parcelObtain);
        String string = parcelX.readString();
        parcelX.recycle();
        return string;
    }

    @Override // e8.e
    public final boolean zzd() throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        Parcel parcelX = x(6, parcelObtain);
        int i10 = b.f25890a;
        boolean z10 = parcelX.readInt() != 0;
        parcelX.recycle();
        return z10;
    }

    @Override // e8.e
    public final boolean zze() throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        int i10 = b.f25890a;
        parcelObtain.writeInt(1);
        Parcel parcelX = x(2, parcelObtain);
        boolean z10 = parcelX.readInt() != 0;
        parcelX.recycle();
        return z10;
    }
}
