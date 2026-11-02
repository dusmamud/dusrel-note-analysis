package com.amazon.a.a.d;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f5511a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f5513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f5514d;

    public b(String str) {
        this(str, (String) null);
    }

    public final String a() {
        return this.f5512b;
    }

    public final String b() {
        return this.f5513c;
    }

    public final String c() {
        return this.f5514d;
    }

    public b(String str, String str2) {
        this(str, str2, (String) null);
    }

    private static String a(Throwable th) {
        if (th == null) {
            return null;
        }
        Throwable thC = c(th);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b(th));
        sb2.append(":");
        sb2.append(th.getMessage());
        if (th != thC) {
            sb2.append(DomExceptionUtils.SEPARATOR);
            sb2.append(b(thC));
            sb2.append(":");
            sb2.append(thC.getMessage());
        }
        return sb2.toString();
    }

    private static String b(Throwable th) {
        return th.getClass().getName();
    }

    private static Throwable c(Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    public b(String str, String str2, String str3) {
        super(str + ": " + str2 + ": " + str3);
        this.f5512b = str;
        this.f5513c = str2;
        this.f5514d = str3;
    }

    public b(String str, Throwable th) {
        this(str, b(th), th);
    }

    public b(String str, String str2, Throwable th) {
        this(str, str2, a(th));
    }
}
