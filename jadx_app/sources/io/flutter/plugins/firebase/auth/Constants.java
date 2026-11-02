package io.flutter.plugins.firebase.auth;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001d\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lio/flutter/plugins/firebase/auth/Constants;", "", "<init>", "()V", "APP_NAME", "", "SIGN_IN_METHOD_PASSWORD", "SIGN_IN_METHOD_EMAIL_LINK", "SIGN_IN_METHOD_FACEBOOK", "SIGN_IN_METHOD_GOOGLE", "SIGN_IN_METHOD_TWITTER", "SIGN_IN_METHOD_GITHUB", "SIGN_IN_METHOD_PHONE", "SIGN_IN_METHOD_OAUTH", "SIGN_IN_METHOD_PLAY_GAMES", "USER", "EMAIL", "PROVIDER_ID", "CREDENTIAL", "SECRET", "ID_TOKEN", "TOKEN", "ACCESS_TOKEN", "RAW_NONCE", "EMAIL_LINK", "VERIFICATION_ID", "SMS_CODE", "SIGN_IN_METHOD", "FORCE_RESENDING_TOKEN", "NAME", "SERVER_AUTH_CODE", "MULTI_FACTOR_HINTS", "MULTI_FACTOR_SESSION_ID", "MULTI_FACTOR_RESOLVER_ID", "firebase_auth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Constants {
    public static final String ACCESS_TOKEN = "accessToken";
    public static final String APP_NAME = "appName";
    public static final String CREDENTIAL = "credential";
    public static final String EMAIL = "email";
    public static final String EMAIL_LINK = "emailLink";
    public static final String FORCE_RESENDING_TOKEN = "forceResendingToken";
    public static final String ID_TOKEN = "idToken";
    public static final Constants INSTANCE = new Constants();
    public static final String MULTI_FACTOR_HINTS = "multiFactorHints";
    public static final String MULTI_FACTOR_RESOLVER_ID = "multiFactorResolverId";
    public static final String MULTI_FACTOR_SESSION_ID = "multiFactorSessionId";
    public static final String NAME = "name";
    public static final String PROVIDER_ID = "providerId";
    public static final String RAW_NONCE = "rawNonce";
    public static final String SECRET = "secret";
    public static final String SERVER_AUTH_CODE = "serverAuthCode";
    public static final String SIGN_IN_METHOD = "signInMethod";
    public static final String SIGN_IN_METHOD_EMAIL_LINK = "emailLink";
    public static final String SIGN_IN_METHOD_FACEBOOK = "facebook.com";
    public static final String SIGN_IN_METHOD_GITHUB = "github.com";
    public static final String SIGN_IN_METHOD_GOOGLE = "google.com";
    public static final String SIGN_IN_METHOD_OAUTH = "oauth";
    public static final String SIGN_IN_METHOD_PASSWORD = "password";
    public static final String SIGN_IN_METHOD_PHONE = "phone";
    public static final String SIGN_IN_METHOD_PLAY_GAMES = "playgames.google.com";
    public static final String SIGN_IN_METHOD_TWITTER = "twitter.com";
    public static final String SMS_CODE = "smsCode";
    public static final String TOKEN = "token";
    public static final String USER = "user";
    public static final String VERIFICATION_ID = "verificationId";

    private Constants() {
    }
}
