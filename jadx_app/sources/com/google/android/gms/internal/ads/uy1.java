package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class uy1 extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17756b;

    public uy1(int i10, int i11) {
        super(i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? androidx.fragment.app.m.b(new StringBuilder(String.valueOf(i11).length() + 31), "Player stuck suppressed for ", i11, " ms") : androidx.fragment.app.m.b(new StringBuilder(String.valueOf(i11).length() + 43), "Player stuck playing without ending for ", i11, " ms") : androidx.fragment.app.m.b(new StringBuilder(String.valueOf(i11).length() + 45), "Player stuck playing with no progress for ", i11, " ms") : androidx.fragment.app.m.b(new StringBuilder(String.valueOf(i11).length() + 47), "Player stuck buffering with no progress for ", i11, " ms") : androidx.fragment.app.m.b(new StringBuilder(String.valueOf(i11).length() + 46), "Player stuck buffering and not loading for ", i11, " ms"));
        this.f17755a = i10;
        this.f17756b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uy1.class != obj.getClass()) {
            return false;
        }
        uy1 uy1Var = (uy1) obj;
        return this.f17755a == uy1Var.f17755a && this.f17756b == uy1Var.f17756b;
    }

    public final int hashCode() {
        return ((this.f17755a + 527) * 31) + this.f17756b;
    }
}
