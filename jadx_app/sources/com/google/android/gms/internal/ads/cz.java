package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class cz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MotionEvent f8092a = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MotionEvent f8093b = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f8094c;

    public cz(ScheduledExecutorService scheduledExecutorService) {
        this.f8094c = scheduledExecutorService;
    }
}
