package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import g8.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class zbo extends r implements zbp {
    public zbo() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // g8.r
    public final boolean zba(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zbc();
        } else {
            if (i10 != 2) {
                return false;
            }
            zbb();
        }
        return true;
    }
}
