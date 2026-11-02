package a0;

/* JADX INFO: loaded from: classes.dex */
public final class j extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f63d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f64e;

    @Override // a0.c
    public final double a(double d10) {
        double d11 = this.f63d;
        double d12 = this.f64e;
        if (d10 < d12) {
            return (d12 * d10) / (((d12 - d10) * d11) + d10);
        }
        return ((d10 - 1.0d) * (1.0d - d12)) / ((1.0d - d10) - ((d12 - d10) * d11));
    }

    @Override // a0.c
    public final double b(double d10) {
        double d11 = this.f63d;
        double d12 = this.f64e;
        if (d10 < d12) {
            double d13 = d11 * d12 * d12;
            double d14 = ((d12 - d10) * d11) + d10;
            return d13 / (d14 * d14);
        }
        double d15 = d12 - 1.0d;
        double d16 = (((d12 - d10) * (-d11)) - d10) + 1.0d;
        return ((d15 * d11) * d15) / (d16 * d16);
    }
}
