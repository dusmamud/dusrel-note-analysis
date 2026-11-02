package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public class ph1 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14302a;

    public ph1(int i10) {
        this.f14302a = i10;
    }

    public ph1(int i10, String str) {
        super(str);
        this.f14302a = i10;
    }

    public ph1(String str, Throwable th) {
        super(str, th);
        this.f14302a = 1;
    }
}
