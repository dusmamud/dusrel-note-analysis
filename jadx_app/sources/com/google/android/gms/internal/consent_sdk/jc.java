package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes.dex */
public final class jc implements mc {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f20828c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile kc f20829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f20830b;

    /* JADX WARN: Multi-variable type inference failed */
    public static jc a(kc kcVar) {
        if (kcVar instanceof jc) {
            return (jc) kcVar;
        }
        jc jcVar = new jc();
        jcVar.f20830b = f20828c;
        jcVar.f20829a = kcVar;
        return jcVar;
    }

    @Override // com.google.android.gms.internal.consent_sdk.mc
    public final Object zzb() {
        Object obj = this.f20830b;
        Object obj2 = f20828c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                Object obj3 = this.f20830b;
                if (obj3 != obj2) {
                    return obj3;
                }
                Object objZzb = this.f20829a.zzb();
                Object obj4 = this.f20830b;
                if (obj4 != obj2 && obj4 != objZzb) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + objZzb + ". This is likely due to a circular dependency.");
                }
                this.f20830b = objZzb;
                this.f20829a = null;
                return objZzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
