package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wp2 implements Serializable, vp2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f18686a;

    public final boolean equals(Object obj) {
        if (obj instanceof wp2) {
            return this.f18686a.equals(((wp2) obj).f18686a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18686a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Predicates.and(");
        boolean z10 = true;
        for (Object obj : this.f18686a) {
            if (!z10) {
                sb2.append(',');
            }
            sb2.append(obj);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.vp2
    public final boolean zza(Object obj) {
        int i10 = 0;
        while (true) {
            List list = this.f18686a;
            if (i10 >= list.size()) {
                return true;
            }
            if (!((vp2) list.get(i10)).zza(obj)) {
                return false;
            }
            i10++;
        }
    }
}
