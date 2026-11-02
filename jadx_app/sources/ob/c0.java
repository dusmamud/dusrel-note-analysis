package ob;

import com.google.firebase.auth.FirebaseAuthProvider;

/* JADX INFO: loaded from: classes2.dex */
public enum c0 {
    ANONYMOUS("anonymous"),
    OIDC("oidc"),
    GOOGLE("google"),
    SIGN_IN_WITH_APPLE("apple"),
    FACEBOOK("facebook"),
    FIREBASE(FirebaseAuthProvider.PROVIDER_ID);

    public static final a Companion = new a();
    private final String rawValue;

    public static final class a {
    }

    c0(String str) {
        this.rawValue = str;
    }

    public final String a() {
        return this.rawValue;
    }
}
