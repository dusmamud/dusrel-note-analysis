package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
public abstract class r2 implements DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Choreographer f15156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DisplayManager f15157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile long f15158c = -9223372036854775807L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile long f15159d = -9223372036854775807L;

    public /* synthetic */ r2(Choreographer choreographer, DisplayManager displayManager) {
        this.f15156a = choreographer;
        this.f15157b = displayManager;
    }

    public abstract void a();

    public abstract void b();

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i10) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i10) {
    }
}
