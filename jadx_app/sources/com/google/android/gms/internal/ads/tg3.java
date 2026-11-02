package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class tg3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile tg3 f16402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final tg3 f16403c = new tg3(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f16404a;

    public tg3() {
        this.f16404a = new HashMap();
    }

    public static tg3 a() {
        tg3 tg3Var = f16402b;
        if (tg3Var != null) {
            return tg3Var;
        }
        synchronized (tg3.class) {
            try {
                tg3 tg3Var2 = f16402b;
                if (tg3Var2 != null) {
                    return tg3Var2;
                }
                int i10 = xf3.f19066a;
                tg3 tg3VarB = bh3.b();
                f16402b = tg3VarB;
                return tg3VarB;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public tg3(int i10) {
        this.f16404a = Collections.EMPTY_MAP;
    }
}
