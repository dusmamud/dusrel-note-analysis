package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class pc {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14244f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14246h;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f14252n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f14239a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f14240b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set f14241c = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f14242d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f14243e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f14245g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f14247i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f14248j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14249k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14250l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14251m = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14253o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f14254p = false;

    public static int a(String str, int i10, int i11, String str2) {
        if (str.isEmpty() || i10 == -1) {
            return i10;
        }
        if (str.equals(str2)) {
            return i10 + i11;
        }
        return -1;
    }
}
