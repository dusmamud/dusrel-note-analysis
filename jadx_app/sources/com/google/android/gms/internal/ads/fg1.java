package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class fg1 implements t41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f9195a = new Bundle();

    @Override // com.google.android.gms.internal.ads.t41
    public final synchronized void zza(String str) {
        this.f9195a.putInt(str, 1);
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final synchronized void zzb(String str) {
        this.f9195a.putInt(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final synchronized void zzc(String str, String str2) {
        this.f9195a.putInt(str, 3);
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final void zzd(String str) {
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final void zzf() {
    }
}
