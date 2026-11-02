package com.google.android.gms.internal.p000firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
public final class h8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f21508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21509b;

    public h8(int i10, l9 l9Var) {
        this.f21508a = l9Var;
        this.f21509b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h8)) {
            return false;
        }
        h8 h8Var = (h8) obj;
        return this.f21508a == h8Var.f21508a && this.f21509b == h8Var.f21509b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f21508a) * 65535) + this.f21509b;
    }
}
