package i2;

/* JADX INFO: loaded from: classes.dex */
public final class d2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d2 f27892c = new d2(0, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f27894b;

    public d2(int i10, boolean z10) {
        this.f27893a = i10;
        this.f27894b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d2.class == obj.getClass()) {
            d2 d2Var = (d2) obj;
            if (this.f27893a == d2Var.f27893a && this.f27894b == d2Var.f27894b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f27893a << 1) + (this.f27894b ? 1 : 0);
    }
}
