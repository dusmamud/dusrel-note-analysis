package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
public enum a7 implements e4 {
    BROADCAST_ACTION_UNSPECIFIED(0),
    PURCHASES_UPDATED_ACTION(1),
    LOCAL_PURCHASES_UPDATED_ACTION(2),
    ALTERNATIVE_BILLING_ACTION(3);

    private final int zzf;

    a7(int i10) {
        this.zzf = i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzf);
    }

    @Override // com.google.android.gms.internal.play_billing.e4
    public final int zza() {
        return this.zzf;
    }
}
