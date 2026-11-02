package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class xr2 extends tt2 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f19342a = k.f11586a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f19342a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xr2) {
            return this.f19342a.equals(((xr2) obj).f19342a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19342a.hashCode();
    }

    public final String toString() {
        return this.f19342a.toString();
    }
}
