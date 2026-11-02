package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class k91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f11713a;

    public k91() {
        throw null;
    }

    public final synchronized boolean a() {
        if (this.f11713a) {
            return false;
        }
        this.f11713a = true;
        notifyAll();
        return true;
    }

    public final synchronized void b() {
        boolean z10 = false;
        while (!this.f11713a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean c(long j10) {
        if (j10 > 0) {
            try {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j11 = j10 + jElapsedRealtime;
                if (j11 < jElapsedRealtime) {
                    b();
                } else {
                    boolean z10 = false;
                    while (!this.f11713a && jElapsedRealtime < j11) {
                        try {
                            wait(j11 - jElapsedRealtime);
                        } catch (InterruptedException unused) {
                            z10 = true;
                        }
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                    }
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f11713a;
    }
}
