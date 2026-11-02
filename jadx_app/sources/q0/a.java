package q0;

import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class a {

    public static final class b {
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Signature f33249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Cipher f33250b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Mac f33251c;

        public c(Signature signature) {
            this.f33249a = signature;
            this.f33250b = null;
            this.f33251c = null;
        }

        public c(Cipher cipher) {
            this.f33250b = cipher;
            this.f33249a = null;
            this.f33251c = null;
        }

        public c(Mac mac) {
            this.f33251c = mac;
            this.f33250b = null;
            this.f33249a = null;
        }
    }

    /* JADX INFO: renamed from: q0.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0234a {
        public void onAuthenticationFailed() {
        }

        public void onAuthenticationSucceeded(b bVar) {
        }

        public void onAuthenticationError(int i10, CharSequence charSequence) {
        }

        public void onAuthenticationHelp(int i10, CharSequence charSequence) {
        }
    }
}
