package o5;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f32354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f32355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f32356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f32357d;

    public static void a(String str, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.a(e(str), i10);
            return;
        }
        String strE = e(str);
        try {
            if (f32356c == null) {
                f32356c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f32356c.invoke(null, Long.valueOf(f32354a), strE, Integer.valueOf(i10));
        } catch (Exception e10) {
            c("asyncTraceBegin", e10);
        }
    }

    public static void b(String str, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.b(e(str), i10);
            return;
        }
        String strE = e(str);
        try {
            if (f32357d == null) {
                f32357d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f32357d.invoke(null, Long.valueOf(f32354a), strE, Integer.valueOf(i10));
        } catch (Exception e10) {
            c("asyncTraceEnd", e10);
        }
    }

    public static void c(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean d() {
        if (Build.VERSION.SDK_INT >= 29) {
            return b.c();
        }
        try {
            if (f32355b == null) {
                f32354a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f32355b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f32355b.invoke(null, Long.valueOf(f32354a))).booleanValue();
        } catch (Exception e10) {
            c("isTagEnabled", e10);
            return false;
        }
    }

    public static String e(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }
}
