package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class l53 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f12208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f12209b;

    public /* synthetic */ l53(Class cls, Class cls2) {
        this.f12208a = cls;
        this.f12209b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l53)) {
            return false;
        }
        l53 l53Var = (l53) obj;
        return l53Var.f12208a.equals(this.f12208a) && l53Var.f12209b.equals(this.f12209b);
    }

    public final int hashCode() {
        return Objects.hash(this.f12208a, this.f12209b);
    }

    public final String toString() {
        String simpleName = this.f12208a.getSimpleName();
        String simpleName2 = this.f12209b.getSimpleName();
        return com.google.android.recaptcha.internal.d.b(new StringBuilder(simpleName.length() + 26 + simpleName2.length()), simpleName, " with serialization type: ", simpleName2);
    }
}
