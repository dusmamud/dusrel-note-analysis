package com.google.android.gms.internal.ads;

import android.os.HandlerThread;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class rq3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15511a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Looper f15512b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HandlerThread f15513c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15514d = 0;

    public final void a() {
        HandlerThread handlerThread;
        synchronized (this.f15511a) {
            try {
                up2.f(this.f15514d > 0);
                int i10 = this.f15514d - 1;
                this.f15514d = i10;
                if (i10 == 0 && (handlerThread = this.f15513c) != null) {
                    handlerThread.quit();
                    this.f15513c = null;
                    this.f15512b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
