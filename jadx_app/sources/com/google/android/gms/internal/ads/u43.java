package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u43 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final se3 f16767b = se3.a(new byte[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f16768a;

    public final Iterable a(byte[] bArr) {
        List list;
        se3 se3Var = f16767b;
        HashMap map = this.f16768a;
        List list2 = (List) map.get(se3Var);
        if (bArr.length >= 5) {
            int length = bArr.length;
            list = (List) map.get(new se3(bArr, 5 > length ? length : 5));
        } else {
            list = null;
        }
        if (list2 == null && list == null) {
            return new ArrayList();
        }
        if (list2 == null) {
            return list;
        }
        return list == null ? list2 : new s43(this, list, list2);
    }
}
