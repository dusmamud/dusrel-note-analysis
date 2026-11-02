package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class mg2 {
    public static byte[] a(String str, boolean z10) throws IllegalArgumentException {
        qu2 qu2VarF;
        qu2 qu2Var;
        if (z10) {
            qu2Var = tu2.f16624b;
            if (qu2Var.f16132e != null) {
                qu2VarF = qu2Var;
                qu2VarF = qu2Var.f(qu2Var.f16131d, null);
            }
        } else {
            qu2VarF = tu2.f16623a;
        }
        qu2VarF = qu2Var;
        byte[] bArrE = qu2VarF.e(str);
        if (bArrE.length != 0 || str.length() <= 0) {
            return bArrE;
        }
        throw new IllegalArgumentException("Unable to decode ".concat(str));
    }
}
