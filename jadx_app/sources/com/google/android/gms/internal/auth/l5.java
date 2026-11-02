package com.google.android.gms.internal.auth;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class l5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f20585a;

    public l5(Unsafe unsafe) {
        this.f20585a = unsafe;
    }

    public abstract double a(Object obj, long j10);

    public abstract float b(Object obj, long j10);

    public abstract void c(Object obj, long j10, boolean z10);

    public abstract void d(Object obj, long j10, double d10);

    public abstract void e(Object obj, long j10, float f10);

    public abstract boolean f(long j10, Object obj);
}
