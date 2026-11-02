package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes.dex */
public final class b2 extends a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20488a;

    public b2(Object obj) {
        this.f20488a = obj;
    }

    @Override // com.google.android.gms.internal.auth.a2
    public final Object a() {
        return this.f20488a;
    }

    @Override // com.google.android.gms.internal.auth.a2
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b2) {
            return this.f20488a.equals(((b2) obj).f20488a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20488a.hashCode() + 1502476572;
    }

    public final String toString() {
        return j2.g.a("Optional.of(", this.f20488a.toString(), ")");
    }
}
