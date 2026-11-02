package com.amazon.device.iap.internal.a;

/* JADX INFO: loaded from: classes.dex */
public class f extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f6189a = 3715222306172636179L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f6191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f6192d;

    public f(String str, String str2, String str3) {
        this.f6190b = str;
        this.f6191c = str2;
        this.f6192d = str3;
    }

    public String a() {
        return this.f6190b;
    }

    public String b() {
        return this.f6191c;
    }

    public String c() {
        return this.f6192d;
    }

    public f(String str, String str2, String str3, Throwable th) {
        super(th);
        this.f6190b = str;
        this.f6191c = str2;
        this.f6192d = str3;
    }
}
