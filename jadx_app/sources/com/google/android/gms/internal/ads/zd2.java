package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final class zd2 implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadFactory f20157a = Executors.defaultThreadFactory();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f20157a.newThread(runnable);
        if (threadNewThread == null) {
            throw new NullPointerException("Default ThreadFactory returned null thread");
        }
        threadNewThread.setName("punch".concat(String.valueOf(threadNewThread.getName())));
        return threadNewThread;
    }
}
