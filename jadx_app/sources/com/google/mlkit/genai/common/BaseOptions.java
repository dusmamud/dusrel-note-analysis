package com.google.mlkit.genai.common;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_genai_common.zzb;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public abstract class BaseOptions {
    @KeepForSdk
    public abstract Integer getTargetVersion();

    @KeepForSdk
    public int getTargetVersionOrDefault() {
        return ((Integer) zzb.zzb(getTargetVersion()).zza(-1)).intValue();
    }
}
