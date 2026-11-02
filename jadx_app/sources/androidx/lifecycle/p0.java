package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2668a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f2668a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((n0) it.next()).clear$lifecycle_viewmodel();
        }
        linkedHashMap.clear();
    }
}
