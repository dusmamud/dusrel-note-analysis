package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class cs extends tj3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MessageDigest f8024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8026e;

    public cs(int i10) {
        super(2);
        int i11 = i10 >> 3;
        this.f8025d = (i10 & 7) > 0 ? i11 + 1 : i11;
        this.f8026e = i10;
    }

    public final byte[] q(String str) {
        synchronized (this.f16432a) {
            try {
                MessageDigest messageDigestC = c();
                this.f8024c = messageDigestC;
                if (messageDigestC == null) {
                    return new byte[0];
                }
                messageDigestC.reset();
                this.f8024c.update(str.getBytes(StandardCharsets.UTF_8));
                byte[] bArrDigest = this.f8024c.digest();
                int length = bArrDigest.length;
                int i10 = this.f8025d;
                if (length > i10) {
                    length = i10;
                }
                byte[] bArr = new byte[length];
                System.arraycopy(bArrDigest, 0, bArr, 0, length);
                int i11 = this.f8026e & 7;
                if (i11 > 0) {
                    long j10 = 0;
                    for (int i12 = 0; i12 < length; i12++) {
                        if (i12 > 0) {
                            j10 <<= 8;
                        }
                        j10 += (long) (bArr[i12] & 255);
                    }
                    long j11 = j10 >>> (8 - i11);
                    while (true) {
                        i10--;
                        if (i10 < 0) {
                            break;
                        }
                        bArr[i10] = (byte) (255 & j11);
                        j11 >>>= 8;
                    }
                }
                return bArr;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
