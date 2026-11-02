package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Spatializer f10558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f10560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f1 f10561d;

    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.android.gms.internal.ads.g1] */
    public i1(Context context, Runnable runnable, Boolean bool) {
        AudioManager audioManagerA = context == null ? null : xk0.a(context);
        if (audioManagerA == null || (bool != null && bool.booleanValue())) {
            this.f10558a = null;
            this.f10559b = false;
            this.f10560c = null;
            this.f10561d = null;
            return;
        }
        Spatializer spatializer = audioManagerA.getSpatializer();
        this.f10558a = spatializer;
        this.f10559b = spatializer.getImmersiveAudioLevel() != 0;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        final Handler handler = new Handler(looperMyLooper);
        this.f10560c = handler;
        f1 f1Var = new f1(this, runnable);
        this.f10561d = f1Var;
        spatializer.addOnSpatializerStateChangedListener(new Executor() { // from class: com.google.android.gms.internal.ads.g1
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable2) {
                handler.post(runnable2);
            }
        }, f1Var);
    }
}
