package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cl<P> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f21258b = r.a(new byte[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f21259a;

    public cl(HashMap map) {
        this.f21259a = map;
    }

    public final Iterable<P> a(byte[] bArr) {
        List list;
        r rVar = f21258b;
        HashMap map = this.f21259a;
        List list2 = (List) map.get(rVar);
        if (bArr.length >= 5) {
            list = (List) map.get(new r(bArr, 5 > bArr.length ? bArr.length : 5));
        } else {
            list = null;
        }
        if (list2 == null && list == null) {
            return new ArrayList();
        }
        if (list2 == null) {
            return list;
        }
        return list == null ? list2 : new bl(this, list, list2);
    }
}
