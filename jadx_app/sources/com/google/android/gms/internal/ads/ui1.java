package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes.dex */
public final class ui1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f16987a = new Object();

    public static void a(String str, String str2) {
        synchronized (f16987a) {
            Log.d(str, g(str2, null));
        }
    }

    public static void b(String str, String str2) {
        synchronized (f16987a) {
            Log.i(str, g(str2, null));
        }
    }

    public static void c(String str, String str2) {
        synchronized (f16987a) {
            Log.w(str, g(str2, null));
        }
    }

    public static void d(String str, String str2, Throwable th) {
        synchronized (f16987a) {
            Log.w(str, g(str2, th));
        }
    }

    public static void e(String str, String str2) {
        synchronized (f16987a) {
            Log.e(str, g(str2, null));
        }
    }

    public static void f(String str, String str2, Throwable th) {
        synchronized (f16987a) {
            Log.e(str, g(str2, th));
        }
    }

    public static String g(String str, Throwable th) {
        String strReplace;
        if (th != null) {
            synchronized (f16987a) {
                Throwable cause = th;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                            break;
                        }
                        cause = cause.getCause();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        String strReplace2 = strReplace.replace("\n", "\n  ");
        int length = String.valueOf(str).length();
        return ki.c(new StringBuilder(String.valueOf(strReplace2).length() + length + 3 + 1), str, "\n  ", strReplace2, "\n");
    }
}
