package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ge2 implements fb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f9703b;

    public ge2(float f10, float f11) {
        boolean z10 = false;
        if (f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f) {
            z10 = true;
        }
        up2.b("Invalid latitude or longitude", z10);
        this.f9702a = f10;
        this.f9703b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ge2.class == obj.getClass()) {
            ge2 ge2Var = (ge2) obj;
            if (this.f9702a == ge2Var.f9702a && this.f9703b == ge2Var.f9703b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9703b) + ((Float.hashCode(this.f9702a) + 527) * 31);
    }

    public final String toString() {
        float f10 = this.f9702a;
        int length = String.valueOf(f10).length();
        float f11 = this.f9703b;
        StringBuilder sb2 = new StringBuilder(length + 26 + String.valueOf(f11).length());
        sb2.append("xyz: latitude=");
        sb2.append(f10);
        sb2.append(", longitude=");
        sb2.append(f11);
        return sb2.toString();
    }
}
