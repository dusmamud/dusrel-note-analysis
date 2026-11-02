package a0;

/* JADX INFO: loaded from: classes.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f70a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f71b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f72c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f73d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f74e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f75f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f76g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f77h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f78i;

    @Override // a0.n
    public final boolean a() {
        double d10 = ((double) this.f74e) - this.f72c;
        double d11 = this.f71b;
        double d12 = this.f75f;
        return Math.sqrt((((d11 * d10) * d10) + ((d12 * d12) * ((double) this.f76g))) / d11) <= ((double) this.f77h);
    }

    @Override // a0.n
    public final float b() {
        return 0.0f;
    }

    @Override // a0.n
    public final float getInterpolation(float f10) {
        double d10 = f10 - this.f73d;
        if (d10 > 0.0d) {
            double d11 = this.f71b;
            double d12 = this.f70a;
            int iSqrt = (int) ((9.0d / ((Math.sqrt(d11 / ((double) this.f76g)) * d10) * 4.0d)) + 1.0d);
            double d13 = d10 / ((double) iSqrt);
            int i10 = 0;
            while (i10 < iSqrt) {
                float f11 = this.f74e;
                double d14 = f11;
                double d15 = this.f72c;
                double d16 = d13;
                float f12 = this.f75f;
                double d17 = f12;
                double d18 = ((-d11) * (d14 - d15)) - (d12 * d17);
                double d19 = this.f76g;
                double d20 = (((d18 / d19) * d16) / 2.0d) + d17;
                double d21 = ((((-((((d16 * d20) / 2.0d) + d14) - d15)) * d11) - (d20 * d12)) / d19) * d16;
                float f13 = f12 + ((float) d21);
                this.f75f = f13;
                float f14 = f11 + ((float) (((d21 / 2.0d) + d17) * d16));
                this.f74e = f14;
                int i11 = this.f78i;
                if (i11 > 0) {
                    if (f14 < 0.0f && (i11 & 1) == 1) {
                        this.f74e = -f14;
                        this.f75f = -f13;
                    }
                    float f15 = this.f74e;
                    if (f15 > 1.0f && (i11 & 2) == 2) {
                        this.f74e = 2.0f - f15;
                        this.f75f = -this.f75f;
                    }
                }
                i10++;
                d13 = d16;
            }
        }
        this.f73d = f10;
        if (a()) {
            this.f74e = (float) this.f72c;
        }
        return this.f74e;
    }
}
