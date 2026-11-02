package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class kn2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f11911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wn2 f11912b;

    public kn2(wn2 wn2Var, Set set) {
        this.f11911a = set;
        this.f11912b = wn2Var;
    }

    public final HashMap a() {
        HashMap map = new HashMap();
        Iterator it = this.f11911a.iterator();
        while (it.hasNext()) {
            ((mn2) it.next()).b(map);
        }
        return map;
    }

    public final HashMap b(Context context, View view) {
        HashMap map = new HashMap();
        Iterator it = this.f11911a.iterator();
        while (it.hasNext()) {
            ((mn2) it.next()).c(map, context, view);
        }
        return map;
    }

    public final HashMap c() {
        HashMap map = new HashMap();
        Iterator it = this.f11911a.iterator();
        while (it.hasNext()) {
            ((mn2) it.next()).a(map);
        }
        return map;
    }
}
