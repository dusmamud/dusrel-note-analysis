package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes.dex */
public final class va implements cb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cb[] f21048a;

    public va(cb... cbVarArr) {
        this.f21048a = cbVarArr;
    }

    @Override // com.google.android.gms.internal.consent_sdk.cb
    public final bb zzb(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            cb cbVar = this.f21048a[i10];
            if (cbVar.zzc(cls)) {
                return cbVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.consent_sdk.cb
    public final boolean zzc(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.f21048a[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
