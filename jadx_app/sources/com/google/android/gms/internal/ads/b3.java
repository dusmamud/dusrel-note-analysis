package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r2 f7021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Surface f7023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f7024e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f7025f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f7026g = 1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7027h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f7028i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f7029j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f7030k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f7031l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f7032m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f7033n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f7034o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f7035p;

    public b3(Context context) {
        this.f7020a = context;
    }

    public final void a() {
        this.f7033n = -1L;
        this.f7030k = -1L;
        this.f7032m = -9223372036854775807L;
        this.f7028i = 0L;
        this.f7029j = 0L;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0028  */
    public final void b(boolean z10) {
        Surface surface;
        float f10;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.f7023d) == null || this.f7027h == Integer.MIN_VALUE || !surface.isValid()) {
            return;
        }
        if (this.f7022c) {
            float f11 = this.f7024e;
            if (f11 != -1.0f) {
                f10 = f11 * this.f7026g;
            } else {
                f10 = 0.0f;
            }
        } else {
            f10 = 0.0f;
        }
        if (z10 || this.f7025f != f10) {
            this.f7025f = f10;
            try {
                this.f7023d.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e10) {
                ui1.f("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
            }
        }
    }

    public final void c() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.f7023d) == null || this.f7027h == Integer.MIN_VALUE || this.f7025f == 0.0f || !surface.isValid()) {
            return;
        }
        this.f7025f = 0.0f;
        try {
            this.f7023d.setFrameRate(0.0f, 0);
        } catch (IllegalStateException e10) {
            ui1.f("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
        }
    }
}
