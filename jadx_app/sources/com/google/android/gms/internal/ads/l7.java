package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class l7 implements fb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12222a;

    public l7(long j10) {
        this.f12222a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && l7.class == obj.getClass() && this.f12222a == ((l7) obj).f12222a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f12222a) + 527;
    }

    public final String toString() {
        long j10 = this.f12222a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 38);
        sb2.append("ThumbnailMetadata: presentationTimeUs=");
        sb2.append(j10);
        return sb2.toString();
    }
}
