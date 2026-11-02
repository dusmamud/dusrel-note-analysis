package z8;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class o0<E> extends x<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o0 f37629e = new o0(new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f37630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f37631d;

    public o0(Object[] array, int size) {
        this.f37630c = array;
        this.f37631d = size;
    }

    @Override // z8.x, z8.v
    public final int b(int dst, Object[] dstOff) {
        Object[] objArr = this.f37630c;
        int i10 = this.f37631d;
        System.arraycopy(objArr, 0, dstOff, dst, i10);
        return dst + i10;
    }

    @Override // z8.v
    public final Object[] c() {
        return this.f37630c;
    }

    @Override // z8.v
    public final int d() {
        return this.f37631d;
    }

    @Override // z8.v
    public final int g() {
        return 0;
    }

    @Override // java.util.List
    public final E get(int i10) {
        y8.h.c(i10, this.f37631d);
        E e10 = (E) this.f37630c[i10];
        Objects.requireNonNull(e10);
        return e10;
    }

    @Override // z8.v
    public final boolean h() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f37631d;
    }

    @Override // z8.x, z8.v
    public Object writeReplace() {
        return super.writeReplace();
    }
}
