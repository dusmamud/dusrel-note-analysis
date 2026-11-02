package io.objectbox.sync;

import io.objectbox.annotation.apihint.Internal;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@Internal
public final class SyncCredentialsToken extends SyncCredentials {
    private volatile boolean cleared;
    private byte[] token;

    public SyncCredentialsToken(SyncCredentials.CredentialsType credentialsType) {
        super(credentialsType);
        this.token = null;
    }

    public void clear() {
        this.cleared = true;
        byte[] bArr = this.token;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
        this.token = null;
    }

    public byte[] getTokenBytes() {
        if (this.cleared) {
            throw new IllegalStateException("Credentials already have been cleared");
        }
        return this.token;
    }

    public boolean hasToken() {
        return this.token != null;
    }

    @Override // io.objectbox.sync.SyncCredentials
    public SyncCredentialsToken createClone() {
        if (this.cleared) {
            throw new IllegalStateException("Cannot clone: credentials already have been cleared");
        }
        if (this.token == null) {
            return new SyncCredentialsToken(getType());
        }
        SyncCredentials.CredentialsType type = getType();
        byte[] bArr = this.token;
        return new SyncCredentialsToken(type, Arrays.copyOf(bArr, bArr.length));
    }

    public SyncCredentialsToken(SyncCredentials.CredentialsType credentialsType, byte[] bArr) {
        this(credentialsType);
        if (bArr != null && bArr.length != 0) {
            this.token = bArr;
            return;
        }
        throw new IllegalArgumentException("Token must not be empty");
    }

    public SyncCredentialsToken(SyncCredentials.CredentialsType credentialsType, String str) {
        this(credentialsType, str.getBytes(StandardCharsets.UTF_8));
    }
}
