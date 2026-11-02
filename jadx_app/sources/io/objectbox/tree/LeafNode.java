package io.objectbox.tree;

import io.objectbox.annotation.apihint.Experimental;

/* JADX INFO: loaded from: classes2.dex */
@Experimental
public class LeafNode {
    public final long branchId;
    public double floatingValue;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public final long f28982id;
    public long integerValue;
    public final long metaId;
    public Object objectValue;
    public short valueType;

    public LeafNode(long j10, long j11, long j12, long j13, double d10, Object obj, short s6) {
        this.f28982id = j10;
        this.branchId = j11;
        this.metaId = j12;
        this.integerValue = j13;
        this.floatingValue = d10;
        this.objectValue = obj;
        this.valueType = s6;
    }
}
