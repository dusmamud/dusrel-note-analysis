package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

/* JADX INFO: loaded from: classes.dex */
public final class ig0 extends sq implements of0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10756b;

    public ig0(RewardItem rewardItem) {
        this(rewardItem != null ? rewardItem.getType() : "", rewardItem != null ? rewardItem.getAmount() : 1);
    }

    @Override // com.google.android.gms.internal.ads.sq
    public final boolean dispatchTransaction(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f10755a);
        } else {
            if (i10 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.f10756b);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.of0
    public final String zze() throws RemoteException {
        return this.f10755a;
    }

    @Override // com.google.android.gms.internal.ads.of0
    public final int zzf() throws RemoteException {
        return this.f10756b;
    }

    public ig0(String str, int i10) {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
        this.f10755a = str;
        this.f10756b = i10;
    }
}
