package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class zzu extends k8.a implements ICancelToken {
    public zzu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICancelToken");
    }

    @Override // com.google.android.gms.common.internal.ICancelToken
    public final void cancel() throws RemoteException {
        zzC(2, zza());
    }
}
