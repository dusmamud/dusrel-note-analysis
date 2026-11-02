package com.amazon.device.iap.internal.util;

/* JADX INFO: loaded from: classes.dex */
public enum d {
    LEGACY(0),
    V1(1),
    V2(2),
    V3(3);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f6282e;

    d(int i10) {
        this.f6282e = i10;
    }

    public int a() {
        return this.f6282e;
    }

    public boolean a(d dVar) {
        return dVar != null && this.f6282e < dVar.f6282e;
    }
}
