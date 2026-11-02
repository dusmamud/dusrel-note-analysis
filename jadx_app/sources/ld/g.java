package ld;

import java.util.NoSuchElementException;
import tc.z;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f31011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f31012d;

    public g(int i10, int i11, int i12) {
        this.f31009a = i12;
        this.f31010b = i11;
        boolean z10 = false;
        if (i12 <= 0 ? i10 >= i11 : i10 <= i11) {
            z10 = true;
        }
        this.f31011c = z10;
        this.f31012d = z10 ? i10 : i11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f31011c;
    }

    @Override // tc.z
    public final int nextInt() {
        int i10 = this.f31012d;
        if (i10 != this.f31010b) {
            this.f31012d = this.f31009a + i10;
            return i10;
        }
        if (!this.f31011c) {
            throw new NoSuchElementException();
        }
        this.f31011c = false;
        return i10;
    }
}
