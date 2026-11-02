package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class e63 implements x31 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e63 f8653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e63 f8654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e63 f8655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e63 f8656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e63 f8657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e63 f8658h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8660b;

    static {
        int i10 = 0;
        f8653c = new e63("TINK", i10);
        f8654d = new e63("CRUNCHY", i10);
        f8655e = new e63("LEGACY", i10);
        f8656f = new e63("NO_PREFIX", i10);
        int i11 = 1;
        f8657g = new e63("TINK", i11);
        f8658h = new e63("NO_PREFIX", i11);
    }

    public /* synthetic */ e63(String str, int i10) {
        this.f8659a = i10;
        this.f8660b = str;
    }

    public String toString() {
        switch (this.f8659a) {
            case 0:
                return this.f8660b;
            case 1:
                return this.f8660b;
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.x31, com.google.android.gms.internal.ads.ff1
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo19zza(Object obj) {
        ((t41) obj).zza(this.f8660b);
    }
}
