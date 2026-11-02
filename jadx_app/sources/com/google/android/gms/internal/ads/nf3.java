package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class nf3 implements CharSequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char[] f13305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f13306b;

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f13305a[i10];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f13305a.length;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        return new String(this.f13305a, i10, i11 - i10);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        if (this.f13306b == null) {
            this.f13306b = new String(this.f13305a);
        }
        return this.f13306b;
    }
}
