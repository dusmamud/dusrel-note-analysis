package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class yn implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadFactory f19751a = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f19752b = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f19751a.newThread(runnable);
        int andIncrement = this.f19752b.getAndIncrement();
        StringBuilder sb2 = new StringBuilder(String.valueOf(andIncrement).length() + 5);
        sb2.append("gads-");
        sb2.append(andIncrement);
        threadNewThread.setName(sb2.toString());
        return threadNewThread;
    }
}
