package v0;

import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public class d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f35153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35154b;

    public d(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f35153a = new Object[i10];
    }

    public T a() {
        int i10 = this.f35154b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object[] objArr = this.f35153a;
        T t6 = (T) objArr[i11];
        j.c(t6, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i11] = null;
        this.f35154b--;
        return t6;
    }

    public boolean b(T instance) {
        Object[] objArr;
        boolean z10;
        j.e(instance, "instance");
        int i10 = this.f35154b;
        int i11 = 0;
        while (true) {
            objArr = this.f35153a;
            if (i11 >= i10) {
                z10 = false;
                break;
            }
            if (objArr[i11] == instance) {
                z10 = true;
                break;
            }
            i11++;
        }
        if (z10) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i12 = this.f35154b;
        if (i12 >= objArr.length) {
            return false;
        }
        objArr[i12] = instance;
        this.f35154b = i12 + 1;
        return true;
    }
}
