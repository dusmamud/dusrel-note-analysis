package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: loaded from: classes.dex */
public final class f62 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PowerManager.WakeLock f9081b;

    public f62(Context context) {
        this.f9080a = context;
    }

    public final void a(boolean z10, boolean z11) {
        synchronized (this) {
            boolean z12 = false;
            if (z10) {
                if (this.f9081b == null) {
                    Context context = this.f9080a;
                    if (context.checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                        ui1.c("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                        return;
                    }
                    PowerManager powerManager = (PowerManager) context.getSystemService("power");
                    if (powerManager == null) {
                        ui1.c("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                        return;
                    } else {
                        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                        this.f9081b = wakeLockNewWakeLock;
                        wakeLockNewWakeLock.setReferenceCounted(false);
                    }
                }
            }
            PowerManager.WakeLock wakeLock = this.f9081b;
            if (wakeLock == null) {
                return;
            }
            if (z10 && z11) {
                z12 = true;
            }
            if (z12) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }
}
