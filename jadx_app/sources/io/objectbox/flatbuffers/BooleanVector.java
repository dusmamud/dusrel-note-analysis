package io.objectbox.flatbuffers;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class BooleanVector extends BaseVector {
    public BooleanVector __assign(int i10, ByteBuffer byteBuffer) {
        __reset(i10, 1, byteBuffer);
        return this;
    }

    public boolean get(int i10) {
        return this.f28929bb.get(__element(i10)) != 0;
    }
}
