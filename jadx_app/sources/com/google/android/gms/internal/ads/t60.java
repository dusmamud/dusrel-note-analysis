package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.AdapterStatus;

/* JADX INFO: loaded from: classes.dex */
public final class t60 implements AdapterStatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdapterStatus.State f16263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16265c;

    public t60(AdapterStatus.State state, String str, int i10) {
        this.f16263a = state;
        this.f16264b = str;
        this.f16265c = i10;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final String getDescription() {
        return this.f16264b;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final AdapterStatus.State getInitializationState() {
        return this.f16263a;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final int getLatency() {
        return this.f16265c;
    }
}
