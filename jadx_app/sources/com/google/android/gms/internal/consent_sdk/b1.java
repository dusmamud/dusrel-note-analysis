package com.google.android.gms.internal.consent_sdk;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class b1 implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadPoolExecutor f20707b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f20706a = new AtomicInteger(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f20708c = new WeakReference(null);

    public b1() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.google.android.gms.internal.consent_sdk.a1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                b1 b1Var = this.f20697a;
                Thread thread = new Thread(runnable, j2.j.a(b1Var.f20706a.getAndIncrement(), "Google consent worker #"));
                b1Var.f20708c = new WeakReference(thread);
                return thread;
            }
        });
        this.f20707b = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Thread.currentThread() == this.f20708c.get()) {
            runnable.run();
        } else {
            this.f20707b.execute(runnable);
        }
    }
}
