package com.google.android.gms.dynamic;

import android.os.IBinder;
import android.os.IInterface;
import k8.j;

/* JADX INFO: loaded from: classes.dex */
public interface IObjectWrapper extends IInterface {

    public static abstract class Stub extends j implements IObjectWrapper {
        public Stub() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static IObjectWrapper asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return iInterfaceQueryLocalInterface instanceof IObjectWrapper ? (IObjectWrapper) iInterfaceQueryLocalInterface : new zzb(iBinder);
        }
    }
}
