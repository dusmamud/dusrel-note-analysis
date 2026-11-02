package com.google.android.gms.internal.mlkit_vision_document_scanner;

import com.google.android.recaptcha.internal.d;

/* JADX INFO: loaded from: classes2.dex */
final class zzq {
    public static void zza(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 != null) {
            return;
        }
        String string = obj.toString();
        throw new NullPointerException(d.b(new StringBuilder(string.length() + 26), "null value in entry: ", string, "=null"));
    }
}
