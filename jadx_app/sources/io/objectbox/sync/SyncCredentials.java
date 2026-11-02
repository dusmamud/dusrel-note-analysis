package io.objectbox.sync;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SyncCredentials {
    private final CredentialsType type;

    public enum CredentialsType {
        NONE(1),
        GOOGLE(3),
        SHARED_SECRET_SIPPED(4),
        OBX_ADMIN_USER(5),
        USER_PASSWORD(6),
        JWT_ID_TOKEN(7),
        JWT_ACCESS_TOKEN(8),
        JWT_REFRESH_TOKEN(9),
        JWT_CUSTOM_TOKEN(10);


        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public final long f28979id;

        CredentialsType(long j10) {
            this.f28979id = j10;
        }
    }

    public SyncCredentials(CredentialsType credentialsType) {
        this.type = credentialsType;
    }

    public static SyncCredentials google(String str) {
        return new SyncCredentialsToken(CredentialsType.GOOGLE, str);
    }

    public static SyncCredentials jwtAccessToken(String str) {
        return new SyncCredentialsToken(CredentialsType.JWT_ACCESS_TOKEN, str);
    }

    public static SyncCredentials jwtAccessTokenServer() {
        return new SyncCredentialsToken(CredentialsType.JWT_ACCESS_TOKEN);
    }

    public static SyncCredentials jwtCustomToken(String str) {
        return new SyncCredentialsToken(CredentialsType.JWT_CUSTOM_TOKEN, str);
    }

    public static SyncCredentials jwtCustomTokenServer() {
        return new SyncCredentialsToken(CredentialsType.JWT_CUSTOM_TOKEN);
    }

    public static SyncCredentials jwtIdToken(String str) {
        return new SyncCredentialsToken(CredentialsType.JWT_ID_TOKEN, str);
    }

    public static SyncCredentials jwtIdTokenServer() {
        return new SyncCredentialsToken(CredentialsType.JWT_ID_TOKEN);
    }

    public static SyncCredentials jwtRefreshToken(String str) {
        return new SyncCredentialsToken(CredentialsType.JWT_REFRESH_TOKEN, str);
    }

    public static SyncCredentials jwtRefreshTokenServer() {
        return new SyncCredentialsToken(CredentialsType.JWT_REFRESH_TOKEN);
    }

    public static SyncCredentials none() {
        return new SyncCredentialsToken(CredentialsType.NONE);
    }

    public static SyncCredentials obxAdminUser(String str, String str2) {
        return new SyncCredentialsUserPassword(CredentialsType.OBX_ADMIN_USER, str, str2);
    }

    public static SyncCredentials sharedSecret(String str) {
        return new SyncCredentialsToken(CredentialsType.SHARED_SECRET_SIPPED, str);
    }

    public static SyncCredentials userAndPassword(String str, String str2) {
        return new SyncCredentialsUserPassword(CredentialsType.USER_PASSWORD, str, str2);
    }

    public abstract SyncCredentials createClone();

    public CredentialsType getType() {
        return this.type;
    }

    public long getTypeId() {
        return this.type.f28979id;
    }

    public static SyncCredentials sharedSecret(byte[] bArr) {
        return new SyncCredentialsToken(CredentialsType.SHARED_SECRET_SIPPED, bArr);
    }
}
