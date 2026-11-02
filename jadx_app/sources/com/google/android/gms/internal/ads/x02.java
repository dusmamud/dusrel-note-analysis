package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class x02 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f18841a = new long[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f18842b = new Object[10];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18844d;

    public final synchronized void a(long j10, Object obj) {
        try {
            int i10 = this.f18844d;
            if (i10 > 0) {
                if (j10 <= this.f18841a[((this.f18843c + i10) - 1) % this.f18842b.length]) {
                    synchronized (this) {
                        this.f18843c = 0;
                        this.f18844d = 0;
                        Arrays.fill(this.f18842b, (Object) null);
                    }
                }
            }
            int length = this.f18842b.length;
            if (this.f18844d >= length) {
                int i11 = length + length;
                long[] jArr = new long[i11];
                Object[] objArr = new Object[i11];
                int i12 = this.f18843c;
                int i13 = length - i12;
                System.arraycopy(this.f18841a, i12, jArr, 0, i13);
                System.arraycopy(this.f18842b, this.f18843c, objArr, 0, i13);
                int i14 = this.f18843c;
                if (i14 > 0) {
                    System.arraycopy(this.f18841a, 0, jArr, i13, i14);
                    System.arraycopy(this.f18842b, 0, objArr, i13, this.f18843c);
                }
                this.f18841a = jArr;
                this.f18842b = objArr;
                this.f18843c = 0;
            }
            int i15 = this.f18843c;
            int i16 = this.f18844d;
            Object[] objArr2 = this.f18842b;
            int length2 = (i15 + i16) % objArr2.length;
            this.f18841a[length2] = j10;
            objArr2[length2] = obj;
            this.f18844d = i16 + 1;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized int b() {
        return this.f18844d;
    }

    public final synchronized Object c() {
        if (this.f18844d == 0) {
            return null;
        }
        return e();
    }

    public final synchronized Object d(long j10) {
        Object objE;
        objE = null;
        while (this.f18844d > 0 && j10 - this.f18841a[this.f18843c] >= 0) {
            objE = e();
        }
        return objE;
    }

    public final Object e() {
        up2.f(this.f18844d > 0);
        Object[] objArr = this.f18842b;
        int i10 = this.f18843c;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f18843c = (i10 + 1) % objArr.length;
        this.f18844d--;
        return obj;
    }
}
