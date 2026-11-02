package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class aw1 implements gy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f6931a;

    public aw1(Integer num) {
        this.f6931a = num;
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        Integer num = this.f6931a;
        if (num != null) {
            bundle.putInt("dspct", Math.min(num.intValue(), 20));
        }
    }
}
