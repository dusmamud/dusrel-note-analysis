package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.b0;
import com.google.android.gms.internal.auth.b1;

/* JADX INFO: loaded from: classes.dex */
public abstract class zza extends b0 implements zzb {
    public zza() {
        super("com.google.android.gms.auth.account.IWorkAccountCallback");
    }

    @Override // com.google.android.gms.internal.auth.b0
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            int i12 = b1.f20487a;
            int i13 = parcel.readInt();
            b1.b(parcel);
            zzc(i13 != 0);
        } else {
            Account account = (Account) b1.a(parcel, Account.CREATOR);
            b1.b(parcel);
            zzb(account);
        }
        return true;
    }
}
