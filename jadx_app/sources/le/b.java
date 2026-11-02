package le;

import androidx.biometric.BiometricManager;
import se.d;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f31030b = new int[256];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f31031a = new int[3];

    static {
        for (int i10 = 0; i10 < 256; i10++) {
            int i11 = i10;
            for (int i12 = 0; i12 < 8; i12++) {
                i11 = (i11 & 1) == 1 ? (i11 >>> 1) ^ (-306674912) : i11 >>> 1;
            }
            f31030b[i10] = i11;
        }
    }

    public final byte a() {
        int i10 = this.f31031a[2] | 2;
        return (byte) ((i10 * (i10 ^ 1)) >>> 8);
    }

    public final void b(char[] cArr) {
        int[] iArr = this.f31031a;
        iArr[0] = 305419896;
        iArr[1] = 591751049;
        iArr[2] = 878082192;
        for (byte b10 : d.a(cArr)) {
            c((byte) (b10 & 255));
        }
    }

    public final void c(byte b10) {
        int[] iArr = this.f31031a;
        int i10 = iArr[0];
        int i11 = i10 >>> 8;
        int i12 = (b10 ^ i10) & BiometricManager.Authenticators.BIOMETRIC_WEAK;
        int[] iArr2 = f31030b;
        int i13 = iArr2[i12] ^ i11;
        iArr[0] = i13;
        int i14 = iArr[1] + (i13 & BiometricManager.Authenticators.BIOMETRIC_WEAK);
        iArr[1] = i14;
        int i15 = (i14 * 134775813) + 1;
        iArr[1] = i15;
        int i16 = iArr[2];
        iArr[2] = iArr2[(i16 ^ ((byte) (i15 >> 24))) & BiometricManager.Authenticators.BIOMETRIC_WEAK] ^ (i16 >>> 8);
    }
}
