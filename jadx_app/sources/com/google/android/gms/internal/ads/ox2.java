package com.google.android.gms.internal.ads;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class ox2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nq2 f14039a = new nq2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Logger f14041c;

    public ox2(Class cls) {
        this.f14040b = cls.getName();
    }

    public final Logger a() {
        Logger logger = this.f14041c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f14039a) {
            try {
                Logger logger2 = this.f14041c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f14040b);
                this.f14041c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
