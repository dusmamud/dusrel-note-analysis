package je;

import androidx.biometric.BiometricManager;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public le.b f29443a;

    @Override // je.d
    public final int a(byte[] bArr, int i10, int i11) throws me.a {
        le.b bVar = this.f29443a;
        if (i10 < 0 || i11 < 0) {
            throw new me.a("one of the input parameters were null in standard decrypt data");
        }
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            byte bA = (byte) (((bArr[i12] & 255) ^ bVar.a()) & BiometricManager.Authenticators.BIOMETRIC_WEAK);
            bVar.c(bA);
            bArr[i12] = bA;
        }
        return i11;
    }
}
