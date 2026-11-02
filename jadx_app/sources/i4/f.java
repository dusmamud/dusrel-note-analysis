package i4;

import android.text.Layout;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f28278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f28280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f28281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f28282e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f28288k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f28289l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Layout.Alignment f28292o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Layout.Alignment f28293p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b f28295r;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f28283f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f28284g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f28285h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f28286i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f28287j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f28290m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f28291n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f28294q = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f28296s = Float.MAX_VALUE;

    @CanIgnoreReturnValue
    public final void a(f fVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (fVar != null) {
            if (!this.f28280c && fVar.f28280c) {
                this.f28279b = fVar.f28279b;
                this.f28280c = true;
            }
            if (this.f28285h == -1) {
                this.f28285h = fVar.f28285h;
            }
            if (this.f28286i == -1) {
                this.f28286i = fVar.f28286i;
            }
            if (this.f28278a == null && (str = fVar.f28278a) != null) {
                this.f28278a = str;
            }
            if (this.f28283f == -1) {
                this.f28283f = fVar.f28283f;
            }
            if (this.f28284g == -1) {
                this.f28284g = fVar.f28284g;
            }
            if (this.f28291n == -1) {
                this.f28291n = fVar.f28291n;
            }
            if (this.f28292o == null && (alignment2 = fVar.f28292o) != null) {
                this.f28292o = alignment2;
            }
            if (this.f28293p == null && (alignment = fVar.f28293p) != null) {
                this.f28293p = alignment;
            }
            if (this.f28294q == -1) {
                this.f28294q = fVar.f28294q;
            }
            if (this.f28287j == -1) {
                this.f28287j = fVar.f28287j;
                this.f28288k = fVar.f28288k;
            }
            if (this.f28295r == null) {
                this.f28295r = fVar.f28295r;
            }
            if (this.f28296s == Float.MAX_VALUE) {
                this.f28296s = fVar.f28296s;
            }
            if (!this.f28282e && fVar.f28282e) {
                this.f28281d = fVar.f28281d;
                this.f28282e = true;
            }
            if (this.f28290m != -1 || (i10 = fVar.f28290m) == -1) {
                return;
            }
            this.f28290m = i10;
        }
    }
}
