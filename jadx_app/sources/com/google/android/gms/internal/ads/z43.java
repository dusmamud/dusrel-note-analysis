package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class z43 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f20028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f20029b;

    public /* synthetic */ z43(Class cls, Class cls2) {
        this.f20028a = cls;
        this.f20029b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z43)) {
            return false;
        }
        z43 z43Var = (z43) obj;
        return z43Var.f20028a.equals(this.f20028a) && z43Var.f20029b.equals(this.f20029b);
    }

    public final int hashCode() {
        return Objects.hash(this.f20028a, this.f20029b);
    }

    public final String toString() {
        String simpleName = this.f20028a.getSimpleName();
        String simpleName2 = this.f20029b.getSimpleName();
        return com.google.android.recaptcha.internal.d.b(new StringBuilder(simpleName.length() + 22 + simpleName2.length()), simpleName, " with primitive type: ", simpleName2);
    }
}
