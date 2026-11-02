package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b8 extends y7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7101d;

    public b8(String str, String str2, String str3) {
        super("----");
        this.f7099b = str;
        this.f7100c = str2;
        this.f7101d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b8.class == obj.getClass()) {
            b8 b8Var = (b8) obj;
            if (Objects.equals(this.f7100c, b8Var.f7100c) && Objects.equals(this.f7099b, b8Var.f7099b) && Objects.equals(this.f7101d, b8Var.f7101d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f7101d.hashCode() + ((this.f7100c.hashCode() + ((this.f7099b.hashCode() + 527) * 31)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.y7
    public final String toString() {
        String str = this.f19533a;
        int length = String.valueOf(str).length() + 9;
        String str2 = this.f7099b;
        int length2 = str2.length() + length + 14;
        String str3 = this.f7100c;
        StringBuilder sb2 = new StringBuilder(str3.length() + length2);
        b0.e.c(sb2, str, ": domain=", str2, ", description=");
        sb2.append(str3);
        return sb2.toString();
    }
}
