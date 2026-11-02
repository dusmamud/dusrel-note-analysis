package io.objectbox.sync.server;

import io.objectbox.annotation.apihint.Internal;
import io.objectbox.sync.SyncCredentialsToken;

/* JADX INFO: loaded from: classes2.dex */
@Internal
final class ClusterPeerInfo {
    SyncCredentialsToken credentials;
    String url;

    public ClusterPeerInfo(String str, SyncCredentialsToken syncCredentialsToken) {
        this.url = str;
        this.credentials = syncCredentialsToken;
    }
}
