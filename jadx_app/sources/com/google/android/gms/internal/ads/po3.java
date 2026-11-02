package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class po3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f14386c = -9223372036854775807L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f14387d = -9223372036854775807L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f14389f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f14390g = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f14392i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f14393j = -9223372036854775807L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f14388e = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f14391h = -9223372036854775807L;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f14394k = -9223372036854775807L;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f14395l = -9223372036854775807L;

    public /* synthetic */ po3(long j10, long j11) {
        this.f14384a = j10;
        this.f14385b = j11;
    }

    public final void a() {
        long j10 = this.f14391h;
        if (j10 == -9223372036854775807L) {
            return;
        }
        long j11 = j10 + this.f14385b;
        this.f14391h = j11;
        long j12 = this.f14390g;
        if (j12 != -9223372036854775807L && j11 > j12) {
            this.f14391h = j12;
        }
        this.f14393j = -9223372036854775807L;
    }

    public final long b() {
        return this.f14391h;
    }

    public final void c() {
        long j10;
        long j11 = this.f14386c;
        if (j11 != -9223372036854775807L) {
            j10 = this.f14387d;
            if (j10 == -9223372036854775807L) {
                long j12 = this.f14389f;
                if (j12 != -9223372036854775807L && j11 < j12) {
                    j11 = j12;
                }
                j10 = this.f14390g;
                if (j10 == -9223372036854775807L || j11 <= j10) {
                    j10 = j11;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f14388e == j10) {
            return;
        }
        this.f14388e = j10;
        this.f14391h = j10;
        this.f14394k = -9223372036854775807L;
        this.f14395l = -9223372036854775807L;
        this.f14393j = -9223372036854775807L;
    }
}
