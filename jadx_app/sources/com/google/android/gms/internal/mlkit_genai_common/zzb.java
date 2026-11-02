package com.google.android.gms.internal.mlkit_genai_common;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzb implements Serializable {
    public static zzb zzb(Object obj) {
        return obj == null ? zza.zza : new zzc(obj);
    }

    public abstract Object zza(Object obj);
}
