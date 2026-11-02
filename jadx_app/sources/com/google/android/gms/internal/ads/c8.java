package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c8 extends y7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f7717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f7718f;

    public c8(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f7714b = i10;
        this.f7715c = i11;
        this.f7716d = i12;
        this.f7717e = iArr;
        this.f7718f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c8.class == obj.getClass()) {
            c8 c8Var = (c8) obj;
            if (this.f7714b == c8Var.f7714b && this.f7715c == c8Var.f7715c && this.f7716d == c8Var.f7716d && Arrays.equals(this.f7717e, c8Var.f7717e) && Arrays.equals(this.f7718f, c8Var.f7718f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f7718f) + ((Arrays.hashCode(this.f7717e) + ((((((this.f7714b + 527) * 31) + this.f7715c) * 31) + this.f7716d) * 31)) * 31);
    }
}
