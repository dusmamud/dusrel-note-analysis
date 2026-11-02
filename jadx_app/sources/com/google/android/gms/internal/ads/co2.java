package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class co2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mh2 f7968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f7969b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f7970c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f7971d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Throwable f7972e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7973f;

    public co2(int i10, mh2 mh2Var) {
        this.f7973f = i10;
        this.f7968a = mh2Var;
    }

    public final void a() {
        if (this.f7969b.get()) {
            throw new IllegalStateException("Finished trace.");
        }
        this.f7970c = SystemClock.uptimeMillis();
    }

    public final void b(Throwable th) {
        if (this.f7969b.get()) {
            throw new IllegalStateException("Finished trace.");
        }
        this.f7972e = th;
    }

    public final void c() {
        AtomicBoolean atomicBoolean = this.f7969b;
        if (atomicBoolean.getAndSet(true)) {
            throw new IllegalStateException("Finished trace.");
        }
        this.f7971d = SystemClock.uptimeMillis();
        this.f7968a.a(this.f7973f - 1, atomicBoolean.get() ? this.f7971d - this.f7970c : -1L, null, this.f7972e);
    }
}
