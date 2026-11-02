package ke;

import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mac f30203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ByteArrayOutputStream f30205c = new ByteArrayOutputStream(4096);

    public a() {
        try {
            Mac mac = Mac.getInstance("HmacSHA1");
            this.f30203a = mac;
            this.f30204b = mac.getMacLength();
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void a(int i10) {
        ByteArrayOutputStream byteArrayOutputStream = this.f30205c;
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length - i10;
        int i11 = 0;
        while (i11 < length) {
            int i12 = i11 + 16;
            this.f30203a.update(byteArray, i11, i12 <= length ? 16 : length - i11);
            i11 = i12;
        }
        byteArrayOutputStream.reset();
    }

    public final void b(byte[] bArr) {
        try {
            this.f30203a.init(new SecretKeySpec(bArr, "HmacSHA1"));
        } catch (InvalidKeyException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void c(byte[] bArr, int i10, int i11) {
        ByteArrayOutputStream byteArrayOutputStream = this.f30205c;
        try {
            if (byteArrayOutputStream.size() + i11 > 4096) {
                a(0);
            }
            byteArrayOutputStream.write(bArr, i10, i11);
        } catch (IllegalStateException e10) {
            throw new RuntimeException(e10);
        }
    }
}
