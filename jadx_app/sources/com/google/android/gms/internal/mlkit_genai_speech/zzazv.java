package com.google.android.gms.internal.mlkit_genai_speech;

import j2.g;

/* JADX INFO: loaded from: classes2.dex */
public final class zzazv {
    public static final zzazv zza;
    private final int zzb;

    static {
        zzazt zzaztVar = new zzazt(0, null);
        zzaztVar.zzb(true);
        zza = zzaztVar.zzd();
    }

    public /* synthetic */ zzazv(int i10, zzazu zzazuVar) {
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzazv.class == obj.getClass() && this.zzb == ((zzazv) obj).zzb;
    }

    public final int hashCode() {
        return this.zzb;
    }

    public final String toString() {
        return g.a("BindServiceFlags{", Integer.toHexString(this.zzb), "}");
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzazt zzb() {
        return new zzazt(this.zzb, null);
    }
}
