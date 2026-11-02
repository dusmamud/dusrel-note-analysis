package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class at2 extends nu2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6888c;

    public at2(Object obj) {
        super(0);
        this.f6887b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f6888c;
    }

    @Override // com.google.android.gms.internal.ads.nu2, java.util.Iterator
    public final Object next() {
        if (this.f6888c) {
            throw new NoSuchElementException();
        }
        this.f6888c = true;
        return this.f6887b;
    }
}
