package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class nn3 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final nn3 f13382j = new nn3(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final nn3 f13383k = new nn3(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final nn3 f13384l = new nn3(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final nn3 f13385m = new nn3(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f13386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f13387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f13388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f13389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f13390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f13391f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f13392g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final double f13393h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final double f13394i;

    public nn3(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        this.f13386a = d14;
        this.f13387b = d15;
        this.f13388c = d16;
        this.f13389d = d10;
        this.f13390e = d11;
        this.f13391f = d12;
        this.f13392g = d13;
        this.f13393h = d17;
        this.f13394i = d18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nn3.class != obj.getClass()) {
            return false;
        }
        nn3 nn3Var = (nn3) obj;
        return Double.compare(nn3Var.f13389d, this.f13389d) == 0 && Double.compare(nn3Var.f13390e, this.f13390e) == 0 && Double.compare(nn3Var.f13391f, this.f13391f) == 0 && Double.compare(nn3Var.f13392g, this.f13392g) == 0 && Double.compare(nn3Var.f13393h, this.f13393h) == 0 && Double.compare(nn3Var.f13394i, this.f13394i) == 0 && Double.compare(nn3Var.f13386a, this.f13386a) == 0 && Double.compare(nn3Var.f13387b, this.f13387b) == 0 && Double.compare(nn3Var.f13388c, this.f13388c) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f13386a);
        long j10 = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f13387b);
        long j11 = jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32);
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.f13388c);
        long j12 = jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32);
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.f13389d);
        long j13 = jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32);
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.f13390e);
        long j14 = jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32);
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.f13391f);
        long j15 = jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32);
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.f13392g);
        long jDoubleToLongBits8 = Double.doubleToLongBits(this.f13393h);
        long j16 = jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32);
        long jDoubleToLongBits9 = Double.doubleToLongBits(this.f13394i);
        return (((((((((((((((((int) j10) * 31) + ((int) j11)) * 31) + ((int) j12)) * 31) + ((int) j13)) * 31) + ((int) j14)) * 31) + ((int) j15)) * 31) + ((int) (jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32)))) * 31) + ((int) j16)) * 31) + ((int) (jDoubleToLongBits9 ^ (jDoubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f13382j)) {
            return "Rotate 0°";
        }
        if (equals(f13383k)) {
            return "Rotate 90°";
        }
        if (equals(f13384l)) {
            return "Rotate 180°";
        }
        if (equals(f13385m)) {
            return "Rotate 270°";
        }
        StringBuilder sb2 = new StringBuilder(260);
        sb2.append("Matrix{u=");
        sb2.append(this.f13386a);
        sb2.append(", v=");
        sb2.append(this.f13387b);
        sb2.append(", w=");
        sb2.append(this.f13388c);
        sb2.append(", a=");
        sb2.append(this.f13389d);
        sb2.append(", b=");
        sb2.append(this.f13390e);
        sb2.append(", c=");
        sb2.append(this.f13391f);
        sb2.append(", d=");
        sb2.append(this.f13392g);
        sb2.append(", tx=");
        sb2.append(this.f13393h);
        sb2.append(", ty=");
        sb2.append(this.f13394i);
        sb2.append("}");
        return sb2.toString();
    }
}
