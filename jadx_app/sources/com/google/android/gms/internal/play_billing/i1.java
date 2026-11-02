package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class i1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i1 f22689d = new i1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f22690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f22691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i1 f22692c;

    public i1() {
        this.f22690a = null;
        this.f22691b = null;
    }

    public i1(Runnable runnable, Executor executor) {
        this.f22690a = runnable;
        this.f22691b = executor;
    }
}
