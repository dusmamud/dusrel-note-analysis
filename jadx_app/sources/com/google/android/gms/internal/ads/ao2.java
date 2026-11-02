package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;

/* JADX INFO: loaded from: classes.dex */
public final class ao2 implements AppOpsManager$OnOpActiveChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bo2 f6812a;

    public ao2(bo2 bo2Var) {
        this.f6812a = bo2Var;
    }

    public final void onOpActiveChanged(String str, int i10, String str2, boolean z10) {
        bo2 bo2Var = this.f6812a;
        synchronized (bo2Var) {
            try {
                if (z10) {
                    bo2Var.f7326c = System.currentTimeMillis();
                    bo2Var.f7329f = true;
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j10 = bo2Var.f7327d;
                    if (j10 > 0 && jCurrentTimeMillis >= j10) {
                        bo2Var.f7328e = jCurrentTimeMillis - j10;
                    }
                    bo2Var.f7329f = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
