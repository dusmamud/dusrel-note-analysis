package com.google.android.gms.internal.mlkit_vision_document_scanner;

/* JADX INFO: loaded from: classes2.dex */
final class zzak implements zzap {
    private final int zza;
    private final zzao zzb;

    public zzak(int i10, zzao zzaoVar) {
        this.zza = i10;
        this.zzb = zzaoVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return zzap.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzap)) {
            return false;
        }
        zzap zzapVar = (zzap) obj;
        return this.zza == zzapVar.zza() && this.zzb.equals(zzapVar.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.zza ^ 14552422) + (this.zzb.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.zza + "intEncoding=" + this.zzb + ')';
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzap
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzap
    public final zzao zzb() {
        return this.zzb;
    }
}
