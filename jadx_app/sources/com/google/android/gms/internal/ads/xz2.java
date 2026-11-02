package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class xz2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final xz2 f19446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final xz2 f19447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final xz2 f19448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final xz2 f19449f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final xz2 f19450g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19452b;

    static {
        int i10 = 0;
        f19446c = new xz2("SHA1", i10);
        f19447d = new xz2("SHA224", i10);
        f19448e = new xz2("SHA256", i10);
        f19449f = new xz2("SHA384", i10);
        f19450g = new xz2("SHA512", i10);
    }

    public /* synthetic */ xz2(String str, int i10) {
        this.f19451a = i10;
        this.f19452b = str;
    }

    public String toString() {
        switch (this.f19451a) {
            case 0:
                return this.f19452b;
            default:
                return super.toString();
        }
    }
}
