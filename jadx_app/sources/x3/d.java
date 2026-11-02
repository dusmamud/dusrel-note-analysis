package x3;

import f3.n;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long[] f36570d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f36571a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f36572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f36573c;

    public static long a(byte[] bArr, int i10, boolean z10) {
        long j10 = ((long) bArr[0]) & 255;
        if (z10) {
            j10 &= ~f36570d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (((long) bArr[i11]) & 255);
        }
        return j10;
    }

    public final long b(n nVar, boolean z10, boolean z11, int i10) throws IOException {
        int i11;
        int i12 = this.f36572b;
        byte[] bArr = this.f36571a;
        if (i12 == 0) {
            if (!nVar.a(bArr, 0, 1, z10)) {
                return -1L;
            }
            int i13 = bArr[0] & 255;
            int i14 = 0;
            while (true) {
                if (i14 >= 8) {
                    i11 = -1;
                    break;
                }
                if ((f36570d[i14] & ((long) i13)) != 0) {
                    i11 = i14 + 1;
                    break;
                }
                i14++;
            }
            this.f36573c = i11;
            if (i11 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f36572b = 1;
        }
        int i15 = this.f36573c;
        if (i15 > i10) {
            this.f36572b = 0;
            return -2L;
        }
        if (i15 != 1) {
            nVar.readFully(bArr, 1, i15 - 1);
        }
        this.f36572b = 0;
        return a(bArr, this.f36573c, z11);
    }
}
