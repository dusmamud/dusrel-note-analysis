package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
public final class v4 implements c5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c5[] f22822a;

    public v4(c5... c5VarArr) {
        this.f22822a = c5VarArr;
    }

    @Override // com.google.android.gms.internal.play_billing.c5
    public final b5 zzb(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            c5 c5Var = this.f22822a[i10];
            if (c5Var.zzc(cls)) {
                return c5Var.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.c5
    public final boolean zzc(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.f22822a[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
