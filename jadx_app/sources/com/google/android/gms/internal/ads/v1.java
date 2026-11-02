package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class v1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17785c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17787e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f17790h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t1 f17791i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u1 f17783a = new u1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u1 f17784b = new u1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f17786d = -9223372036854775807L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f17788f = -1.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f17789g = -1.0f;

    public v1(t1 t1Var) {
        this.f17791i = t1Var;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    public final void a(long j10) {
        if (j10 == this.f17786d) {
            return;
        }
        this.f17790h++;
        this.f17783a.c(j10);
        if (this.f17783a.b()) {
            this.f17785c = false;
        } else if (this.f17786d != -9223372036854775807L) {
            if (this.f17785c) {
                u1 u1Var = this.f17784b;
                long j11 = u1Var.f16733d;
                if (j11 == 0 ? false : u1Var.f16736g[(int) ((j11 - 1) % 15)]) {
                    this.f17784b.a();
                    this.f17784b.c(this.f17786d);
                }
            } else {
                this.f17784b.a();
                this.f17784b.c(this.f17786d);
            }
            this.f17785c = true;
            this.f17784b.c(j10);
        }
        if (this.f17785c && this.f17784b.b()) {
            u1 u1Var2 = this.f17783a;
            this.f17783a = this.f17784b;
            this.f17784b = u1Var2;
            this.f17785c = false;
        }
        this.f17786d = j10;
        this.f17787e = this.f17783a.b() ? 0 : this.f17787e + 1;
        c();
    }

    public final long b() {
        if (!this.f17783a.b()) {
            return -9223372036854775807L;
        }
        u1 u1Var = this.f17783a;
        long j10 = u1Var.f16734e;
        if (j10 == 0) {
            return 0L;
        }
        return u1Var.f16735f / j10;
    }

    public final void c() {
        float f10;
        boolean zB = this.f17783a.b();
        if (zB) {
            u1 u1Var = this.f17783a;
            long j10 = u1Var.f16734e;
            f10 = (float) (1.0E9d / (j10 != 0 ? u1Var.f16735f / j10 : 0L));
        } else {
            f10 = this.f17788f;
        }
        float f11 = this.f17789g;
        if (f10 == f11) {
            return;
        }
        if (f10 != -1.0f && f11 != -1.0f) {
            float f12 = 1.0f;
            if (zB && this.f17783a.f16735f >= 5000000000L) {
                f12 = 0.1f;
            }
            if (Math.abs(f10 - f11) < f12) {
                return;
            }
        } else if (f10 == -1.0f && this.f17787e < 30) {
            return;
        }
        this.f17789g = f10;
        this.f17791i.b(f10);
    }
}
