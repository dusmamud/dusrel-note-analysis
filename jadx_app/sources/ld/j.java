package ld;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements e<Long>, Iterable<Long>, gd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f31019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f31020c;

    public j(long j10, long j11) {
        this.f31018a = j10;
        if (j10 < j11) {
            long j12 = j11 % 1;
            long j13 = j10 % 1;
            long j14 = ((j12 < 0 ? j12 + 1 : j12) - (j13 < 0 ? j13 + 1 : j13)) % 1;
            j11 -= j14 < 0 ? j14 + 1 : j14;
        }
        this.f31019b = j11;
        this.f31020c = 1L;
    }

    @Override // ld.e
    public final Comparable b() {
        return Long.valueOf(this.f31018a);
    }

    @Override // ld.e
    public final Comparable d() {
        return Long.valueOf(this.f31019b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (isEmpty() && ((j) obj).isEmpty()) {
            return true;
        }
        j jVar = (j) obj;
        return this.f31018a == jVar.f31018a && this.f31019b == jVar.f31019b;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j10 = this.f31018a;
        long j11 = ((long) 31) * (j10 ^ (j10 >>> 32));
        long j12 = this.f31019b;
        return (int) (j11 + (j12 ^ (j12 >>> 32)));
    }

    @Override // ld.e
    public final boolean isEmpty() {
        return this.f31018a > this.f31019b;
    }

    @Override // java.lang.Iterable
    public final Iterator<Long> iterator() {
        return new i(this.f31018a, this.f31019b, this.f31020c);
    }

    public final String toString() {
        return this.f31018a + ".." + this.f31019b;
    }
}
