package com.google.android.gms.internal.mlkit_genai_speech;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
final class zzhp extends zzib {
    private final Object zza;
    private boolean zzb;

    public zzhp(Object obj) {
        this.zza = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.zzb;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.zzb) {
            throw new NoSuchElementException();
        }
        this.zzb = true;
        return this.zza;
    }
}
