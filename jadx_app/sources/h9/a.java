package h9;

import com.google.errorprone.annotations.Immutable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@Immutable
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f27659a;

    public a(byte[] bArr, int i10) {
        byte[] bArr2 = new byte[i10];
        this.f27659a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i10);
    }

    public final boolean equals(Object o10) {
        if (o10 instanceof a) {
            return Arrays.equals(((a) o10).f27659a, this.f27659a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f27659a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Bytes(");
        byte[] bArr = this.f27659a;
        StringBuilder sb3 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            int i10 = b10 & 255;
            sb3.append("0123456789abcdef".charAt(i10 / 16));
            sb3.append("0123456789abcdef".charAt(i10 % 16));
        }
        sb2.append(sb3.toString());
        sb2.append(")");
        return sb2.toString();
    }
}
