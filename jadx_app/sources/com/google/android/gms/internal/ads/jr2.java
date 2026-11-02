package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class jr2<K, V> implements mt2<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient Set f11481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient Collection f11482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient Map f11483c;

    public abstract Collection a();

    public abstract Map b();

    public boolean c(Object obj) {
        Iterator<V> it = zzu().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mt2) {
            return zzu().equals(((mt2) obj).zzu());
        }
        return false;
    }

    public final int hashCode() {
        return zzu().hashCode();
    }

    public final String toString() {
        return zzu().toString();
    }

    @Override // com.google.android.gms.internal.ads.mt2
    public Map zzu() {
        Map map = this.f11483c;
        if (map != null) {
            return map;
        }
        Map mapB = b();
        this.f11483c = mapB;
        return mapB;
    }
}
