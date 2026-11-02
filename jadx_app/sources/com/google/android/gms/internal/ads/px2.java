package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public interface px2 extends ExecutorService, AutoCloseable {
    @Override // java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.px2
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    d9.b submit(Runnable runnable, Object obj);

    @Override // java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.px2
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    d9.b submit(Callable callable);

    @Override // java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.px2
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    d9.b submit(Runnable runnable);

    @Override // java.lang.AutoCloseable
    /* synthetic */ default void close() {
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z10 = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z10) {
                    shutdownNow();
                    z10 = true;
                }
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }
}
