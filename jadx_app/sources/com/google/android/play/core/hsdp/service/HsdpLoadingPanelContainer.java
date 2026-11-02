package com.google.android.play.core.hsdp.service;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class HsdpLoadingPanelContainer extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Runnable f22857a;

    public HsdpLoadingPanelContainer(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Runnable runnable = this.f22857a;
        if (runnable != null) {
            removeCallbacks(runnable);
            post(this.f22857a);
        }
    }

    public void setOnConfigurationChangedListener(Runnable runnable) {
        this.f22857a = runnable;
    }

    public HsdpLoadingPanelContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HsdpLoadingPanelContainer(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
