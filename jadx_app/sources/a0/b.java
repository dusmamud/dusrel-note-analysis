package a0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    public static class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double f21a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double[] f22b;

        @Override // a0.b
        public final double b(double d10) {
            return this.f22b[0];
        }

        @Override // a0.b
        public final void c(double d10, double[] dArr) {
            double[] dArr2 = this.f22b;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // a0.b
        public final void d(double d10, float[] fArr) {
            int i10 = 0;
            while (true) {
                double[] dArr = this.f22b;
                if (i10 >= dArr.length) {
                    return;
                }
                fArr[i10] = (float) dArr[i10];
                i10++;
            }
        }

        @Override // a0.b
        public final double e(double d10) {
            return 0.0d;
        }

        @Override // a0.b
        public final void f(double d10, double[] dArr) {
            for (int i10 = 0; i10 < this.f22b.length; i10++) {
                dArr[i10] = 0.0d;
            }
        }

        @Override // a0.b
        public final double[] g() {
            return new double[]{this.f21a};
        }
    }

    public static b a(int i10, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i10 = 2;
        }
        if (i10 == 0) {
            return new h(dArr, dArr2);
        }
        if (i10 == 2) {
            double d10 = dArr[0];
            double[] dArr3 = dArr2[0];
            a aVar = new a();
            aVar.f21a = d10;
            aVar.f22b = dArr3;
            return aVar;
        }
        g gVar = new g();
        int length = dArr2[0].length;
        gVar.f53c = new double[length];
        gVar.f51a = dArr;
        gVar.f52b = dArr2;
        if (length > 2) {
            double d11 = 0.0d;
            int i11 = 0;
            while (true) {
                double d12 = d11;
                if (i11 >= dArr.length) {
                    break;
                }
                double d13 = dArr2[i11][0];
                if (i11 > 0) {
                    Math.hypot(d13 - d11, d13 - d12);
                }
                i11++;
                d11 = d13;
            }
        }
        return gVar;
    }

    public abstract double b(double d10);

    public abstract void c(double d10, double[] dArr);

    public abstract void d(double d10, float[] fArr);

    public abstract double e(double d10);

    public abstract void f(double d10, double[] dArr);

    public abstract double[] g();
}
