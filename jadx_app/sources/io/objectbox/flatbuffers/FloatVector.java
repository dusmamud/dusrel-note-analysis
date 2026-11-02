package io.objectbox.flatbuffers;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class FloatVector extends BaseVector {
    public FloatVector __assign(int i10, ByteBuffer byteBuffer) {
        __reset(i10, 4, byteBuffer);
        return this;
    }

    public float get(int i10) {
        return this.f28929bb.getFloat(__element(i10));
    }
}
