package com.google.android.gms.internal.mlkit_genai_speech;

/* JADX INFO: loaded from: classes2.dex */
final class zzjv implements zzka {
    private final int zza;
    private final zzjz zzb;

    public zzjv(int i10, zzjz zzjzVar) {
        this.zza = i10;
        this.zzb = zzjzVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return zzka.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzka)) {
            return false;
        }
        zzka zzkaVar = (zzka) obj;
        return this.zza == zzkaVar.zza() && this.zzb.equals(zzkaVar.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.zza ^ 14552422) + (this.zzb.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.zza + "intEncoding=" + this.zzb + ')';
    }

    @Override // com.google.android.gms.internal.mlkit_genai_speech.zzka
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_speech.zzka
    public final zzjz zzb() {
        return this.zzb;
    }
}
