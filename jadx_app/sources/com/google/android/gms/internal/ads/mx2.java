package com.google.android.gms.internal.ads;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* JADX INFO: loaded from: classes.dex */
public final class mx2 extends AbstractOwnableSynchronizer implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nx2 f13038a;

    public final /* synthetic */ void a(Thread thread) {
        setExclusiveOwnerThread(thread);
    }

    @Override // java.lang.Runnable
    public final void run() {
    }

    public final String toString() {
        return this.f13038a.toString();
    }
}
