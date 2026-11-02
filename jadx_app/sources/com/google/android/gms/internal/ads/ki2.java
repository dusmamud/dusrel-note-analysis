package com.google.android.gms.internal.ads;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public final class ki2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f11851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f11852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f11853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f11854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f11855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f11856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f11857g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f11858h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f11859i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f11860j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f11861k;

    public final void a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f11851a++;
            this.f11857g = 0.0d;
            this.f11855e = motionEvent.getRawX();
            this.f11856f = motionEvent.getRawY();
            this.f11858h = motionEvent.getX();
            this.f11859i = motionEvent.getY();
            this.f11860j = motionEvent.getRawX();
            this.f11861k = motionEvent.getRawY();
            return;
        }
        if (action == 1) {
            this.f11853c++;
            this.f11857g = Math.hypot(((double) motionEvent.getRawX()) - this.f11855e, ((double) motionEvent.getRawY()) - this.f11856f) + this.f11857g;
            this.f11855e = motionEvent.getRawX();
            this.f11856f = motionEvent.getRawY();
            return;
        }
        if (action != 2) {
            if (action != 3) {
                return;
            }
            this.f11854d++;
            return;
        }
        this.f11852b += (long) (motionEvent.getHistorySize() + 1);
        this.f11857g = Math.hypot(((double) motionEvent.getRawX()) - this.f11855e, ((double) motionEvent.getRawY()) - this.f11856f) + this.f11857g;
        this.f11855e = motionEvent.getRawX();
        this.f11856f = motionEvent.getRawY();
    }
}
