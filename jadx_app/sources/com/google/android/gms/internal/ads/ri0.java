package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class ri0 implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f15380a = new AtomicInteger(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15381b;

    public ri0(String str) {
        this.f15381b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f15380a.getAndIncrement();
        int length = String.valueOf(andIncrement).length();
        String str = this.f15381b;
        StringBuilder sb2 = new StringBuilder(com.google.android.gms.ads.internal.util.client.a.a(12, length, str));
        sb2.append("AdWorker(");
        sb2.append(str);
        sb2.append(") #");
        sb2.append(andIncrement);
        return new Thread(runnable, sb2.toString());
    }
}
