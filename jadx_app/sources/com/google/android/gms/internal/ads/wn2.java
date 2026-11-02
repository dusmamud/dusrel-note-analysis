package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class wn2 implements mn2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f18669a = new ArrayList();

    @Override // com.google.android.gms.internal.ads.mn2
    public final synchronized void c(HashMap map, Context context, View view) {
        ArrayList arrayList = this.f18669a;
        map.put("vst", new ArrayList(arrayList));
        arrayList.clear();
    }

    @Override // com.google.android.gms.internal.ads.mn2
    public final void a(HashMap map) {
    }

    @Override // com.google.android.gms.internal.ads.mn2
    public final void b(HashMap map) {
    }
}
