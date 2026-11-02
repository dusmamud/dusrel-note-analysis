package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class wg2 implements vg2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f18549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PriorityQueue f18550b = new PriorityQueue();

    public wg2(Executor executor) {
        this.f18549a = executor;
    }

    @Override // com.google.android.gms.internal.ads.vg2
    public final void a(Runnable runnable, long j10) {
        if (j10 <= 0) {
            this.f18549a.execute(runnable);
            return;
        }
        yg2 yg2Var = new yg2(runnable, System.currentTimeMillis() + j10);
        PriorityQueue priorityQueue = this.f18550b;
        synchronized (priorityQueue) {
            priorityQueue.add(yg2Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.vg2
    public final void zzb() {
        PriorityQueue priorityQueue = this.f18550b;
        synchronized (priorityQueue) {
            try {
                if (priorityQueue.isEmpty()) {
                    return;
                }
                PriorityQueue priorityQueue2 = new PriorityQueue();
                long jCurrentTimeMillis = System.currentTimeMillis();
                for (yg2 yg2Var = (yg2) priorityQueue.peek(); yg2Var != null && yg2Var.f19684b <= jCurrentTimeMillis; yg2Var = (yg2) priorityQueue.peek()) {
                    priorityQueue2.add(yg2Var);
                }
                Iterator it = priorityQueue2.iterator();
                while (it.hasNext()) {
                    try {
                        this.f18549a.execute(((yg2) it.next()).f19683a);
                    } catch (RuntimeException unused) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
