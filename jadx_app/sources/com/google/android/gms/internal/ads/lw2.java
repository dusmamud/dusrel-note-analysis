package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class lw2 extends AbstractExecutorService implements px2, AutoCloseable {
    @Override // com.google.android.gms.internal.ads.px2
    /* JADX INFO: renamed from: Q */
    public final d9.b submit(Runnable runnable, Object obj) {
        return (d9.b) super.submit(runnable, obj);
    }

    @Override // com.google.android.gms.internal.ads.px2
    /* JADX INFO: renamed from: W */
    public final d9.b submit(Callable callable) {
        return (d9.b) super.submit(callable);
    }

    @Override // com.google.android.gms.internal.ads.px2
    /* JADX INFO: renamed from: a0 */
    public final d9.b submit(Runnable runnable) {
        return (d9.b) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.ads.px2, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
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

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new dy2(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.px2
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (d9.b) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new dy2(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.px2
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (d9.b) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.px2
    public final /* synthetic */ Future submit(Callable callable) {
        return (d9.b) super.submit(callable);
    }
}
