package com.google.android.gms.internal.mlkit_genai_speech;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbgt {
    private final Set zza = Collections.newSetFromMap(new IdentityHashMap());

    public abstract void zza();

    public abstract void zzb();

    public final void zzc(Object obj, boolean z10) {
        Set set = this.zza;
        int size = set.size();
        if (z10) {
            set.add(obj);
            if (size == 0) {
                zza();
                return;
            }
            return;
        }
        if (set.remove(obj) && size == 1) {
            zzb();
        }
    }

    public final boolean zzd(Object... objArr) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.zza.contains(objArr[i10])) {
                return true;
            }
        }
        return false;
    }

    public final boolean zze() {
        return !this.zza.isEmpty();
    }
}
