package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class vj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f18061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18062e;

    public final long a() {
        int i10 = this.f18060c;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f18061d;
        int i11 = this.f18058a;
        long j10 = jArr[i11];
        this.f18058a = this.f18062e & (i11 + 1);
        this.f18060c = i10 - 1;
        return j10;
    }
}
