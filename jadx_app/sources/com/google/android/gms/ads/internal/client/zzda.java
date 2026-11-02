package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.rq;

/* JADX INFO: loaded from: classes.dex */
public final class zzda extends rq implements zzdc {
    public zzda(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdc
    public final void zze() throws RemoteException {
        zzdb(1, zzcZ());
    }
}
