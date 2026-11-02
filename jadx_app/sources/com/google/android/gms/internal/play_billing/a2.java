package com.google.android.gms.internal.play_billing;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f22603a = new n0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Logger f22605c;

    public a2(Class cls) {
        this.f22604b = cls.getName();
    }

    public final Logger a() {
        Logger logger = this.f22605c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f22603a) {
            try {
                Logger logger2 = this.f22605c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f22604b);
                this.f22605c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
