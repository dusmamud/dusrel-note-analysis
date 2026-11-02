package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class pq2 extends nu2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f14437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14438c;

    public pq2() {
        super(0);
        this.f14438c = 2;
    }

    public abstract Object a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        up2.f(this.f14438c != 4);
        int i10 = this.f14438c;
        int i11 = i10 - 1;
        if (i10 == 0) {
            throw null;
        }
        if (i11 == 0) {
            return true;
        }
        if (i11 != 2) {
            this.f14438c = 4;
            this.f14437b = a();
            if (this.f14438c != 3) {
                this.f14438c = 1;
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.nu2, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f14438c = 2;
        Object obj = this.f14437b;
        this.f14437b = null;
        return obj;
    }
}
