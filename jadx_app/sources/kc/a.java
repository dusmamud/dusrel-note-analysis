package kc;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConnectivityManager f30198a;

    public a(ConnectivityManager connectivityManager) {
        this.f30198a = connectivityManager;
    }

    public static ArrayList a(NetworkCapabilities networkCapabilities) {
        ArrayList arrayList = new ArrayList();
        if (networkCapabilities == null || !networkCapabilities.hasCapability(12)) {
            arrayList.add("none");
            return arrayList;
        }
        if (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(5)) {
            arrayList.add("wifi");
        }
        if (networkCapabilities.hasTransport(3)) {
            arrayList.add("ethernet");
        }
        if (networkCapabilities.hasTransport(4)) {
            arrayList.add("vpn");
        }
        if (networkCapabilities.hasTransport(0)) {
            arrayList.add("mobile");
        }
        if (networkCapabilities.hasTransport(2)) {
            arrayList.add("bluetooth");
        }
        if (Build.VERSION.SDK_INT >= 35 && networkCapabilities.hasTransport(10)) {
            arrayList.add("satellite");
        }
        if (arrayList.isEmpty() && networkCapabilities.hasCapability(12)) {
            arrayList.add("other");
        }
        if (arrayList.isEmpty()) {
            arrayList.add("none");
        }
        return arrayList;
    }
}
