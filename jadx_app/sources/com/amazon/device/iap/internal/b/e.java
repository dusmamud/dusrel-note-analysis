package com.amazon.device.iap.internal.b;

import com.amazon.a.a.o.f;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e f6223b = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<String> f6224a = new ConcurrentSkipListSet();

    public boolean a(String str) {
        if (f.a(str)) {
            return false;
        }
        return this.f6224a.remove(str);
    }

    public void b(String str) {
        if (f.a(str)) {
            return;
        }
        this.f6224a.add(str);
    }

    public static e a() {
        return f6223b;
    }
}
