package com.google.android.gms.internal.ads;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes.dex */
public final class mf3 {
    public static BigDecimal a(String str) throws NumberFormatException {
        b(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(str));
    }

    public static void b(String str) {
        if (str.length() <= 10000) {
            return;
        }
        String strSubstring = str.substring(0, 30);
        throw new NumberFormatException(com.google.android.recaptcha.internal.d.b(new StringBuilder(String.valueOf(strSubstring).length() + 28), "Number string too large: ", strSubstring, "..."));
    }
}
