package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes.dex */
public final class z3 {
    public static final y3 a(Object obj, Object obj2) {
        y3 y3Var = (y3) obj;
        y3 y3Var2 = (y3) obj2;
        if (!y3Var2.isEmpty()) {
            if (!y3Var.f20690a) {
                if (y3Var.isEmpty()) {
                    y3Var = new y3();
                } else {
                    y3 y3Var3 = new y3(y3Var);
                    y3Var3.f20690a = true;
                    y3Var = y3Var3;
                }
            }
            y3Var.b();
            if (!y3Var2.isEmpty()) {
                y3Var.putAll(y3Var2);
            }
        }
        return y3Var;
    }
}
