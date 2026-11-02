package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ue3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ue3 f16928d = new ue3("", "", false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f16931c;

    static {
        new ue3("\n", "  ", true);
    }

    public ue3(String str, String str2, boolean z10) {
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f16929a = str;
        this.f16930b = str2;
        this.f16931c = z10;
    }
}
