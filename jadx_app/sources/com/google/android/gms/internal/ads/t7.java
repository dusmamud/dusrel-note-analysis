package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class t7 extends y7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f16272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f16273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f16274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y7[] f16275f;

    public t7(String str, boolean z10, boolean z11, String[] strArr, y7[] y7VarArr) {
        super("CTOC");
        this.f16271b = str;
        this.f16272c = z10;
        this.f16273d = z11;
        this.f16274e = strArr;
        this.f16275f = y7VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t7.class == obj.getClass()) {
            t7 t7Var = (t7) obj;
            if (this.f16272c == t7Var.f16272c && this.f16273d == t7Var.f16273d && Objects.equals(this.f16271b, t7Var.f16271b) && Arrays.equals(this.f16274e, t7Var.f16274e) && Arrays.equals(this.f16275f, t7Var.f16275f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f16271b.hashCode() + (((((this.f16272c ? 1 : 0) + 527) * 31) + (this.f16273d ? 1 : 0)) * 31);
    }
}
