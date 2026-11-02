package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class r40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15173a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15174b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f15175c = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f15176d = new AtomicBoolean(false);

    public final synchronized boolean a(boolean z10) {
        if (!this.f15176d.get()) {
            return z10;
        }
        return this.f15173a;
    }
}
