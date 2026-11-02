package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ut2 extends js2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ut2 f17306e = new ut2(new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f17307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f17308d;

    public ut2(Object[] objArr, int i10) {
        this.f17307c = objArr;
        this.f17308d = i10;
    }

    @Override // com.google.android.gms.internal.ads.fs2
    public final Object[] b() {
        return this.f17307c;
    }

    @Override // com.google.android.gms.internal.ads.fs2
    public final int c() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.fs2
    public final int d() {
        return this.f17308d;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        up2.i(i10, this.f17308d);
        Object obj = this.f17307c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.fs2
    public final boolean h() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.js2, com.google.android.gms.internal.ads.fs2
    public final int i(int i10, Object[] objArr) {
        Object[] objArr2 = this.f17307c;
        int i11 = this.f17308d;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17308d;
    }
}
