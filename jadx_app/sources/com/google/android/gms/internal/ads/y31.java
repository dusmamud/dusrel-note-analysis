package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class y31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f19492a = new HashMap();

    public y31(Set set) {
        synchronized (this) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                d51 d51Var = (d51) it.next();
                synchronized (this) {
                    X(d51Var.f8166a, d51Var.f8167b);
                }
            }
        }
    }

    public final synchronized void X(Object obj, Executor executor) {
        this.f19492a.put(obj, executor);
    }

    public final synchronized void g0(x31 x31Var) {
        for (Map.Entry entry : this.f19492a.entrySet()) {
            ((Executor) entry.getValue()).execute(new o70(2, x31Var, entry.getKey()));
        }
    }
}
