package com.google.android.gms.internal.ads;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class oq2 extends nu2 implements ListIterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13934c;

    public oq2(int i10, int i11) {
        super(0);
        up2.j(i11, i10);
        this.f13933b = i10;
        this.f13934c = i11;
    }

    public abstract Object a(int i10);

    @Override // java.util.ListIterator
    @Deprecated
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f13934c < this.f13933b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f13934c > 0;
    }

    @Override // com.google.android.gms.internal.ads.nu2, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f13934c;
        this.f13934c = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f13934c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f13934c - 1;
        this.f13934c = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f13934c - 1;
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
