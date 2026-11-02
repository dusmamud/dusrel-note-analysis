package a0;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f58a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double[] f59b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double[] f60c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h f61d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f62e;

    public final void a(double d10, float f10) {
        int length = this.f58a.length + 1;
        int iBinarySearch = Arrays.binarySearch(this.f59b, d10);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.f59b = Arrays.copyOf(this.f59b, length);
        this.f58a = Arrays.copyOf(this.f58a, length);
        this.f60c = new double[length];
        double[] dArr = this.f59b;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        this.f59b[iBinarySearch] = d10;
        this.f58a[iBinarySearch] = f10;
    }

    public final double b(double d10) {
        if (d10 <= 0.0d) {
            return 0.0d;
        }
        if (d10 >= 1.0d) {
            return 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch(this.f59b, d10);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        float[] fArr = this.f58a;
        float f10 = fArr[iBinarySearch];
        int i10 = iBinarySearch - 1;
        float f11 = fArr[i10];
        double d11 = f10 - f11;
        double[] dArr = this.f59b;
        double d12 = dArr[iBinarySearch];
        double d13 = dArr[i10];
        double d14 = d11 / (d12 - d13);
        return ((((d10 * d10) - (d13 * d13)) * d14) / 2.0d) + ((d10 - d13) * (((double) f11) - (d14 * d13))) + this.f60c[i10];
    }

    public final double c(double d10, double d11) {
        double dAbs;
        double dB = b(d10) + d11;
        switch (this.f62e) {
            case 1:
                return Math.signum(0.5d - (dB % 1.0d));
            case 2:
                dAbs = Math.abs((((dB * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((dB * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                dAbs = ((dB * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos((d11 + dB) * 6.283185307179586d);
            case 6:
                double dAbs2 = 1.0d - Math.abs(((dB * 4.0d) % 4.0d) - 2.0d);
                dAbs = dAbs2 * dAbs2;
                break;
            case 7:
                return this.f61d.b(dB % 1.0d);
            default:
                return Math.sin(6.283185307179586d * dB);
        }
        return 1.0d - dAbs;
    }

    public final String toString() {
        return "pos =" + Arrays.toString(this.f59b) + " period=" + Arrays.toString(this.f58a);
    }
}
