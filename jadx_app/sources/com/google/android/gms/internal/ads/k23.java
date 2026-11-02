package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes.dex */
public abstract class k23 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f11612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11613b;

    public k23(byte[] bArr, int i10) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f11612a = i23.c(bArr);
        this.f11613b = i10;
    }

    public abstract int[] a(int i10, int[] iArr);

    public abstract int b();

    public final ByteBuffer c(byte[] bArr, int i10) {
        int[] iArrA = a(i10, i23.c(bArr));
        int[] iArr = (int[]) iArrA.clone();
        i23.a(iArr);
        for (int i11 = 0; i11 < 16; i11++) {
            iArrA[i11] = iArrA[i11] + iArr[i11];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrA, 0, 16);
        return byteBufferOrder;
    }
}
