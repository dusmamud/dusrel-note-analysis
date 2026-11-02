package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class j23 extends k23 {
    @Override // com.google.android.gms.internal.ads.k23
    public final int[] a(int i10, int[] iArr) {
        int length = iArr.length;
        if (length != 3) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        int[] iArr3 = i23.f10580a;
        int length2 = iArr3.length;
        System.arraycopy(iArr3, 0, iArr2, 0, length2);
        System.arraycopy(this.f11612a, 0, iArr2, length2, 8);
        iArr2[12] = i10;
        System.arraycopy(iArr, 0, iArr2, 13, 3);
        return iArr2;
    }

    @Override // com.google.android.gms.internal.ads.k23
    public final int b() {
        return 12;
    }
}
