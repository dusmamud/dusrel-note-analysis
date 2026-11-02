package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f16730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f16731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f16732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f16733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f16734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f16735f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean[] f16736g = new boolean[15];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f16737h;

    public final void a() {
        this.f16733d = 0L;
        this.f16734e = 0L;
        this.f16735f = 0L;
        this.f16737h = 0;
        Arrays.fill(this.f16736g, false);
    }

    public final boolean b() {
        return this.f16733d > 15 && this.f16737h == 0;
    }

    public final void c(long j10) {
        long j11 = this.f16733d;
        if (j11 == 0) {
            this.f16730a = j10;
        } else if (j11 == 1) {
            long j12 = j10 - this.f16730a;
            this.f16731b = j12;
            this.f16735f = j12;
            this.f16734e = 1L;
        } else {
            long j13 = j10 - this.f16732c;
            long jAbs = Math.abs(j13 - this.f16731b);
            int i10 = (int) (j11 % 15);
            boolean[] zArr = this.f16736g;
            if (jAbs <= 1000000) {
                this.f16734e++;
                this.f16735f += j13;
                if (zArr[i10]) {
                    zArr[i10] = false;
                    this.f16737h--;
                }
            } else if (!zArr[i10]) {
                zArr[i10] = true;
                this.f16737h++;
            }
        }
        this.f16733d++;
        this.f16732c = j10;
    }
}
