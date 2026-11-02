package k9;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f30182a = {0, 0, 0, 1};

    public static byte[] a(int i10, byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException, InvalidKeyException {
        if (i10 < 1) {
            throw new IllegalArgumentException("iterations must be positive");
        }
        if (bArr.length == 0) {
            throw new IllegalArgumentException("password must not be empty");
        }
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
        mac.update(bArr2);
        byte[] bArrDoFinal = mac.doFinal(f30182a);
        kotlin.jvm.internal.j.b(bArrDoFinal);
        byte[] bArrCopyOf = Arrays.copyOf(bArrDoFinal, bArrDoFinal.length);
        kotlin.jvm.internal.j.d(bArrCopyOf, "copyOf(...)");
        for (int i11 = 1; i11 < i10; i11++) {
            bArrDoFinal = mac.doFinal(bArrDoFinal);
            int length = bArrCopyOf.length;
            for (int i12 = 0; i12 < length; i12++) {
                bArrCopyOf[i12] = (byte) (bArrCopyOf[i12] ^ bArrDoFinal[i12]);
            }
        }
        return bArrCopyOf;
    }
}
