package com.google.android.gms.internal.mlkit_genai_speech;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzatu {
    public static final zzatu zza;
    private static final IdentityHashMap zzb;
    private final IdentityHashMap zzc;

    static {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        zzb = identityHashMap;
        zza = new zzatu(identityHashMap);
    }

    private zzatu(IdentityHashMap identityHashMap) {
        this.zzc = identityHashMap;
    }

    public static zzatr zza() {
        return new zzatr(zza, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzatu.class != obj.getClass()) {
            return false;
        }
        IdentityHashMap identityHashMap = this.zzc;
        IdentityHashMap identityHashMap2 = ((zzatu) obj).zzc;
        if (identityHashMap.size() != identityHashMap2.size()) {
            return false;
        }
        for (Map.Entry entry : identityHashMap.entrySet()) {
            if (!identityHashMap2.containsKey(entry.getKey()) || !Objects.equals(entry.getValue(), identityHashMap2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHash = 0;
        for (Map.Entry entry : this.zzc.entrySet()) {
            iHash += Objects.hash(entry.getKey(), entry.getValue());
        }
        return iHash;
    }

    public final String toString() {
        return this.zzc.toString();
    }

    public final zzatr zzb() {
        return new zzatr(this, null);
    }

    public final Object zzc(zzats zzatsVar) {
        return this.zzc.get(zzatsVar);
    }

    public /* synthetic */ zzatu(IdentityHashMap identityHashMap, zzatt zzattVar) {
        this.zzc = identityHashMap;
    }
}
