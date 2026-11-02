package w0;

import android.graphics.Point;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Point f35623c;

    public w(int i10, int i11, Point point) {
        int i12 = point.x;
        int i13 = point.y;
        this.f35621a = i10;
        this.f35622b = i11;
        this.f35623c = new Point(i12, i13);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (this.f35621a == wVar.f35621a && this.f35622b == wVar.f35622b && this.f35623c.equals(wVar.f35623c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f35623c.hashCode() + (((this.f35621a * 31) + this.f35622b) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("RoundedCornerCompat{position=");
        int i10 = this.f35621a;
        if (i10 == 0) {
            str = "TopLeft";
        } else if (i10 == 1) {
            str = "TopRight";
        } else if (i10 != 2) {
            str = i10 != 3 ? "Invalid" : "BottomLeft";
        } else {
            str = "BottomRight";
        }
        sb2.append(str);
        sb2.append(", radius=");
        sb2.append(this.f35622b);
        sb2.append(", center=");
        sb2.append(this.f35623c);
        sb2.append('}');
        return sb2.toString();
    }
}
