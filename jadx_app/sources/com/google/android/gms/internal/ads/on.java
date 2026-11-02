package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes.dex */
public final class on {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NetworkCapabilities f13860a;

    public static on a(Context context) {
        if (context == null) {
            return null;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        on onVar = new on();
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback(new nn(onVar));
                return onVar;
            } catch (RuntimeException unused) {
                synchronized (on.class) {
                    onVar.f13860a = null;
                }
            }
        }
        return onVar;
    }
}
