package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class vx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f18249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f18250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f18251c = true;

    public vx0(si0 si0Var, ScheduledExecutorService scheduledExecutorService, j52 j52Var) {
        this.f18249a = si0Var;
        this.f18250b = scheduledExecutorService;
    }
}
