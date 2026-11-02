package com.google.android.gms.internal.auth;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class d2 implements Serializable, c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f20510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile transient boolean f20511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient Object f20512c;

    public d2(c2 c2Var) {
        this.f20510a = c2Var;
    }

    public final String toString() {
        return j2.g.a("Suppliers.memoize(", (this.f20511b ? j2.g.a("<supplier that returned ", String.valueOf(this.f20512c), ">") : this.f20510a).toString(), ")");
    }

    @Override // com.google.android.gms.internal.auth.c2
    public final Object zza() {
        if (!this.f20511b) {
            synchronized (this) {
                try {
                    if (!this.f20511b) {
                        Object objZza = this.f20510a.zza();
                        this.f20512c = objZza;
                        this.f20511b = true;
                        return objZza;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f20512c;
    }
}
