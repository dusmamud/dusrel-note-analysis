package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class cu2 extends tt2 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tt2 f8042a;

    public cu2(tt2 tt2Var) {
        this.f8042a = tt2Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f8042a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cu2) {
            return this.f8042a.equals(((cu2) obj).f8042a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f8042a.hashCode();
    }

    public final String toString() {
        return this.f8042a.toString().concat(".reverse()");
    }
}
