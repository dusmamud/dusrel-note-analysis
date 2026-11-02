package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ei3 implements li3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final li3[] f8818a;

    public ei3(li3... li3VarArr) {
        this.f8818a = li3VarArr;
    }

    @Override // com.google.android.gms.internal.ads.li3
    public final boolean zzb(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.f8818a[i10].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.li3
    public final ki3 zzc(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            li3 li3Var = this.f8818a[i10];
            if (li3Var.zzb(cls)) {
                return li3Var.zzc(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
