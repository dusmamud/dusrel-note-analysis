package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ry2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ry2 f15597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ry2 f15598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ry2 f15599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ry2 f15600f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ry2 f15601g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ry2 f15602h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15604b;

    static {
        int i10 = 0;
        f15597c = new ry2("ENABLED", i10);
        f15598d = new ry2("DISABLED", i10);
        f15599e = new ry2("DESTROYED", i10);
        int i11 = 1;
        f15600f = new ry2("TINK", i11);
        f15601g = new ry2("CRUNCHY", i11);
        f15602h = new ry2("NO_PREFIX", i11);
    }

    public /* synthetic */ ry2(String str, int i10) {
        this.f15603a = i10;
        this.f15604b = str;
    }

    public final String toString() {
        switch (this.f15603a) {
            case 0:
                break;
        }
        return this.f15604b;
    }
}
