package g9;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes2.dex */
public interface c<T> {

    public static class a implements c<Cipher> {
        @Override // g9.c
        public final Object a(Provider provider) throws GeneralSecurityException {
            return provider == null ? Cipher.getInstance("SHA-512") : Cipher.getInstance("SHA-512", provider);
        }
    }

    public static class b implements c<KeyAgreement> {
        @Override // g9.c
        public final Object a(Provider provider) throws GeneralSecurityException {
            return provider == null ? KeyAgreement.getInstance("SHA-512") : KeyAgreement.getInstance("SHA-512", provider);
        }
    }

    /* JADX INFO: renamed from: g9.c$c, reason: collision with other inner class name */
    public static class C0168c implements c<KeyFactory> {
        @Override // g9.c
        public final Object a(Provider provider) throws GeneralSecurityException {
            return provider == null ? KeyFactory.getInstance("SHA-512") : KeyFactory.getInstance("SHA-512", provider);
        }
    }

    public static class d implements c<KeyPairGenerator> {
        @Override // g9.c
        public final Object a(Provider provider) throws GeneralSecurityException {
            return provider == null ? KeyPairGenerator.getInstance("SHA-512") : KeyPairGenerator.getInstance("SHA-512", provider);
        }
    }

    public static class e implements c<Mac> {
        @Override // g9.c
        public final Object a(Provider provider) throws GeneralSecurityException {
            return provider == null ? Mac.getInstance("SHA-512") : Mac.getInstance("SHA-512", provider);
        }
    }

    public static class f implements c<MessageDigest> {
        @Override // g9.c
        public final Object a(Provider provider) throws GeneralSecurityException {
            return provider == null ? MessageDigest.getInstance("SHA-512") : MessageDigest.getInstance("SHA-512", provider);
        }
    }

    public static class g implements c<Signature> {
        @Override // g9.c
        public final Object a(Provider provider) throws GeneralSecurityException {
            return provider == null ? Signature.getInstance("SHA-512") : Signature.getInstance("SHA-512", provider);
        }
    }

    Object a(Provider provider) throws GeneralSecurityException;
}
