package com.google.android.recaptcha.internal;

import e2.k;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements k.a {
    public static int a(int i10, int i11, int i12) {
        return zzln.zzA(i10) + i11 + i12;
    }

    public static String b(StringBuilder sb2, String str, String str2, String str3) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2.toString();
    }

    public static StringBuilder c(int i10, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i10);
        sb2.append(str2);
        return sb2;
    }

    @Override // e2.k.a
    public void invoke(Object obj) {
        ((j2.b) obj).getClass();
    }
}
