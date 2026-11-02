package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class i42 implements g42 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10603a;

    public i42(String str) {
        this.f10603a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i42) {
            return this.f10603a.equals(((i42) obj).f10603a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10603a.hashCode();
    }

    public final String toString() {
        return this.f10603a;
    }
}
