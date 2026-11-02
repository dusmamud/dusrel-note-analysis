package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class mr2 {
    public static void a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 != null) {
            return;
        }
        String string = obj.toString();
        throw new NullPointerException(com.google.android.recaptcha.internal.d.b(new StringBuilder(string.length() + 26), "null value in entry: ", string, "=null"));
    }

    public static void b(int i10, String str) {
        if (i10 >= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 29 + String.valueOf(i10).length());
        sb2.append(str);
        sb2.append(" cannot be negative but was: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }
}
