package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class w00 extends rq implements y00 {
    public w00(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // com.google.android.gms.internal.ads.y00
    public final String zza() throws RemoteException {
        Parcel parcelZzda = zzda(2, zzcZ());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.y00
    public final ArrayList zzb() throws RemoteException {
        Parcel parcelZzda = zzda(3, zzcZ());
        ArrayList arrayList = parcelZzda.readArrayList(tq.f16522a);
        parcelZzda.recycle();
        return arrayList;
    }
}
