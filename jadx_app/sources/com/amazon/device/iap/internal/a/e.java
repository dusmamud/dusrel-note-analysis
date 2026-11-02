package com.amazon.device.iap.internal.a;

/* JADX INFO: loaded from: classes.dex */
public class e extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f6179a = 7955687159702952249L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f6181c;

    public e(String str, String str2) {
        this.f6180b = str;
        this.f6181c = str2;
    }

    public String a() {
        return this.f6180b;
    }

    public String b() {
        return this.f6181c;
    }

    public e(String str, String str2, Throwable th) {
        super(th);
        this.f6180b = str;
        this.f6181c = str2;
    }
}
