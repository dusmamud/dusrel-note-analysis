package io.objectbox.sync;

import io.objectbox.annotation.apihint.Beta;

/* JADX INFO: loaded from: classes2.dex */
@Beta
public class SyncChange {
    final long[] changedIds;
    final int entityTypeId;
    final long[] removedIds;

    public SyncChange(int i10, long[] jArr, long[] jArr2) {
        this.entityTypeId = i10;
        this.changedIds = jArr;
        this.removedIds = jArr2;
    }

    public long[] getChangedIds() {
        return this.changedIds;
    }

    public int getEntityTypeId() {
        return this.entityTypeId;
    }

    public long[] getRemovedIds() {
        return this.removedIds;
    }

    @Deprecated
    public SyncChange(long j10, long[] jArr, long[] jArr2) {
        this.entityTypeId = (int) j10;
        this.changedIds = jArr;
        this.removedIds = jArr2;
    }
}
