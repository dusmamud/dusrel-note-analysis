package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class bx0 {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f7484q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f7485r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f7486s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f7487t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f7488u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f7489v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f7490w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f7491x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f7492y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f7493z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f7494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f7495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f7496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bitmap f7497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f7498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7499f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f7500g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f7501h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f7502i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f7503j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f7504k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f7505l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f7506m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f7507n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f7508o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f7509p;

    static {
        iw0 iw0Var = new iw0();
        iw0Var.a("");
        iw0Var.b();
        String str = b32.f7042a;
        f7484q = Integer.toString(0, 36);
        f7485r = Integer.toString(17, 36);
        f7486s = Integer.toString(1, 36);
        f7487t = Integer.toString(2, 36);
        Integer.toString(3, 36);
        f7488u = Integer.toString(18, 36);
        f7489v = Integer.toString(4, 36);
        f7490w = Integer.toString(5, 36);
        f7491x = Integer.toString(6, 36);
        f7492y = Integer.toString(7, 36);
        f7493z = Integer.toString(8, 36);
        A = Integer.toString(9, 36);
        B = Integer.toString(10, 36);
        C = Integer.toString(11, 36);
        D = Integer.toString(12, 36);
        E = Integer.toString(13, 36);
        F = Integer.toString(14, 36);
        G = Integer.toString(15, 36);
        H = Integer.toString(16, 36);
        I = Integer.toString(19, 36);
    }

    public /* synthetic */ bx0(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, int i14, float f15, int i15) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            up2.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f7494a = SpannedString.valueOf(charSequence);
        } else {
            this.f7494a = charSequence != null ? charSequence.toString() : null;
        }
        this.f7495b = alignment;
        this.f7496c = alignment2;
        this.f7497d = bitmap;
        this.f7498e = f10;
        this.f7499f = i10;
        this.f7500g = i11;
        this.f7501h = f11;
        this.f7502i = i12;
        this.f7503j = f13;
        this.f7504k = f14;
        this.f7505l = i13;
        this.f7506m = f12;
        this.f7507n = i14;
        this.f7508o = f15;
        this.f7509p = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bx0.class != obj.getClass()) {
            return false;
        }
        bx0 bx0Var = (bx0) obj;
        Bitmap bitmap = bx0Var.f7497d;
        if (!TextUtils.equals(this.f7494a, bx0Var.f7494a) || this.f7495b != bx0Var.f7495b || this.f7496c != bx0Var.f7496c) {
            return false;
        }
        Bitmap bitmap2 = this.f7497d;
        if (bitmap2 == null) {
            if (bitmap != null) {
                return false;
            }
        } else if (bitmap == null || !bitmap2.sameAs(bitmap)) {
            return false;
        }
        return this.f7498e == bx0Var.f7498e && this.f7499f == bx0Var.f7499f && this.f7500g == bx0Var.f7500g && this.f7501h == bx0Var.f7501h && this.f7502i == bx0Var.f7502i && this.f7503j == bx0Var.f7503j && this.f7504k == bx0Var.f7504k && this.f7505l == bx0Var.f7505l && this.f7506m == bx0Var.f7506m && this.f7507n == bx0Var.f7507n && this.f7508o == bx0Var.f7508o && this.f7509p == bx0Var.f7509p;
    }

    public final int hashCode() {
        return Objects.hash(this.f7494a, this.f7495b, this.f7496c, this.f7497d, Float.valueOf(this.f7498e), Integer.valueOf(this.f7499f), Integer.valueOf(this.f7500g), Float.valueOf(this.f7501h), Integer.valueOf(this.f7502i), Float.valueOf(this.f7503j), Float.valueOf(this.f7504k), Boolean.FALSE, -16777216, Integer.valueOf(this.f7505l), Float.valueOf(this.f7506m), Integer.valueOf(this.f7507n), Float.valueOf(this.f7508o), Integer.valueOf(this.f7509p));
    }
}
