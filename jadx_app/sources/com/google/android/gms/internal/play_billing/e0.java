package com.google.android.gms.internal.play_billing;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 extends m0 {
    @Override // com.google.android.gms.internal.play_billing.m0
    public final long a() {
        return SystemClock.elapsedRealtime() * 1000000;
    }
}
