package b2;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y f4072d = new y(1.0f, 1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f4073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f4074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4075c;

    static {
        e2.d0.D(0);
        e2.d0.D(1);
    }

    public y(float f10, float f11) {
        cd.k.a(f10 > 0.0f);
        cd.k.a(f11 > 0.0f);
        this.f4073a = f10;
        this.f4074b = f11;
        this.f4075c = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y.class == obj.getClass()) {
            y yVar = (y) obj;
            if (this.f4073a == yVar.f4073a && this.f4074b == yVar.f4074b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f4074b) + ((Float.floatToRawIntBits(this.f4073a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f4073a), Float.valueOf(this.f4074b)};
        int i10 = e2.d0.f25618a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
