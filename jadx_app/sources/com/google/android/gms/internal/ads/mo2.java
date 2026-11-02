package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class mo2 extends wo2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f12908d;

    public mo2(int i10, String str, int i11, Boolean bool) {
        this.f12905a = i10;
        this.f12906b = str;
        this.f12907c = i11;
        this.f12908d = bool;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final int a() {
        return this.f12905a;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final String b() {
        return this.f12906b;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final int c() {
        return this.f12907c;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final Boolean d() {
        return this.f12908d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wo2)) {
            return false;
        }
        wo2 wo2Var = (wo2) obj;
        if (this.f12905a != wo2Var.a()) {
            return false;
        }
        String str = this.f12906b;
        if (str == null) {
            if (wo2Var.b() != null) {
                return false;
            }
        } else if (!str.equals(wo2Var.b())) {
            return false;
        }
        if (this.f12907c != wo2Var.c()) {
            return false;
        }
        Boolean bool = this.f12908d;
        if (bool == null) {
            return wo2Var.d() == null;
        }
        return bool.equals(wo2Var.d());
    }

    public final int hashCode() {
        String str = this.f12906b;
        int iHashCode = str == null ? 0 : str.hashCode();
        Boolean bool = this.f12908d;
        return (bool != null ? bool.hashCode() : 0) ^ ((((iHashCode ^ ((this.f12905a ^ 1000003) * 1000003)) * 1000003) ^ this.f12907c) * 1000003);
    }

    public final String toString() {
        int i10 = this.f12905a;
        int length = String.valueOf(i10).length();
        String str = this.f12906b;
        int length2 = String.valueOf(str).length();
        int i11 = this.f12907c;
        int length3 = String.valueOf(i11).length();
        Boolean bool = this.f12908d;
        StringBuilder sb2 = new StringBuilder(length + 46 + length2 + 9 + length3 + 17 + String.valueOf(bool).length() + 1);
        sb2.append("OverlayDisplayState{statusCode=");
        sb2.append(i10);
        sb2.append(", sessionToken=");
        sb2.append(str);
        sb2.append(", uiMode=");
        sb2.append(i11);
        sb2.append(", userInteracted=");
        sb2.append(bool);
        sb2.append("}");
        return sb2.toString();
    }
}
