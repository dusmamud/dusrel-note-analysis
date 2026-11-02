package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ig1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ls3 f10758b = new ls3();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10760d;

    public ig1(Object obj) {
        this.f10757a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ig1.class != obj.getClass()) {
            return false;
        }
        return this.f10757a.equals(((ig1) obj).f10757a);
    }

    public final int hashCode() {
        return this.f10757a.hashCode();
    }
}
