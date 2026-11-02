package io.objectbox.sync;

import io.objectbox.annotation.apihint.Internal;

/* JADX INFO: loaded from: classes2.dex */
@Internal
public final class SyncCredentialsUserPassword extends SyncCredentials {
    private final String password;
    private final String username;

    public SyncCredentialsUserPassword(SyncCredentials.CredentialsType credentialsType, String str, String str2) {
        super(credentialsType);
        this.username = str;
        this.password = str2;
    }

    @Override // io.objectbox.sync.SyncCredentials
    public SyncCredentials createClone() {
        return new SyncCredentialsUserPassword(getType(), this.username, this.password);
    }

    public String getPassword() {
        return this.password;
    }

    public String getUsername() {
        return this.username;
    }
}
