package c9;

import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.Arrays;
import y8.h;

/* JADX INFO: loaded from: classes2.dex */
@Immutable
public final class a implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f4478c = new a(new int[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f4479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4480b;

    public a(int[] array) {
        int length = array.length;
        this.f4479a = array;
        this.f4480b = length;
    }

    public final boolean equals(Object object) {
        a aVar;
        int i10;
        int i11;
        if (object == this) {
            return true;
        }
        if ((object instanceof a) && (i11 = this.f4480b) == (i10 = (aVar = (a) object).f4480b)) {
            for (int i12 = 0; i12 < i11; i12++) {
                h.c(i12, i11);
                int i13 = this.f4479a[i12];
                h.c(i12, i10);
                if (i13 == aVar.f4479a[i12]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f4480b; i11++) {
            i10 = (i10 * 31) + this.f4479a[i11];
        }
        return i10;
    }

    public Object readResolve() {
        return this.f4480b == 0 ? f4478c : this;
    }

    public final String toString() {
        int i10 = this.f4480b;
        if (i10 == 0) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(i10 * 5);
        sb2.append('[');
        int[] iArr = this.f4479a;
        sb2.append(iArr[0]);
        for (int i11 = 1; i11 < i10; i11++) {
            sb2.append(", ");
            sb2.append(iArr[i11]);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public Object writeReplace() {
        int[] iArr = this.f4479a;
        int length = iArr.length;
        int i10 = this.f4480b;
        return i10 < length ? new a(Arrays.copyOfRange(iArr, 0, i10)) : this;
    }
}
