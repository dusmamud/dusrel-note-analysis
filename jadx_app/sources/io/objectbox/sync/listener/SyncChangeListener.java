package io.objectbox.sync.listener;

import io.objectbox.annotation.apihint.Experimental;
import io.objectbox.sync.SyncChange;

/* JADX INFO: loaded from: classes2.dex */
@Experimental
public interface SyncChangeListener {
    void onSyncChanges(SyncChange[] syncChangeArr);
}
