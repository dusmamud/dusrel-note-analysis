package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes.dex */
public final class z1 extends a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z1 f20693a = new z1();

    @Override // com.google.android.gms.internal.auth.a2
    public final Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.android.gms.internal.auth.a2
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
