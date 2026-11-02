package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class x5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f18888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18890d;

    public x5(int i10, byte[] bArr, int i11, int i12) {
        this.f18887a = i10;
        this.f18888b = bArr;
        this.f18889c = i11;
        this.f18890d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x5.class == obj.getClass()) {
            x5 x5Var = (x5) obj;
            if (this.f18887a == x5Var.f18887a && this.f18889c == x5Var.f18889c && this.f18890d == x5Var.f18890d && Arrays.equals(this.f18888b, x5Var.f18888b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f18888b) + (this.f18887a * 31)) * 31) + this.f18889c) * 31) + this.f18890d;
    }
}
