package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class o53 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f13644a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static final se3 a(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < '!' || cCharAt > '~') {
                StringBuilder sb2 = new StringBuilder(String.valueOf(cCharAt).length() + 33);
                sb2.append("Not a printable ASCII character: ");
                sb2.append(cCharAt);
                throw new n53(sb2.toString());
            }
            bArr[i10] = (byte) cCharAt;
        }
        return se3.a(bArr);
    }

    public static final se3 b(String str) throws GeneralSecurityException {
        byte[] bArr = new byte[str.length()];
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < '!' || cCharAt > '~') {
                StringBuilder sb2 = new StringBuilder(String.valueOf(cCharAt).length() + 33);
                sb2.append("Not a printable ASCII character: ");
                sb2.append(cCharAt);
                throw new GeneralSecurityException(sb2.toString());
            }
            bArr[i10] = (byte) cCharAt;
        }
        return se3.a(bArr);
    }

    public static boolean c(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (bArr2[i10] != bArr[i10]) {
                return false;
            }
        }
        return true;
    }
}
