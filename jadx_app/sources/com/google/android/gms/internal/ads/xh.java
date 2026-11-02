package com.google.android.gms.internal.ads;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class xh {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final xh f19073d = new xh(1.0f, 1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f19074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f19075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19076c;

    static {
        String str = b32.f7042a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public xh(float f10, float f11) {
        up2.a(f10 > 0.0f);
        up2.a(f11 > 0.0f);
        this.f19074a = f10;
        this.f19075b = f11;
        this.f19076c = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xh.class == obj.getClass()) {
            xh xhVar = (xh) obj;
            if (this.f19074a == xhVar.f19074a && this.f19075b == xhVar.f19075b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f19075b) + ((Float.floatToRawIntBits(this.f19074a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f19074a), Float.valueOf(this.f19075b)};
        String str = b32.f7042a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
