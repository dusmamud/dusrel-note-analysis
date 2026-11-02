package io.objectbox.sync;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ConnectivityMonitor {
    private SyncClient syncClient;

    public final void notifyConnectionAvailable() {
        SyncClient syncClient = this.syncClient;
        if (syncClient != null) {
            syncClient.notifyConnectionAvailable();
        }
    }

    public void onObserverRemoved() {
    }

    public void onObserverSet() {
    }

    public void removeObserver() {
        this.syncClient = null;
        onObserverRemoved();
    }

    public void setObserver(SyncClient syncClient) {
        if (syncClient == null) {
            throw new IllegalArgumentException("Sync client must not be null");
        }
        this.syncClient = syncClient;
        onObserverSet();
    }
}
