package com.amazon.a.a.l;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f5628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f5629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f5630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Intent f5631d;

    public a(Activity activity, int i10, int i11, Intent intent) {
        this.f5628a = activity;
        this.f5629b = i10;
        this.f5630c = i11;
        this.f5631d = intent;
    }

    public Activity a() {
        return this.f5628a;
    }

    public int b() {
        return this.f5629b;
    }

    public Intent c() {
        return this.f5631d;
    }

    public int d() {
        return this.f5630c;
    }

    public String toString() {
        return "ActivtyResult: [ requestCode: " + this.f5629b + ", resultCode: " + this.f5630c + ", activity: " + this.f5628a + ", intent: " + this.f5631d + "]";
    }
}
