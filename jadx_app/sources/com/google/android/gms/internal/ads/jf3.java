package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class jf3 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public kf3 f11313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public kf3 f11314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf3 f11316d;

    public jf3(lf3 lf3Var) {
        Objects.requireNonNull(lf3Var);
        this.f11316d = lf3Var;
        this.f11313a = lf3Var.f12369e.f11818d;
        this.f11314b = null;
        this.f11315c = lf3Var.f12368d;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final kf3 next() {
        kf3 kf3Var = this.f11313a;
        lf3 lf3Var = this.f11316d;
        if (kf3Var == lf3Var.f12369e) {
            throw new NoSuchElementException();
        }
        if (lf3Var.f12368d != this.f11315c) {
            throw new ConcurrentModificationException();
        }
        this.f11313a = kf3Var.f11818d;
        this.f11314b = kf3Var;
        return kf3Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11313a != this.f11316d.f12369e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        kf3 kf3Var = this.f11314b;
        if (kf3Var == null) {
            throw new IllegalStateException();
        }
        lf3 lf3Var = this.f11316d;
        lf3Var.c(kf3Var, true);
        this.f11314b = null;
        this.f11315c = lf3Var.f12368d;
    }
}
