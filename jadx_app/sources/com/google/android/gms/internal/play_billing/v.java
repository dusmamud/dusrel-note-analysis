package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f22817a = 0;

    static {
        v.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel) {
        Parcelable.Creator creator = Bundle.CREATOR;
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel, u uVar) {
        parcel.writeStrongBinder(uVar.asBinder());
    }
}
