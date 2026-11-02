package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class la2 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f12290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ka2 f12292c;

    public boolean a() {
        return false;
    }

    public void b(boolean z10) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (!this.f12291b) {
            this.f12291b = true;
            if (this.f12290a) {
                b(true);
                ka2 ka2Var = this.f12292c;
                if (ka2Var != null) {
                    ka2Var.zzd(true);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        boolean z10 = runningAppProcessInfo.importance == 100 || a();
        if (this.f12291b != z10) {
            this.f12291b = z10;
            if (this.f12290a) {
                b(z10);
                ka2 ka2Var = this.f12292c;
                if (ka2Var != null) {
                    ka2Var.zzd(z10);
                }
            }
        }
    }
}
