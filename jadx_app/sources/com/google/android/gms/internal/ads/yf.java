package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class yf extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19667b;

    public yf(String str, Throwable th, boolean z10, int i10) {
        super(str, th);
        this.f19666a = z10;
        this.f19667b = i10;
    }

    public static yf a(RuntimeException runtimeException, String str) {
        return new yf(str, runtimeException, true, 1);
    }

    public static yf b(String str) {
        return new yf(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        String strConcat = message != null ? message.concat(" ") : "";
        int length = strConcat.length();
        boolean z10 = this.f19666a;
        int length2 = String.valueOf(z10).length() + length + 20;
        int i10 = this.f19667b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + length2 + 11 + 1);
        sb2.append(strConcat);
        sb2.append("{contentIsMalformed=");
        sb2.append(z10);
        sb2.append(", dataType=");
        return b0.f.c(i10, "}", sb2);
    }
}
