package a0;

/* JADX INFO: loaded from: classes.dex */
public final class o implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f80a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f81b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f82c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f83d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f84e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f85f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f86g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f87h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f88i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f89j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f90k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f91l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f92m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f93n;

    @Override // a0.n
    public final boolean a() {
        return b() < 1.0E-5f && Math.abs(this.f88i - this.f92m) < 1.0E-5f;
    }

    @Override // a0.n
    public final float b() {
        return this.f90k ? -c(this.f93n) : c(this.f93n);
    }

    public final float c(float f10) {
        float f11;
        float f12;
        float f13 = this.f83d;
        if (f10 <= f13) {
            f11 = this.f80a;
            f12 = this.f81b;
        } else {
            int i10 = this.f89j;
            if (i10 == 1) {
                return 0.0f;
            }
            f10 -= f13;
            f13 = this.f84e;
            if (f10 >= f13) {
                if (i10 == 2) {
                    return 0.0f;
                }
                float f14 = f10 - f13;
                float f15 = this.f85f;
                if (f14 >= f15) {
                    return 0.0f;
                }
                float f16 = this.f82c;
                return f16 - ((f14 * f16) / f15);
            }
            f11 = this.f81b;
            f12 = this.f82c;
        }
        return (((f12 - f11) * f10) / f13) + f11;
    }

    public final void d(float f10, float f11, float f12, float f13, float f14) {
        this.f88i = f11;
        if (f10 == 0.0f) {
            f10 = 1.0E-4f;
        }
        float f15 = f10 / f12;
        float f16 = (f15 * f10) / 2.0f;
        if (f10 < 0.0f) {
            float fSqrt = (float) Math.sqrt((f11 - ((((-f10) / f12) * f10) / 2.0f)) * f12);
            if (fSqrt < f13) {
                this.f89j = 2;
                this.f80a = f10;
                this.f81b = fSqrt;
                this.f82c = 0.0f;
                float f17 = (fSqrt - f10) / f12;
                this.f83d = f17;
                this.f84e = fSqrt / f12;
                this.f86g = ((f10 + fSqrt) * f17) / 2.0f;
                this.f87h = f11;
                this.f88i = f11;
                return;
            }
            this.f89j = 3;
            this.f80a = f10;
            this.f81b = f13;
            this.f82c = f13;
            float f18 = (f13 - f10) / f12;
            this.f83d = f18;
            float f19 = f13 / f12;
            this.f85f = f19;
            float f20 = ((f10 + f13) * f18) / 2.0f;
            float f21 = (f19 * f13) / 2.0f;
            this.f84e = ((f11 - f20) - f21) / f13;
            this.f86g = f20;
            this.f87h = f11 - f21;
            this.f88i = f11;
            return;
        }
        if (f16 >= f11) {
            this.f89j = 1;
            this.f80a = f10;
            this.f81b = 0.0f;
            this.f86g = f11;
            this.f83d = (2.0f * f11) / f10;
            return;
        }
        float f22 = f11 - f16;
        float f23 = f22 / f10;
        if (f23 + f15 < f14) {
            this.f89j = 2;
            this.f80a = f10;
            this.f81b = f10;
            this.f82c = 0.0f;
            this.f86g = f22;
            this.f87h = f11;
            this.f83d = f23;
            this.f84e = f15;
            return;
        }
        float fSqrt2 = (float) Math.sqrt(((f10 * f10) / 2.0f) + (f12 * f11));
        float f24 = (fSqrt2 - f10) / f12;
        this.f83d = f24;
        float f25 = fSqrt2 / f12;
        this.f84e = f25;
        if (fSqrt2 < f13) {
            this.f89j = 2;
            this.f80a = f10;
            this.f81b = fSqrt2;
            this.f82c = 0.0f;
            this.f83d = f24;
            this.f84e = f25;
            this.f86g = ((f10 + fSqrt2) * f24) / 2.0f;
            this.f87h = f11;
            return;
        }
        this.f89j = 3;
        this.f80a = f10;
        this.f81b = f13;
        this.f82c = f13;
        float f26 = (f13 - f10) / f12;
        this.f83d = f26;
        float f27 = f13 / f12;
        this.f85f = f27;
        float f28 = ((f10 + f13) * f26) / 2.0f;
        float f29 = (f27 * f13) / 2.0f;
        this.f84e = ((f11 - f28) - f29) / f13;
        this.f86g = f28;
        this.f87h = f11 - f29;
        this.f88i = f11;
    }

    @Override // a0.n
    public final float getInterpolation(float f10) {
        float f11;
        float f12 = this.f83d;
        if (f10 <= f12) {
            float f13 = this.f80a;
            f11 = ((((this.f81b - f13) * f10) * f10) / (f12 * 2.0f)) + (f13 * f10);
        } else {
            int i10 = this.f89j;
            if (i10 == 1) {
                f11 = this.f86g;
            } else {
                float f14 = f10 - f12;
                float f15 = this.f84e;
                if (f14 < f15) {
                    float f16 = this.f86g;
                    float f17 = this.f81b;
                    f11 = ((((this.f82c - f17) * f14) * f14) / (f15 * 2.0f)) + (f17 * f14) + f16;
                } else if (i10 == 2) {
                    f11 = this.f87h;
                } else {
                    float f18 = f14 - f15;
                    float f19 = this.f85f;
                    if (f18 <= f19) {
                        float f20 = this.f87h;
                        float f21 = this.f82c * f18;
                        f11 = (f20 + f21) - ((f21 * f18) / (f19 * 2.0f));
                    } else {
                        f11 = this.f88i;
                    }
                }
            }
        }
        this.f92m = f11;
        this.f93n = f10;
        return this.f90k ? this.f91l - f11 : this.f91l + f11;
    }
}
