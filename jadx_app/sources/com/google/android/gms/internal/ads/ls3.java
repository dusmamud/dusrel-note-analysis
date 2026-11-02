package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes.dex */
public final class ls3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f12559a = new SparseBooleanArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12560b;

    public final void a(int i10) {
        up2.f(!this.f12560b);
        this.f12559a.append(i10, true);
    }

    public final at3 b() {
        up2.f(!this.f12560b);
        this.f12560b = true;
        return new at3(this.f12559a);
    }
}
