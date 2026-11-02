package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class qn3 implements vn3, on3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f14944c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile vn3 f14945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f14946b = f14944c;

    public qn3(vn3 vn3Var) {
        this.f14945a = vn3Var;
    }

    public static qn3 a(vn3 vn3Var) {
        return vn3Var instanceof qn3 ? (qn3) vn3Var : new qn3(vn3Var);
    }

    public static on3 b(vn3 vn3Var) {
        if (vn3Var instanceof on3) {
            return (on3) vn3Var;
        }
        vn3Var.getClass();
        return new qn3(vn3Var);
    }

    @Override // com.google.android.gms.internal.ads.yn3
    public final Object zzb() {
        Object obj = this.f14946b;
        Object obj2 = f14944c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                Object obj3 = this.f14946b;
                if (obj3 != obj2) {
                    return obj3;
                }
                Object objZzb = this.f14945a.zzb();
                Object obj4 = this.f14946b;
                if (obj4 != obj2 && obj4 != objZzb) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + objZzb + ". This is likely due to a circular dependency.");
                }
                this.f14946b = objZzb;
                this.f14945a = null;
                return objZzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
