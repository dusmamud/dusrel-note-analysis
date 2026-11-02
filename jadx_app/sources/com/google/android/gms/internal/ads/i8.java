package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class i8 implements fb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10627b;

    public i8(float f10, int i10) {
        this.f10626a = f10;
        this.f10627b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i8.class == obj.getClass()) {
            i8 i8Var = (i8) obj;
            if (this.f10626a == i8Var.f10626a && this.f10627b == i8Var.f10627b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.hashCode(this.f10626a) + 527) * 31) + this.f10627b;
    }

    public final String toString() {
        float f10 = this.f10626a;
        int length = String.valueOf(f10).length();
        int i10 = this.f10627b;
        StringBuilder sb2 = new StringBuilder(length + 47 + String.valueOf(i10).length());
        sb2.append("smta: captureFrameRate=");
        sb2.append(f10);
        sb2.append(", svcTemporalLayerCount=");
        sb2.append(i10);
        return sb2.toString();
    }
}
