package com.google.android.gms.internal.consent_sdk;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class ac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f20699a;

    public ac(Unsafe unsafe) {
        this.f20699a = unsafe;
    }

    public abstract double a(Object obj, long j10);

    public abstract float b(Object obj, long j10);

    public abstract void c(Object obj, long j10, boolean z10);

    public abstract void d(Object obj, long j10, byte b10);

    public abstract void e(Object obj, long j10, double d10);

    public abstract void f(Object obj, long j10, float f10);

    public abstract boolean g(Object obj, long j10);
}
