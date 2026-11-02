package a0;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double[] f0a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0000a[] f1b;

    /* JADX INFO: renamed from: a0.a$a, reason: collision with other inner class name */
    public static class C0000a {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final double[] f2s = new double[91];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double[] f3a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double f4b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public double f5c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public double f6d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public double f7e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public double f8f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public double f9g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public double f10h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public double f11i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public double f12j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public double f13k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public double f14l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public double f15m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public double f16n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public double f17o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public double f18p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f19q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f20r;

        public final double a() {
            double d10 = this.f12j * this.f18p;
            double dHypot = this.f16n / Math.hypot(d10, (-this.f13k) * this.f17o);
            return this.f19q ? (-d10) * dHypot : d10 * dHypot;
        }

        public final double b() {
            double d10 = this.f12j * this.f18p;
            double d11 = (-this.f13k) * this.f17o;
            double dHypot = this.f16n / Math.hypot(d10, d11);
            return this.f19q ? (-d11) * dHypot : d11 * dHypot;
        }

        public final double c(double d10) {
            double d11 = (d10 - this.f5c) * this.f11i;
            double d12 = this.f7e;
            return ((this.f8f - d12) * d11) + d12;
        }

        public final double d(double d10) {
            double d11 = (d10 - this.f5c) * this.f11i;
            double d12 = this.f9g;
            return ((this.f10h - d12) * d11) + d12;
        }

        public final double e() {
            return (this.f12j * this.f17o) + this.f14l;
        }

        public final double f() {
            return (this.f13k * this.f18p) + this.f15m;
        }

        public final void g(double d10) {
            double d11 = (this.f19q ? this.f6d - d10 : d10 - this.f5c) * this.f11i;
            double d12 = 0.0d;
            if (d11 > 0.0d) {
                d12 = 1.0d;
                if (d11 < 1.0d) {
                    double[] dArr = this.f3a;
                    double length = d11 * ((double) (dArr.length - 1));
                    int i10 = (int) length;
                    double d13 = dArr[i10];
                    d12 = ((dArr[i10 + 1] - d13) * (length - ((double) i10))) + d13;
                }
            }
            double d14 = d12 * 1.5707963267948966d;
            this.f17o = Math.sin(d14);
            this.f18p = Math.cos(d14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [a0.a, java.lang.Object] */
    public a(int[] iArr, double[] dArr, double[][] dArr2) {
        boolean z10;
        int i10;
        double[] dArr3;
        double d10;
        double[] dArr4 = dArr;
        ?? obj = new Object();
        obj.f0a = dArr4;
        int i11 = 1;
        obj.f1b = new C0000a[dArr4.length - 1];
        char c10 = 0;
        int i12 = 0;
        int i13 = 1;
        int i14 = 1;
        a aVar = obj;
        while (true) {
            C0000a[] c0000aArr = aVar.f1b;
            if (i12 >= c0000aArr.length) {
                return;
            }
            int i15 = iArr[i12];
            if (i15 == 0) {
                i14 = 3;
            } else if (i15 == i11) {
                i13 = i11;
                i14 = i13;
            } else {
                if (i15 != 2) {
                    if (i15 == 3) {
                        if (i13 != i11) {
                            i13 = i11;
                        }
                        i14 = i13;
                    } else if (i15 == 4) {
                        i14 = 4;
                    } else if (i15 == 5) {
                        i14 = 5;
                    }
                }
                i13 = 2;
                i14 = i13;
            }
            double d11 = dArr4[i12];
            int i16 = i12 + 1;
            double d12 = dArr4[i16];
            double[] dArr5 = dArr2[i12];
            double d13 = dArr5[c10];
            int i17 = i11;
            int i18 = i12;
            double d14 = dArr5[i17];
            double[] dArr6 = dArr2[i16];
            boolean z11 = c10;
            double d15 = dArr6[z11 ? 1 : 0];
            double d16 = dArr6[i17];
            C0000a c0000a = new C0000a();
            c0000a.f20r = z11;
            int i19 = i13;
            double d17 = d15 - d13;
            double d18 = d16 - d14;
            boolean z12 = i17;
            if (i14 != z12) {
                if (i14 == 4) {
                    c0000a.f19q = d18 > 0.0d;
                } else if (i14 != 5) {
                    c0000a.f19q = false;
                } else {
                    c0000a.f19q = d18 < 0.0d;
                }
                z10 = true;
            } else {
                c0000a.f19q = z12;
                z10 = z12;
            }
            c0000a.f5c = r16;
            c0000a.f6d = d12;
            double d19 = d12 - d11;
            double d20 = 1.0d / d19;
            c0000a.f11i = d20;
            if (3 == i14) {
                c0000a.f20r = z10;
            }
            if (c0000a.f20r || Math.abs(d17) < 0.001d || Math.abs(d18) < 0.001d) {
                i10 = 1;
                c0000a.f20r = true;
                c0000a.f7e = d13;
                c0000a.f8f = d15;
                c0000a.f9g = d14;
                c0000a.f10h = d16;
                double dHypot = Math.hypot(d18, d17);
                c0000a.f4b = dHypot;
                c0000a.f16n = dHypot * d20;
                c0000a.f14l = d17 / d19;
                c0000a.f15m = d18 / d19;
            } else {
                double[] dArr7 = new double[101];
                c0000a.f3a = dArr7;
                boolean z13 = c0000a.f19q;
                c0000a.f12j = ((double) (z13 ? -1 : 1)) * d17;
                c0000a.f13k = ((double) (z13 ? 1 : -1)) * d18;
                c0000a.f14l = z13 ? d15 : d13;
                c0000a.f15m = z13 ? d14 : d16;
                double d21 = d14 - d16;
                double dHypot2 = 0.0d;
                double d22 = 0.0d;
                double d23 = 0.0d;
                int i20 = 0;
                while (true) {
                    dArr3 = C0000a.f2s;
                    if (i20 >= 91) {
                        break;
                    }
                    double[] dArr8 = dArr7;
                    double d24 = d21;
                    double radians = Math.toRadians((((double) i20) * 90.0d) / ((double) 90));
                    double dSin = d17 * Math.sin(radians);
                    double dCos = Math.cos(radians) * d24;
                    if (i20 > 0) {
                        d10 = dCos;
                        dHypot2 += Math.hypot(dSin - d22, d10 - d23);
                        dArr3[i20] = dHypot2;
                    } else {
                        d10 = dCos;
                    }
                    i20++;
                    d22 = dSin;
                    d21 = d24;
                    d23 = d10;
                    dArr7 = dArr8;
                }
                double[] dArr9 = dArr7;
                c0000a.f4b = dHypot2;
                for (int i21 = 0; i21 < 91; i21++) {
                    dArr3[i21] = dArr3[i21] / dHypot2;
                }
                for (int i22 = 0; i22 < 101; i22++) {
                    double d25 = ((double) i22) / ((double) 100);
                    int iBinarySearch = Arrays.binarySearch(dArr3, d25);
                    if (iBinarySearch >= 0) {
                        dArr9[i22] = ((double) iBinarySearch) / ((double) 90);
                    } else if (iBinarySearch == -1) {
                        dArr9[i22] = 0.0d;
                    } else {
                        int i23 = -iBinarySearch;
                        int i24 = i23 - 2;
                        double d26 = dArr3[i24];
                        dArr9[i22] = (((d25 - d26) / (dArr3[i23 - 1] - d26)) + ((double) i24)) / ((double) 90);
                    }
                }
                c0000a.f16n = c0000a.f4b * c0000a.f11i;
                i10 = 1;
            }
            c0000aArr[i18] = c0000a;
            aVar = this;
            dArr4 = dArr;
            i11 = i10;
            i12 = i16;
            i13 = i19;
            c10 = 0;
        }
    }

    @Override // a0.b
    public final double b(double d10) {
        C0000a[] c0000aArr = this.f1b;
        C0000a c0000a = c0000aArr[0];
        double d11 = c0000a.f5c;
        if (d10 < d11) {
            double d12 = d10 - d11;
            if (c0000a.f20r) {
                return (d12 * c0000aArr[0].f14l) + c0000a.c(d11);
            }
            c0000a.g(d11);
            return (c0000aArr[0].a() * d12) + c0000aArr[0].e();
        }
        if (d10 > c0000aArr[c0000aArr.length - 1].f6d) {
            double d13 = c0000aArr[c0000aArr.length - 1].f6d;
            double d14 = d10 - d13;
            int length = c0000aArr.length - 1;
            return (d14 * c0000aArr[length].f14l) + c0000aArr[length].c(d13);
        }
        for (int i10 = 0; i10 < c0000aArr.length; i10++) {
            C0000a c0000a2 = c0000aArr[i10];
            if (d10 <= c0000a2.f6d) {
                if (c0000a2.f20r) {
                    return c0000a2.c(d10);
                }
                c0000a2.g(d10);
                return c0000aArr[i10].e();
            }
        }
        return Double.NaN;
    }

    @Override // a0.b
    public final void c(double d10, double[] dArr) {
        C0000a[] c0000aArr = this.f1b;
        C0000a c0000a = c0000aArr[0];
        double d11 = c0000a.f5c;
        if (d10 < d11) {
            double d12 = d10 - d11;
            if (c0000a.f20r) {
                double dC = c0000a.c(d11);
                C0000a c0000a2 = c0000aArr[0];
                dArr[0] = (c0000a2.f14l * d12) + dC;
                dArr[1] = (d12 * c0000aArr[0].f15m) + c0000a2.d(d11);
                return;
            }
            c0000a.g(d11);
            dArr[0] = (c0000aArr[0].a() * d12) + c0000aArr[0].e();
            dArr[1] = (c0000aArr[0].b() * d12) + c0000aArr[0].f();
            return;
        }
        if (d10 <= c0000aArr[c0000aArr.length - 1].f6d) {
            for (int i10 = 0; i10 < c0000aArr.length; i10++) {
                C0000a c0000a3 = c0000aArr[i10];
                if (d10 <= c0000a3.f6d) {
                    if (c0000a3.f20r) {
                        dArr[0] = c0000a3.c(d10);
                        dArr[1] = c0000aArr[i10].d(d10);
                        return;
                    } else {
                        c0000a3.g(d10);
                        dArr[0] = c0000aArr[i10].e();
                        dArr[1] = c0000aArr[i10].f();
                        return;
                    }
                }
            }
            return;
        }
        double d13 = c0000aArr[c0000aArr.length - 1].f6d;
        double d14 = d10 - d13;
        int length = c0000aArr.length - 1;
        C0000a c0000a4 = c0000aArr[length];
        if (c0000a4.f20r) {
            double dC2 = c0000a4.c(d13);
            C0000a c0000a5 = c0000aArr[length];
            dArr[0] = (c0000a5.f14l * d14) + dC2;
            dArr[1] = (d14 * c0000aArr[length].f15m) + c0000a5.d(d13);
            return;
        }
        c0000a4.g(d10);
        dArr[0] = (c0000aArr[length].a() * d14) + c0000aArr[length].e();
        dArr[1] = (c0000aArr[length].b() * d14) + c0000aArr[length].f();
    }

    @Override // a0.b
    public final void d(double d10, float[] fArr) {
        C0000a[] c0000aArr = this.f1b;
        C0000a c0000a = c0000aArr[0];
        double d11 = c0000a.f5c;
        if (d10 < d11) {
            double d12 = d10 - d11;
            if (c0000a.f20r) {
                double dC = c0000a.c(d11);
                C0000a c0000a2 = c0000aArr[0];
                fArr[0] = (float) ((c0000a2.f14l * d12) + dC);
                fArr[1] = (float) ((d12 * c0000aArr[0].f15m) + c0000a2.d(d11));
                return;
            }
            c0000a.g(d11);
            fArr[0] = (float) ((c0000aArr[0].a() * d12) + c0000aArr[0].e());
            fArr[1] = (float) ((c0000aArr[0].b() * d12) + c0000aArr[0].f());
            return;
        }
        if (d10 <= c0000aArr[c0000aArr.length - 1].f6d) {
            for (int i10 = 0; i10 < c0000aArr.length; i10++) {
                C0000a c0000a3 = c0000aArr[i10];
                if (d10 <= c0000a3.f6d) {
                    if (c0000a3.f20r) {
                        fArr[0] = (float) c0000a3.c(d10);
                        fArr[1] = (float) c0000aArr[i10].d(d10);
                        return;
                    } else {
                        c0000a3.g(d10);
                        fArr[0] = (float) c0000aArr[i10].e();
                        fArr[1] = (float) c0000aArr[i10].f();
                        return;
                    }
                }
            }
            return;
        }
        double d13 = c0000aArr[c0000aArr.length - 1].f6d;
        double d14 = d10 - d13;
        int length = c0000aArr.length - 1;
        C0000a c0000a4 = c0000aArr[length];
        if (!c0000a4.f20r) {
            c0000a4.g(d10);
            fArr[0] = (float) c0000aArr[length].e();
            fArr[1] = (float) c0000aArr[length].f();
        } else {
            double dC2 = c0000a4.c(d13);
            C0000a c0000a5 = c0000aArr[length];
            fArr[0] = (float) ((c0000a5.f14l * d14) + dC2);
            fArr[1] = (float) ((d14 * c0000aArr[length].f15m) + c0000a5.d(d13));
        }
    }

    @Override // a0.b
    public final double e(double d10) {
        C0000a[] c0000aArr = this.f1b;
        double d11 = c0000aArr[0].f5c;
        if (d10 < d11) {
            d10 = d11;
        }
        if (d10 > c0000aArr[c0000aArr.length - 1].f6d) {
            d10 = c0000aArr[c0000aArr.length - 1].f6d;
        }
        for (int i10 = 0; i10 < c0000aArr.length; i10++) {
            C0000a c0000a = c0000aArr[i10];
            if (d10 <= c0000a.f6d) {
                if (c0000a.f20r) {
                    return c0000a.f14l;
                }
                c0000a.g(d10);
                return c0000aArr[i10].a();
            }
        }
        return Double.NaN;
    }

    @Override // a0.b
    public final void f(double d10, double[] dArr) {
        C0000a[] c0000aArr = this.f1b;
        double d11 = c0000aArr[0].f5c;
        if (d10 < d11) {
            d10 = d11;
        } else if (d10 > c0000aArr[c0000aArr.length - 1].f6d) {
            d10 = c0000aArr[c0000aArr.length - 1].f6d;
        }
        for (int i10 = 0; i10 < c0000aArr.length; i10++) {
            C0000a c0000a = c0000aArr[i10];
            if (d10 <= c0000a.f6d) {
                if (c0000a.f20r) {
                    dArr[0] = c0000a.f14l;
                    dArr[1] = c0000a.f15m;
                    return;
                } else {
                    c0000a.g(d10);
                    dArr[0] = c0000aArr[i10].a();
                    dArr[1] = c0000aArr[i10].b();
                    return;
                }
            }
        }
    }

    @Override // a0.b
    public final double[] g() {
        return this.f0a;
    }
}
