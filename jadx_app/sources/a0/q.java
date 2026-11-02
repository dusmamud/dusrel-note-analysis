package a0;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f109f;

    public final void a(float f10, float f11, int i10, int i11, float[] fArr) {
        float f12 = fArr[0];
        float f13 = fArr[1];
        float f14 = (f10 - 0.5f) * 2.0f;
        float f15 = (f11 - 0.5f) * 2.0f;
        float f16 = f12 + this.f106c;
        float f17 = f13 + this.f107d;
        float f18 = (this.f104a * f14) + f16;
        float f19 = (this.f105b * f15) + f17;
        float radians = (float) Math.toRadians(this.f109f);
        float radians2 = (float) Math.toRadians(this.f108e);
        double d10 = radians;
        double d11 = i11 * f15;
        float fSin = (((float) ((Math.sin(d10) * ((double) ((-i10) * f14))) - (Math.cos(d10) * d11))) * radians2) + f18;
        float fCos = (radians2 * ((float) ((Math.cos(d10) * ((double) (i10 * f14))) - (Math.sin(d10) * d11)))) + f19;
        fArr[0] = fSin;
        fArr[1] = fCos;
    }
}
