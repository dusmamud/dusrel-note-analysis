package com.google.android.gms.internal.mlkit_genai_speech;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzagz {
    public static final List zza(Object obj, long j10) {
        zzago zzagoVar = (zzago) zzait.zzf(obj, j10);
        if (zzagoVar.zzc()) {
            return zzagoVar;
        }
        int size = zzagoVar.size();
        zzago zzagoVarZzd = zzagoVar.zzd(size == 0 ? 10 : size + size);
        zzait.zzs(obj, j10, zzagoVarZzd);
        return zzagoVarZzd;
    }
}
