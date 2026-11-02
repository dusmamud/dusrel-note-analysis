package com.google.android.gms.internal.mlkit_genai_speech;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
class zzhe extends zzhf {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    public zzhe(int i10) {
    }

    private final void zze(int i10) {
        int length = this.zza.length;
        int iZzd = zzhf.zzd(length, this.zzb + i10);
        if (iZzd > length || this.zzc) {
            this.zza = Arrays.copyOf(this.zza, iZzd);
            this.zzc = false;
        }
    }

    public final zzhe zza(Object obj) {
        obj.getClass();
        zze(1);
        Object[] objArr = this.zza;
        int i10 = this.zzb;
        this.zzb = i10 + 1;
        objArr[i10] = obj;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_speech.zzhf
    public /* bridge */ /* synthetic */ zzhf zzb(Object obj) {
        throw null;
    }

    public final zzhf zzc(Iterable iterable) {
        Collection collection = (Collection) iterable;
        zze(collection.size());
        if (collection instanceof zzhg) {
            this.zzb = ((zzhg) collection).zza(this.zza, this.zzb);
            return this;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzb(it.next());
        }
        return this;
    }
}
