package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f22798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f22799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f22800c;

    public t0(Object obj, Object obj2, Object obj3) {
        this.f22798a = obj;
        this.f22799b = obj2;
        this.f22800c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f22798a;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.f22799b);
        return new IllegalArgumentException(com.google.android.recaptcha.internal.d.b(b2.d0.a("Multiple entries with same key: ", strValueOf, com.amazon.a.a.o.b.f.f5856b, strValueOf2, " and "), String.valueOf(obj), com.amazon.a.a.o.b.f.f5856b, String.valueOf(this.f22800c)));
    }
}
