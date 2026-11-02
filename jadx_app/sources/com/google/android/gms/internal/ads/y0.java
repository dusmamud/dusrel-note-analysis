package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class y0 extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    public y0(Throwable th) {
        String simpleName = th.getClass().getSimpleName();
        String strConcat = th.getMessage() != null ? ": ".concat(String.valueOf(th.getMessage())) : "";
        super(com.google.android.recaptcha.internal.d.b(new StringBuilder(strConcat.length() + simpleName.length() + 11), "Unexpected ", simpleName, strConcat), th);
    }
}
