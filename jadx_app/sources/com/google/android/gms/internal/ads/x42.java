package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class x42 implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f18884a = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f18884a.getAndIncrement();
        return new Thread(runnable, com.google.android.gms.internal.mlkit_genai_speech.a.b(andIncrement, "AdWorker(NG) #", new StringBuilder(String.valueOf(andIncrement).length() + 14)));
    }
}
