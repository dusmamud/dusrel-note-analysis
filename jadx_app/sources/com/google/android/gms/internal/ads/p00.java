package com.google.android.gms.internal.ads;

import android.graphics.drawable.AnimationDrawable;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes.dex */
public final class p00 extends RelativeLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f14078b = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AnimationDrawable f14079a;

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.f14079a;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
