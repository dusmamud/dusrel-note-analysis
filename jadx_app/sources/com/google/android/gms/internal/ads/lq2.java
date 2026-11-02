package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class lq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f12523a;

    static {
        Object objInvoke;
        Method method = null;
        try {
            objInvoke = Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (Throwable th) {
            if (th.getClass().getName().equals("java.lang.ThreadDeath")) {
                throw th;
            }
            objInvoke = null;
        }
        f12523a = objInvoke;
        if (objInvoke != null) {
            try {
                Class.forName("sun.misc.JavaLangAccess", false, null).getMethod("getStackTraceElement", Throwable.class, Integer.TYPE);
            } catch (Throwable th2) {
                if (th2.getClass().getName().equals("java.lang.ThreadDeath")) {
                    throw th2;
                }
            }
        }
        if (objInvoke == null) {
            return;
        }
        try {
            try {
                method = Class.forName("sun.misc.JavaLangAccess", false, null).getMethod("getStackTraceDepth", Throwable.class);
            } catch (Throwable th3) {
                if (th3.getClass().getName().equals("java.lang.ThreadDeath")) {
                    throw th3;
                }
            }
            if (method == null) {
                return;
            }
            method.invoke(objInvoke, new Throwable());
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
        }
    }
}
