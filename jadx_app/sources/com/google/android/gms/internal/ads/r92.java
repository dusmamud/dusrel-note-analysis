package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class r92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ca2 f15227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ca2 f15228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v92 f15230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y92 f15231e;

    public r92(v92 v92Var, y92 y92Var, ca2 ca2Var, ca2 ca2Var2, boolean z10) {
        this.f15230d = v92Var;
        this.f15231e = y92Var;
        this.f15227a = ca2Var;
        if (ca2Var2 == null) {
            this.f15228b = ca2.NONE;
        } else {
            this.f15228b = ca2Var2;
        }
        this.f15229c = z10;
    }

    public static r92 a(v92 v92Var, y92 y92Var, ca2 ca2Var, ca2 ca2Var2, boolean z10) {
        if (v92Var == null) {
            throw new IllegalArgumentException("CreativeType is null");
        }
        if (y92Var == null) {
            throw new IllegalArgumentException("ImpressionType is null");
        }
        if (ca2Var == null) {
            throw new IllegalArgumentException("Impression owner is null");
        }
        if (ca2Var == ca2.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (v92Var == v92.DEFINED_BY_JAVASCRIPT && ca2Var == ca2.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (y92Var == y92.DEFINED_BY_JAVASCRIPT && ca2Var == ca2.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new r92(v92Var, y92Var, ca2Var, ca2Var2, z10);
    }
}
