package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class xv2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final xv2 f19401d = new xv2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f19402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f19403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public xv2 f19404c;

    public xv2() {
        this.f19402a = null;
        this.f19403b = null;
    }

    public xv2(Runnable runnable, Executor executor) {
        this.f19402a = runnable;
        this.f19403b = executor;
    }
}
