package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public class ez {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8973c;

    public ez(String str, int i10, Object obj) {
        this.f8971a = str;
        this.f8972b = obj;
        this.f8973c = i10;
    }

    public static ez a(String str, boolean z10) {
        return new ez(str, 1, Boolean.valueOf(z10));
    }

    public static ez b(long j10, String str) {
        return new ez(str, 2, Long.valueOf(j10));
    }

    public final Object c() {
        i00 i00Var = (i00) k00.f11588a.get();
        Object obj = this.f8972b;
        if (i00Var == null) {
            if (k00.a() != null) {
                k00.a().zza();
            }
            return obj;
        }
        int i10 = this.f8973c - 1;
        String str = this.f8971a;
        if (i10 == 0) {
            return i00Var.d(str, ((Boolean) obj).booleanValue());
        }
        if (i10 != 1) {
            return i10 != 2 ? i00Var.a(str, (String) obj) : i00Var.c(str, ((Double) obj).doubleValue());
        }
        return i00Var.b(((Long) obj).longValue(), str);
    }
}
