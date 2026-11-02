package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class ew3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f8953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8954c;

    public ew3(String str, boolean z10, boolean z11) {
        this.f8952a = str;
        this.f8953b = z10;
        this.f8954c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != ew3.class) {
            return false;
        }
        ew3 ew3Var = (ew3) obj;
        return TextUtils.equals(this.f8952a, ew3Var.f8952a) && this.f8953b == ew3Var.f8953b && this.f8954c == ew3Var.f8954c;
    }

    public final int hashCode() {
        return ((((this.f8952a.hashCode() + 31) * 31) + (true != this.f8953b ? 1237 : 1231)) * 31) + (true != this.f8954c ? 1237 : 1231);
    }
}
