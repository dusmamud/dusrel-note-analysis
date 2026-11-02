package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class o83 extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13684a;

    public o83() {
        this.f13684a = 2008;
    }

    public o83(String str, int i10) {
        super(str);
        this.f13684a = i10;
    }

    public o83(int i10, String str, Exception exc) {
        super(str, exc);
        this.f13684a = i10;
    }

    public o83(int i10, Exception exc) {
        super(exc);
        this.f13684a = i10;
    }
}
