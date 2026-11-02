package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.sq;
import com.google.android.gms.internal.ads.tq;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzec extends sq implements zzed {
    public zzec() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.internal.ads.sq
    public final boolean dispatchTransaction(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zze();
        } else if (i10 == 2) {
            zzf();
        } else if (i10 == 3) {
            zzg();
        } else if (i10 == 4) {
            zzh();
        } else {
            if (i10 != 5) {
                return false;
            }
            boolean zA = tq.a(parcel);
            tq.f(parcel);
            zzi(zA);
        }
        parcel2.writeNoException();
        return true;
    }
}
