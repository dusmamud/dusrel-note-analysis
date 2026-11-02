package com.amazon.a.a.o;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f5860a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f5861b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f5862c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f5863d = "Kiwi";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f5864e;

    public c(String str) {
        this.f5864e = str;
    }

    private String d(String str) {
        return com.google.android.recaptcha.internal.d.b(new StringBuilder(), this.f5864e, ": ", str);
    }

    public void a(String str) {
        if (f5860a) {
            Log.d(f5863d, d(str));
        }
    }

    public void b(String str) {
        if (f5861b) {
            Log.e(f5863d, d(str));
        }
    }

    public void c(String str) {
        if (f5862c) {
            Log.e(f5863d, "TEST-" + d(str));
        }
    }

    public void a(String str, Throwable th) {
        if (f5860a) {
            Log.d(f5863d, d(str), th);
        }
    }

    public void b(String str, Throwable th) {
        if (f5861b) {
            Log.e(f5863d, d(str), th);
        }
    }

    public static void a() {
        f5862c = true;
    }

    public static boolean b() {
        return f5862c;
    }
}
