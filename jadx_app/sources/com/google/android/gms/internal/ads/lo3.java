package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class lo3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final lo3 f12501b = new lo3(new HashMap());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f12502a;

    public /* synthetic */ lo3(HashMap map) {
        this.f12502a = Collections.unmodifiableMap(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lo3) {
            return this.f12502a.equals(((lo3) obj).f12502a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12502a.hashCode();
    }
}
