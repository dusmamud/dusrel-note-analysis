package y2;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f36799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f36800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f36801d;

    public b(long j10, long j11) {
        this.f36799b = j10;
        this.f36800c = j11;
        this.f36801d = j10 - 1;
    }

    public final void c() {
        long j10 = this.f36801d;
        if (j10 < this.f36799b || j10 > this.f36800c) {
            throw new NoSuchElementException();
        }
    }

    @Override // y2.n
    public final boolean next() {
        long j10 = this.f36801d + 1;
        this.f36801d = j10;
        return !(j10 > this.f36800c);
    }
}
