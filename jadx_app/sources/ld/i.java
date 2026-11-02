package ld;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements Iterator, gd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f31015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f31016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f31017d;

    public i(long j10, long j11, long j12) {
        this.f31014a = j12;
        this.f31015b = j11;
        boolean z10 = false;
        if (j12 <= 0 ? j10 >= j11 : j10 <= j11) {
            z10 = true;
        }
        this.f31016c = z10;
        this.f31017d = z10 ? j10 : j11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f31016c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        long j10 = this.f31017d;
        if (j10 != this.f31015b) {
            this.f31017d = this.f31014a + j10;
        } else {
            if (!this.f31016c) {
                throw new NoSuchElementException();
            }
            this.f31016c = false;
        }
        return Long.valueOf(j10);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
