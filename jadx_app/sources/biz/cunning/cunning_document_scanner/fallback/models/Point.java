package biz.cunning.cunning_document_scanner.fallback.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0018"}, d2 = {"Lbiz/cunning/cunning_document_scanner/fallback/models/Point;", "", "x", "", "y", "<init>", "(DD)V", "getX", "()D", "setX", "(D)V", "getY", "setY", "set", "", "vals", "", "hashCode", "", "equals", "", "other", "toString", "", "cunning_document_scanner_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Point {
    private double x;
    private double y;

    public Point() {
        this(0.0d, 0.0d, 3, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Point)) {
            return false;
        }
        Point point = (Point) other;
        return this.x == point.x && this.y == point.y;
    }

    public final double getX() {
        return this.x;
    }

    public final double getY() {
        return this.y;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.x);
        int i10 = ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.y);
        return (i10 * 31) + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2));
    }

    public final void set(double[] vals) {
        if (vals != null) {
            this.x = vals.length > 0 ? vals[0] : 0.0d;
            this.y = vals.length > 1 ? vals[1] : 0.0d;
        } else {
            this.x = 0.0d;
            this.y = 0.0d;
        }
    }

    public final void setX(double d10) {
        this.x = d10;
    }

    public final void setY(double d10) {
        this.y = d10;
    }

    public String toString() {
        return "{" + this.x + ", " + this.y + "}";
    }

    public Point(double d10) {
        this(d10, 0.0d, 2, null);
    }

    public Point(double d10, double d11) {
        this.x = d10;
        this.y = d11;
    }

    public /* synthetic */ Point(double d10, double d11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0.0d : d10, (i10 & 2) != 0 ? 0.0d : d11);
    }
}
