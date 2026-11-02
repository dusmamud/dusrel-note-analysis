package com.google.mlkit.genai.common;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_genai_common.zzb;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public abstract class BaseRequest {

    @Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
    @KeepForSdk
    public @interface OverrideRequestKind {
    }

    @KeepForSdk
    public abstract Integer getOverrideRequestKind();

    @KeepForSdk
    public int getOverrideRequestKindOrDefault() {
        return ((Integer) zzb.zzb(getOverrideRequestKind()).zza(0)).intValue();
    }
}
