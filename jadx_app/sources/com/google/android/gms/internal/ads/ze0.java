package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ze0 extends sq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20177b;

    public ze0(String str, int i10) {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
        this.f20176a = str;
        this.f20177b = i10;
    }

    @Override // com.google.android.gms.internal.ads.sq
    public final boolean dispatchTransaction(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f20176a);
        } else {
            if (i10 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.f20177b);
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ze0)) {
            return false;
        }
        ze0 ze0Var = (ze0) obj;
        if (Objects.equal(this.f20176a, ze0Var.f20176a)) {
            if (Objects.equal(Integer.valueOf(this.f20177b), Integer.valueOf(ze0Var.f20177b))) {
                return true;
            }
        }
        return false;
    }
}
