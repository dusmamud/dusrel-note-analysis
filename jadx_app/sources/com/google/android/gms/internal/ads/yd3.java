package com.google.android.gms.internal.ads;

import java.security.NoSuchAlgorithmException;
import java.security.spec.ECParameterSpec;

/* JADX INFO: loaded from: classes.dex */
public final class yd3 {
    public static ECParameterSpec a(vd3 vd3Var) throws NoSuchAlgorithmException {
        int iOrdinal = vd3Var.ordinal();
        if (iOrdinal == 0) {
            return i33.f10592a;
        }
        if (iOrdinal == 1) {
            return i33.f10593b;
        }
        if (iOrdinal == 2) {
            return i33.f10594c;
        }
        throw new NoSuchAlgorithmException("curve not implemented:".concat(vd3Var.toString()));
    }

    public static byte[] b(byte[] bArr) {
        int length;
        int i10 = 0;
        while (true) {
            length = bArr.length;
            if (i10 >= length || bArr[i10] != 0) {
                break;
            }
            i10++;
        }
        if (i10 == length) {
            i10 = length - 1;
        }
        int i11 = (bArr[i10] & 128) == 128 ? 1 : 0;
        int i12 = length - i10;
        byte[] bArr2 = new byte[i12 + i11];
        System.arraycopy(bArr, i10, bArr2, i11, i12);
        return bArr2;
    }
}
