package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class x9 implements t5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x9 f18931b = new x9(true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x9 f18932c = new x9(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18933a;

    public x9(boolean z10) {
        this.f18933a = z10;
    }

    public final String toString() {
        boolean z10 = !this.f18933a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(z10).length() + 33);
        sb2.append("IncorrectFragmentation{expected=");
        sb2.append(z10);
        sb2.append("}");
        return sb2.toString();
    }
}
