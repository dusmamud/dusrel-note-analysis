package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class dh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f8335a = Log.isLoggable("Volley", 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f8336b = dh.class.getName();

    public static void a(String str, Object... objArr) {
        if (f8335a) {
            Log.v("Volley", d(str, objArr));
        }
    }

    public static void b(String str, Object... objArr) {
        Log.d("Volley", d(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        Log.e("Volley", d(str, objArr));
    }

    public static String d(String str, Object... objArr) {
        String strB;
        String str2 = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        for (int i10 = 2; i10 < stackTrace.length; i10++) {
            if (!stackTrace[i10].getClassName().equals(f8336b)) {
                String className = stackTrace[i10].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                String strSubstring2 = strSubstring.substring(strSubstring.lastIndexOf(36) + 1);
                String methodName = stackTrace[i10].getMethodName();
                strB = com.google.android.recaptcha.internal.d.b(new StringBuilder(String.valueOf(strSubstring2).length() + 1 + String.valueOf(methodName).length()), strSubstring2, ".", methodName);
                Locale locale = Locale.US;
                long id2 = Thread.currentThread().getId();
                StringBuilder sb2 = new StringBuilder("[");
                sb2.append(id2);
                sb2.append("] ");
                sb2.append(strB);
                return androidx.concurrent.futures.c.a(sb2, ": ", str2);
            }
        }
        strB = "<unknown>";
        Locale locale2 = Locale.US;
        long id3 = Thread.currentThread().getId();
        StringBuilder sb3 = new StringBuilder("[");
        sb3.append(id3);
        sb3.append("] ");
        sb3.append(strB);
        return androidx.concurrent.futures.c.a(sb3, ": ", str2);
    }
}
