package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class ya<T> extends hb<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f22522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f22523b;

    /* JADX WARN: Multi-variable type inference failed */
    public ya(String str) {
        this.f22522a = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f22523b;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (this.f22523b) {
            throw new NoSuchElementException();
        }
        this.f22523b = true;
        return this.f22522a;
    }
}
