package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class j6 implements d6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f11125f;

    public j6(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f11120a = i10;
        this.f11121b = i11;
        this.f11122c = i12;
        this.f11123d = i13;
        this.f11124e = i14;
        this.f11125f = i15;
    }

    public final int a() {
        int i10 = this.f11120a;
        if (i10 == 1935960438) {
            return 2;
        }
        if (i10 == 1935963489) {
            return 1;
        }
        if (i10 == 1937012852) {
            return 3;
        }
        ui1.c("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i10))));
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.d6
    public final int zza() {
        return 1752331379;
    }
}
