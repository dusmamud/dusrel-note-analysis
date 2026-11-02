package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class zg2 implements vg2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f20204a = Executors.newSingleThreadScheduledExecutor();

    @Override // com.google.android.gms.internal.ads.vg2
    public final void a(Runnable runnable, long j10) {
        this.f20204a.schedule(runnable, j10, TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.vg2
    public final void zzb() {
    }
}
