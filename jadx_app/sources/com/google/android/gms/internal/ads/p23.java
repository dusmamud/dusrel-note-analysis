package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class p23 implements my2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final my2 f14143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f14144b;

    public p23(my2 my2Var, byte[] bArr) {
        this.f14143a = my2Var;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.f14144b = bArr;
    }

    @Override // com.google.android.gms.internal.ads.my2
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f14144b;
        int length = bArr3.length;
        my2 my2Var = this.f14143a;
        if (length == 0) {
            return my2Var.a(bArr, bArr2);
        }
        if (o53.c(bArr3, bArr)) {
            return my2Var.a(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
