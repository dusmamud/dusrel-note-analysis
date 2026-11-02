package b9;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4219a = 0;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4220a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f4220a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4220a[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4220a[RoundingMode.CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4220a[RoundingMode.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4220a[RoundingMode.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4220a[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4220a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4220a[RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    static {
        Math.log(2.0d);
    }

    public static boolean a(double x4) {
        if (Math.getExponent(x4) <= 1023) {
            if (x4 != 0.0d) {
                if (!(Math.getExponent(x4) <= 1023)) {
                    throw new IllegalArgumentException("not a normal value");
                }
                int exponent = Math.getExponent(x4);
                long jDoubleToRawLongBits = Double.doubleToRawLongBits(x4) & 4503599627370495L;
                if (52 - Long.numberOfTrailingZeros(exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L) <= Math.getExponent(x4)) {
                }
            }
            return true;
        }
        return false;
    }
}
