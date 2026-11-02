package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class j52 implements d9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d9.b f11115c;

    public j52(Object obj, String str, d9.b bVar) {
        this.f11113a = obj;
        this.f11114b = str;
        this.f11115c = bVar;
    }

    @Override // d9.b
    public final void addListener(Runnable runnable, Executor executor) {
        this.f11115c.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return this.f11115c.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return this.f11115c.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f11115c.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f11115c.isDone();
    }

    public final String toString() {
        int iIdentityHashCode = System.identityHashCode(this);
        String str = this.f11114b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(iIdentityHashCode).length());
        sb2.append(str);
        sb2.append("@");
        sb2.append(iIdentityHashCode);
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f11115c.get(j10, timeUnit);
    }
}
