package com.google.android.gms.internal.ads;

import java.security.spec.ECParameterSpec;

/* JADX INFO: loaded from: classes.dex */
public final class ab3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ab3 f6619c = new ab3("NIST_P256", i33.f10592a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ab3 f6620d = new ab3("NIST_P384", i33.f10593b);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ab3 f6621e = new ab3("NIST_P521", i33.f10594c);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ECParameterSpec f6623b;

    public ab3(String str, ECParameterSpec eCParameterSpec) {
        this.f6622a = str;
        this.f6623b = eCParameterSpec;
    }

    public final String toString() {
        return this.f6622a;
    }
}
