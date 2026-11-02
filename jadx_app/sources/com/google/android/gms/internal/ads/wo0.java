package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class wo0 implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f18675a = new AtomicInteger(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18676b;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f18675a.getAndIncrement();
        return new vo0(this, runnable, com.google.android.gms.internal.mlkit_genai_speech.a.b(andIncrement, "AdWorker(WebViewStartup) #", new StringBuilder(String.valueOf(andIncrement).length() + 26)), runnable);
    }
}
