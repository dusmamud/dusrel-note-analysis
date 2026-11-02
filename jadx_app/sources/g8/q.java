package g8;

import android.util.Base64;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SecureRandom f27283a = new SecureRandom();

    public static String a() {
        byte[] bArr = new byte[16];
        f27283a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
