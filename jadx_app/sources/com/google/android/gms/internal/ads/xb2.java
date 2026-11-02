package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class xb2 extends vb2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f18986e;

    public xb2(String str, boolean z10, boolean z11, long j10, long j11) {
        this.f18982a = str;
        this.f18983b = z10;
        this.f18984c = z11;
        this.f18985d = j10;
        this.f18986e = j11;
    }

    @Override // com.google.android.gms.internal.ads.vb2
    public final String a() {
        return this.f18982a;
    }

    @Override // com.google.android.gms.internal.ads.vb2
    public final boolean b() {
        return this.f18983b;
    }

    @Override // com.google.android.gms.internal.ads.vb2
    public final boolean c() {
        return this.f18984c;
    }

    @Override // com.google.android.gms.internal.ads.vb2
    public final long d() {
        return this.f18985d;
    }

    @Override // com.google.android.gms.internal.ads.vb2
    public final long e() {
        return this.f18986e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vb2)) {
            return false;
        }
        vb2 vb2Var = (vb2) obj;
        return this.f18982a.equals(vb2Var.a()) && this.f18983b == vb2Var.b() && this.f18984c == vb2Var.c() && this.f18985d == vb2Var.d() && this.f18986e == vb2Var.e();
    }

    public final int hashCode() {
        return ((((((((((((this.f18982a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f18983b ? 1237 : 1231)) * 1000003) ^ (true != this.f18984c ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.f18985d)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.f18986e);
    }

    public final String toString() {
        boolean z10 = this.f18983b;
        int length = String.valueOf(z10).length();
        boolean z11 = this.f18984c;
        int length2 = String.valueOf(z11).length();
        long j10 = this.f18985d;
        int length3 = String.valueOf(j10).length();
        long j11 = this.f18986e;
        int length4 = String.valueOf(j11).length();
        String str = this.f18982a;
        StringBuilder sb2 = new StringBuilder(str.length() + 56 + length + 32 + length2 + 57 + length3 + 61 + length4 + 1);
        sb2.append("AdShield2Options{clientVersion=");
        sb2.append(str);
        sb2.append(", shouldGetAdvertisingId=");
        sb2.append(z10);
        sb2.append(", isGooglePlayServicesAvailable=");
        sb2.append(z11);
        sb2.append(", enableQuerySignalsTimeout=false, querySignalsTimeoutMs=");
        sb2.append(j10);
        sb2.append(", enableQuerySignalsCache=false, querySignalsCacheTtlSeconds=");
        sb2.append(j11);
        sb2.append("}");
        return sb2.toString();
    }
}
