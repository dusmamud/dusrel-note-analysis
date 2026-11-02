package com.google.android.gms.internal.ads;

import android.util.Range;

/* JADX INFO: loaded from: classes.dex */
public final class q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f14608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f14609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f14610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Range f14611d;

    public q2() {
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d));
        this.f14611d = range;
        this.f14610c = ((Double) range.getUpper()).doubleValue();
        this.f14608a = -9223372036854775807L;
        this.f14609b = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0031  */
    public final void a(long j10, long j11) {
        double dDoubleValue;
        up2.a(j10 != -9223372036854775807L);
        up2.a(j11 != -9223372036854775807L);
        long j12 = this.f14608a;
        if (j12 != -9223372036854775807L) {
            long j13 = this.f14609b;
            if (j13 == -9223372036854775807L || j10 == j12) {
                dDoubleValue = ((Double) this.f14611d.getUpper()).doubleValue();
            } else {
                dDoubleValue = (j11 - j13) / (j10 - j12);
            }
        } else {
            dDoubleValue = ((Double) this.f14611d.getUpper()).doubleValue();
        }
        this.f14610c = (((Double) this.f14611d.clamp(Double.valueOf(dDoubleValue))).doubleValue() * 0.20000000298023224d) + (this.f14610c * 0.800000011920929d);
        this.f14608a = j10;
        this.f14609b = j11;
    }

    public final void b(float f10) {
        up2.a(f10 > 0.0f);
        this.f14611d = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / ((double) f10)));
        c();
    }

    public final void c() {
        this.f14610c = ((Double) this.f14611d.getUpper()).doubleValue();
        this.f14608a = -9223372036854775807L;
        this.f14609b = -9223372036854775807L;
    }
}
