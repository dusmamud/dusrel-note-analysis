package io.objectbox.flatbuffers;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class Struct {

    /* JADX INFO: renamed from: bb, reason: collision with root package name */
    protected ByteBuffer f28934bb;
    protected int bb_pos;

    public void __reset(int i10, ByteBuffer byteBuffer) {
        this.f28934bb = byteBuffer;
        if (byteBuffer != null) {
            this.bb_pos = i10;
        } else {
            this.bb_pos = 0;
        }
    }

    public void __reset() {
        __reset(0, null);
    }
}
