package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.Spliterators;

/* JADX INFO: loaded from: classes.dex */
public final class nv2 extends AbstractList implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f13537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13539c;

    public nv2(int i10, int i11, int[] iArr) {
        this.f13537a = iArr;
        this.f13538b = i10;
        this.f13539c = i11;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f13538b;
        while (i10 < this.f13539c) {
            if (this.f13537a[i10] == iIntValue) {
                if (i10 != -1) {
                    return true;
                }
                return false;
            }
            i10++;
        }
        i10 = -1;
        if (i10 != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nv2)) {
            return super.equals(obj);
        }
        nv2 nv2Var = (nv2) obj;
        int i10 = nv2Var.f13539c;
        int i11 = nv2Var.f13538b;
        int i12 = i10 - i11;
        int i13 = this.f13539c;
        int i14 = this.f13538b;
        int i15 = i13 - i14;
        if (i12 != i15) {
            return false;
        }
        for (int i16 = 0; i16 < i15; i16++) {
            if (this.f13537a[i14 + i16] != nv2Var.f13537a[i11 + i16]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        int i11 = this.f13539c;
        int i12 = this.f13538b;
        up2.i(i10, i11 - i12);
        return Integer.valueOf(this.f13537a[i12 + i10]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iHashCode = 1;
        for (int i10 = this.f13538b; i10 < this.f13539c; i10++) {
            iHashCode = (iHashCode * 31) + Integer.hashCode(this.f13537a[i10]);
        }
        return iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001f  */
    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i10 = this.f13538b;
            int i11 = i10;
            while (i11 < this.f13539c) {
                if (this.f13537a[i11] != iIntValue) {
                    i11++;
                } else if (i11 >= 0) {
                    return i11 - i10;
                }
            }
            i11 = -1;
            if (i11 >= 0) {
                return i11 - i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i10;
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i11 = this.f13539c - 1;
            while (true) {
                i10 = this.f13538b;
                if (i11 < i10) {
                    i11 = -1;
                    break;
                }
                if (this.f13537a[i11] == iIntValue) {
                    break;
                }
                i11--;
            }
            if (i11 >= 0) {
                return i11 - i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int i11 = this.f13539c;
        int i12 = this.f13538b;
        Integer num = (Integer) obj;
        up2.i(i10, i11 - i12);
        int i13 = i12 + i10;
        int[] iArr = this.f13537a;
        int i14 = iArr[i13];
        num.getClass();
        iArr[i13] = num.intValue();
        return Integer.valueOf(i14);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13539c - this.f13538b;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return Spliterators.spliterator(this.f13537a, this.f13538b, this.f13539c, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i10, int i11) {
        int i12 = this.f13539c;
        int i13 = this.f13538b;
        up2.k(i10, i11, i12 - i13);
        return i10 == i11 ? Collections.EMPTY_LIST : new nv2(i10 + i13, i13 + i11, this.f13537a);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        int i10 = this.f13539c;
        int i11 = this.f13538b;
        StringBuilder sb2 = new StringBuilder((i10 - i11) * 5);
        sb2.append('[');
        int[] iArr = this.f13537a;
        sb2.append(iArr[i11]);
        while (true) {
            i11++;
            if (i11 >= i10) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(iArr[i11]);
        }
    }
}
