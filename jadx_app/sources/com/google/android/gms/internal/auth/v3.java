package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes.dex */
public final class v3 implements c4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c4[] f20649a;

    public v3(c4... c4VarArr) {
        this.f20649a = c4VarArr;
    }

    @Override // com.google.android.gms.internal.auth.c4
    public final b4 zzb(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            c4 c4Var = this.f20649a[i10];
            if (c4Var.zzc(cls)) {
                return c4Var.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.auth.c4
    public final boolean zzc(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.f20649a[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
