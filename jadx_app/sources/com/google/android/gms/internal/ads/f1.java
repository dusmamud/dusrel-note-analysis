package com.google.android.gms.internal.ads;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* JADX INFO: loaded from: classes.dex */
public final class f1 implements Spatializer$OnSpatializerStateChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f9000a;

    public f1(i1 i1Var, Runnable runnable) {
        this.f9000a = runnable;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
        this.f9000a.run();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
        this.f9000a.run();
    }
}
