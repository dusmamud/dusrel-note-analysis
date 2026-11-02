package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;

/* JADX INFO: loaded from: classes.dex */
public final class ko implements AppOpsManager$OnOpActiveChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mo f11914a;

    public ko(mo moVar) {
        this.f11914a = moVar;
    }

    public final void onOpActiveChanged(String str, int i10, String str2, boolean z10) {
        if (z10) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            mo moVar = this.f11914a;
            moVar.f12897a = jCurrentTimeMillis;
            moVar.f12900d = true;
            return;
        }
        mo moVar2 = this.f11914a;
        long j10 = moVar2.f12898b;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        if (j10 > 0) {
            long j11 = moVar2.f12898b;
            if (jCurrentTimeMillis2 >= j11) {
                moVar2.f12899c = jCurrentTimeMillis2 - j11;
            }
        }
        moVar2.f12900d = false;
    }
}
