package com.google.android.gms.internal.consent_sdk;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class o1 extends t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20899b;

    public o1(Object obj) {
        this.f20898a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f20899b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f20899b) {
            throw new NoSuchElementException();
        }
        this.f20899b = true;
        return this.f20898a;
    }
}
