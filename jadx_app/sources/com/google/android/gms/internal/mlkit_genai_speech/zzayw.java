package com.google.android.gms.internal.mlkit_genai_speech;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
final class zzayw implements Comparator {
    final /* synthetic */ zzayx zza;

    public zzayw(zzayx zzayxVar) {
        this.zza = zzayxVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        zzayx zzayxVar = this.zza;
        int iZza = zzayxVar.zza(obj) - zzayxVar.zza(obj2);
        return iZza != 0 ? iZza : obj.getClass().getName().compareTo(obj2.getClass().getName());
    }
}
