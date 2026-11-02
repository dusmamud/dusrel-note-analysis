package a0;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f23b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f24c = {"standard", "accelerate", "decelerate", "linear"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f25a = "identity";

    public static class a extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final double f26d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final double f27e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final double f28f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final double f29g;

        public a(String str) {
            this.f25a = str;
            int iIndexOf = str.indexOf(40);
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            this.f26d = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
            int i10 = iIndexOf2 + 1;
            int iIndexOf3 = str.indexOf(44, i10);
            this.f27e = Double.parseDouble(str.substring(i10, iIndexOf3).trim());
            int i11 = iIndexOf3 + 1;
            int iIndexOf4 = str.indexOf(44, i11);
            this.f28f = Double.parseDouble(str.substring(i11, iIndexOf4).trim());
            int i12 = iIndexOf4 + 1;
            this.f29g = Double.parseDouble(str.substring(i12, str.indexOf(41, i12)).trim());
        }

        @Override // a0.c
        public final double a(double d10) {
            if (d10 <= 0.0d) {
                return 0.0d;
            }
            if (d10 >= 1.0d) {
                return 1.0d;
            }
            double d11 = 0.5d;
            double d12 = 0.5d;
            while (d11 > 0.01d) {
                d11 *= 0.5d;
                d12 = d(d12) < d10 ? d12 + d11 : d12 - d11;
            }
            double d13 = d12 - d11;
            double d14 = d(d13);
            double d15 = d12 + d11;
            double d16 = d(d15);
            double dE = e(d13);
            return (((d10 - d14) * (e(d15) - dE)) / (d16 - d14)) + dE;
        }

        @Override // a0.c
        public final double b(double d10) {
            double d11 = 0.5d;
            double d12 = 0.5d;
            while (d11 > 1.0E-4d) {
                d11 *= 0.5d;
                d12 = d(d12) < d10 ? d12 + d11 : d12 - d11;
            }
            double d13 = d12 - d11;
            double d14 = d12 + d11;
            return (e(d14) - e(d13)) / (d(d14) - d(d13));
        }

        public final double d(double d10) {
            double d11 = 1.0d - d10;
            double d12 = 3.0d * d11;
            double d13 = d11 * d12 * d10;
            double d14 = d12 * d10 * d10;
            return (this.f28f * d14) + (this.f26d * d13) + (d10 * d10 * d10);
        }

        public final double e(double d10) {
            double d11 = 1.0d - d10;
            double d12 = 3.0d * d11;
            double d13 = d11 * d12 * d10;
            double d14 = d12 * d10 * d10;
            return (this.f29g * d14) + (this.f27e * d13) + (d10 * d10 * d10);
        }
    }

    public static c c(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new a(str);
        }
        if (str.startsWith("spline")) {
            m mVar = new m();
            mVar.f25a = str;
            double[] dArr = new double[str.length() / 2];
            int iIndexOf = str.indexOf(40) + 1;
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            int i10 = 0;
            while (iIndexOf2 != -1) {
                dArr[i10] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
                iIndexOf = iIndexOf2 + 1;
                iIndexOf2 = str.indexOf(44, iIndexOf);
                i10++;
            }
            dArr[i10] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
            double[] dArrCopyOf = Arrays.copyOf(dArr, i10 + 1);
            int length = (dArrCopyOf.length * 3) - 2;
            int length2 = dArrCopyOf.length - 1;
            double d10 = 1.0d / ((double) length2);
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
            double[] dArr3 = new double[length];
            for (int i11 = 0; i11 < dArrCopyOf.length; i11++) {
                double d11 = dArrCopyOf[i11];
                int i12 = i11 + length2;
                dArr2[i12][0] = d11;
                double d12 = ((double) i11) * d10;
                dArr3[i12] = d12;
                if (i11 > 0) {
                    int i13 = (length2 * 2) + i11;
                    dArr2[i13][0] = d11 + 1.0d;
                    dArr3[i13] = d12 + 1.0d;
                    int i14 = i11 - 1;
                    dArr2[i14][0] = (d11 - 1.0d) - d10;
                    dArr3[i14] = (d12 - 1.0d) - d10;
                }
            }
            h hVar = new h(dArr3, dArr2);
            System.out.println(" 0 " + hVar.b(0.0d));
            System.out.println(" 1 " + hVar.b(1.0d));
            mVar.f79d = hVar;
            return mVar;
        }
        if (str.startsWith("Schlick")) {
            j jVar = new j();
            jVar.f25a = str;
            int iIndexOf3 = str.indexOf(40);
            int iIndexOf4 = str.indexOf(44, iIndexOf3);
            jVar.f63d = Double.parseDouble(str.substring(iIndexOf3 + 1, iIndexOf4).trim());
            int i15 = iIndexOf4 + 1;
            jVar.f64e = Double.parseDouble(str.substring(i15, str.indexOf(44, i15)).trim());
            return jVar;
        }
        switch (str) {
            case "accelerate":
                return new a("cubic(0.4, 0.05, 0.8, 0.7)");
            case "decelerate":
                return new a("cubic(0.0, 0.0, 0.2, 0.95)");
            case "anticipate":
                return new a("cubic(0.36, 0, 0.66, -0.56)");
            case "linear":
                return new a("cubic(1, 1, 0, 0)");
            case "overshoot":
                return new a("cubic(0.34, 1.56, 0.64, 1)");
            case "standard":
                return new a("cubic(0.4, 0.0, 0.2, 1)");
            default:
                System.err.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(f24c));
                return f23b;
        }
    }

    public double b(double d10) {
        return 1.0d;
    }

    public final String toString() {
        return this.f25a;
    }

    public double a(double d10) {
        return d10;
    }
}
