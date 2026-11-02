package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class wi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f18565a = StandardCharsets.UTF_8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Cipher f18566b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f18567c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f18568d = new Object();

    public static byte[] a(String str, byte[] bArr) throws vi2 {
        byte[] bArrDoFinal;
        int length = bArr.length;
        try {
            byte[] bArrA = mg2.a(str, false);
            int length2 = bArrA.length;
            if (length2 <= 16) {
                throw new vi2();
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(bArrA);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f18567c) {
                b().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                bArrDoFinal = b().doFinal(bArr3);
            }
            return bArrDoFinal;
        } catch (IllegalArgumentException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e10) {
            throw new vi2(e10);
        }
    }

    public static final Cipher b() throws NoSuchPaddingException, NoSuchAlgorithmException {
        Cipher cipher;
        synchronized (f18568d) {
            try {
                if (f18566b == null) {
                    f18566b = Cipher.getInstance("AES/CBC/PKCS5Padding");
                }
                cipher = f18566b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cipher;
    }
}
