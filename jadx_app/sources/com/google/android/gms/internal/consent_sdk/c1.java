package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Handler f20721a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b1 f20722b = new b1();

    public static void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Method must be call on main thread.");
        }
    }
}
