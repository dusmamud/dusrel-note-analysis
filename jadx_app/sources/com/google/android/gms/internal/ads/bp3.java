package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f7351a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public lo3 f7352b = lo3.f12501b;

    public /* synthetic */ bp3(kp3 kp3Var) {
    }

    public static final lo3 b(lo3 lo3Var, List list) {
        HashMap map = new HashMap(lo3Var.f12502a);
        HashSet hashSet = new HashSet(list);
        for (String str : lo3Var.f12502a.keySet()) {
            if (!hashSet.contains(str)) {
                map.remove(str);
            }
        }
        return new lo3(map);
    }

    public final /* synthetic */ void a(lo3 lo3Var) {
        for (Map.Entry entry : new HashMap(this.f7351a).entrySet()) {
            mo3 mo3Var = (mo3) entry.getKey();
            List list = (List) entry.getValue();
            if (!b(lo3Var, list).equals(b(this.f7352b, list))) {
                mo3Var.zza();
            }
        }
        this.f7352b = lo3Var;
    }
}
