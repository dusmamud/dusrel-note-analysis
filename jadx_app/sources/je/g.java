package je;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final le.b f29444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f29445b;

    public g(char[] cArr, long j10) throws me.a {
        le.b bVar = new le.b();
        this.f29444a = bVar;
        if (cArr == null || cArr.length <= 0) {
            throw new me.a("input password is null or empty, cannot initialize standard encrypter");
        }
        bVar.b(cArr);
        byte[] bArr = new byte[12];
        SecureRandom secureRandom = new SecureRandom();
        for (int i10 = 0; i10 < 12; i10++) {
            byte bNextInt = (byte) secureRandom.nextInt(256);
            le.b bVar2 = this.f29444a;
            byte bA = (byte) ((bVar2.a() & 255) ^ bNextInt);
            bVar2.c(bNextInt);
            bArr[i10] = bA;
        }
        this.f29445b = bArr;
        bVar.b(cArr);
        byte[] bArr2 = this.f29445b;
        bArr2[11] = (byte) (j10 >>> 24);
        bArr2[10] = (byte) (j10 >>> 16);
        a(bArr2, 0, bArr2.length);
    }

    @Override // je.e
    public final int a(byte[] bArr, int i10, int i11) throws me.a {
        if (i11 < 0) {
            throw new me.a("invalid length specified to decrpyt data");
        }
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            byte b10 = bArr[i12];
            le.b bVar = this.f29444a;
            byte bA = (byte) ((bVar.a() & 255) ^ b10);
            bVar.c(b10);
            bArr[i12] = bA;
        }
        return i11;
    }
}
