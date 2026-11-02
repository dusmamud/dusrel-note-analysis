package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
public final class z6 implements f4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z6 f22855a = new z6();

    @Override // com.google.android.gms.internal.play_billing.f4
    public final boolean zza(int i10) {
        a7 a7Var;
        if (i10 == 0) {
            a7Var = a7.BROADCAST_ACTION_UNSPECIFIED;
        } else if (i10 == 1) {
            a7Var = a7.PURCHASES_UPDATED_ACTION;
        } else if (i10 != 2) {
            a7Var = i10 != 3 ? null : a7.ALTERNATIVE_BILLING_ACTION;
        } else {
            a7Var = a7.LOCAL_PURCHASES_UPDATED_ACTION;
        }
        return a7Var != null;
    }
}
