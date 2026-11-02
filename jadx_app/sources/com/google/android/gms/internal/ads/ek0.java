package com.google.android.gms.internal.ads;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class ek0 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Looper.myLooper().quit();
    }
}
