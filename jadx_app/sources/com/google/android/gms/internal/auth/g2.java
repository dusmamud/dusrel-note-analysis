package com.google.android.gms.internal.auth;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class g2 implements Serializable, c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20537a;

    public g2(Object obj) {
        this.f20537a = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g2)) {
            return false;
        }
        Object obj2 = ((g2) obj).f20537a;
        Object obj3 = this.f20537a;
        return obj3 == obj2 || obj3.equals(obj2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f20537a});
    }

    public final String toString() {
        return j2.g.a("Suppliers.ofInstance(", this.f20537a.toString(), ")");
    }

    @Override // com.google.android.gms.internal.auth.c2
    public final Object zza() {
        return this.f20537a;
    }
}
