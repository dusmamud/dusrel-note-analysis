package com.google.android.gms.internal.ads;

import android.text.Layout;

/* JADX INFO: loaded from: classes.dex */
public final class jc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11261e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f11267k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f11268l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Layout.Alignment f11271o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Layout.Alignment f11272p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public bc f11274r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f11276t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f11277u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f11278v;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11262f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11263g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11264h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f11265i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f11266j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11269m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f11270n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f11273q = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f11275s = Float.MAX_VALUE;

    public final String a() {
        return this.f11276t;
    }

    public final String b() {
        return this.f11277u;
    }

    public final String c() {
        return this.f11278v;
    }

    public final void d(jc jcVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (jcVar != null) {
            if (!this.f11259c && jcVar.f11259c) {
                this.f11258b = jcVar.f11258b;
                this.f11259c = true;
            }
            if (this.f11264h == -1) {
                this.f11264h = jcVar.f11264h;
            }
            if (this.f11265i == -1) {
                this.f11265i = jcVar.f11265i;
            }
            if (this.f11257a == null && (str = jcVar.f11257a) != null) {
                this.f11257a = str;
            }
            if (this.f11262f == -1) {
                this.f11262f = jcVar.f11262f;
            }
            if (this.f11263g == -1) {
                this.f11263g = jcVar.f11263g;
            }
            if (this.f11270n == -1) {
                this.f11270n = jcVar.f11270n;
            }
            if (this.f11271o == null && (alignment2 = jcVar.f11271o) != null) {
                this.f11271o = alignment2;
            }
            if (this.f11272p == null && (alignment = jcVar.f11272p) != null) {
                this.f11272p = alignment;
            }
            if (this.f11273q == -1) {
                this.f11273q = jcVar.f11273q;
            }
            if (this.f11266j == -1) {
                this.f11266j = jcVar.f11266j;
                this.f11267k = jcVar.f11267k;
            }
            if (this.f11274r == null) {
                this.f11274r = jcVar.f11274r;
            }
            if (this.f11275s == Float.MAX_VALUE) {
                this.f11275s = jcVar.f11275s;
            }
            if (this.f11276t == null) {
                this.f11276t = jcVar.f11276t;
            }
            if (this.f11277u == null) {
                this.f11277u = jcVar.f11277u;
            }
            if (this.f11278v == null) {
                this.f11278v = jcVar.f11278v;
            }
            if (!this.f11261e && jcVar.f11261e) {
                this.f11260d = jcVar.f11260d;
                this.f11261e = true;
            }
            if (this.f11269m != -1 || (i10 = jcVar.f11269m) == -1) {
                return;
            }
            this.f11269m = i10;
        }
    }

    public final String e() {
        return this.f11268l;
    }
}
