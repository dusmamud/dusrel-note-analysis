package com.google.android.gms.internal.mlkit_genai_speech;

/* JADX INFO: loaded from: classes2.dex */
final class zzahd implements zzahl {
    private final zzahl[] zza;

    public zzahd(zzahl... zzahlVarArr) {
        this.zza = zzahlVarArr;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_speech.zzahl
    public final zzahk zzb(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            zzahl zzahlVar = this.zza[i10];
            if (zzahlVar.zzc(cls)) {
                return zzahlVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.mlkit_genai_speech.zzahl
    public final boolean zzc(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.zza[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
