package com.google.android.gms.internal.mlkit_genai_speech;

import java.util.IdentityHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzatr {
    private zzatu zza;
    private IdentityHashMap zzb;

    public /* synthetic */ zzatr(zzatu zzatuVar, zzatt zzattVar) {
        this.zza = zzatuVar;
    }

    private final IdentityHashMap zzd(int i10) {
        if (this.zzb == null) {
            IdentityHashMap identityHashMap = new IdentityHashMap(this.zza.zzc.size() + i10);
            this.zzb = identityHashMap;
            identityHashMap.putAll(this.zza.zzc);
            this.zza = null;
        }
        return this.zzb;
    }

    public final zzatr zza(zzats zzatsVar) {
        zzatu zzatuVar = this.zza;
        if (zzatuVar == null) {
            this.zzb.remove(zzatsVar);
            return this;
        }
        if (zzatuVar.zzc.containsKey(zzatsVar)) {
            zzd(0).remove(zzatsVar);
        }
        return this;
    }

    public final zzatr zzb(zzats zzatsVar, Object obj) {
        zzd(1).put(zzatsVar, obj);
        return this;
    }

    public final zzatu zzc() {
        if (this.zzb != null) {
            this.zza = new zzatu(this.zzb, null);
            this.zzb = null;
        }
        return this.zza;
    }
}
