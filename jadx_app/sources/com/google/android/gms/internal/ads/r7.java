package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class r7 extends y7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f15201b;

    public r7(String str, byte[] bArr) {
        super(str);
        this.f15201b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r7.class == obj.getClass()) {
            r7 r7Var = (r7) obj;
            if (this.f19533a.equals(r7Var.f19533a) && Arrays.equals(this.f15201b, r7Var.f15201b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f15201b) + ((this.f19533a.hashCode() + 527) * 31);
    }
}
