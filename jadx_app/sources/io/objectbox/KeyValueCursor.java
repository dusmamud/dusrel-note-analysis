package io.objectbox;

import java.io.Closeable;

/* JADX INFO: loaded from: classes2.dex */
public class KeyValueCursor implements Closeable {
    private static final int PUT_FLAG_COMPLETE = 2;
    private static final int PUT_FLAG_FIRST = 1;
    private static final int PUT_FLAG_INSERT_NEW = 4;
    private final long cursor;

    public KeyValueCursor(long j10) {
        this.cursor = j10;
    }

    public static native void nativeDestroy(long j10);

    public static native byte[] nativeGetCurrent(long j10);

    public static native byte[] nativeGetEqualOrGreater(long j10, long j11);

    public static native byte[] nativeGetFirst(long j10);

    public static native long nativeGetKey(long j10);

    public static native void nativeGetKey(long j10, long j11);

    public static native byte[] nativeGetLast(long j10);

    public static native byte[] nativeGetLongKey(long j10, long j11);

    public static native byte[] nativeGetNext(long j10);

    public static native byte[] nativeGetPrev(long j10);

    public static native void nativePutLongKey(long j10, long j11, byte[] bArr);

    public static native boolean nativeRemoveAt(long j10, long j11);

    public static native boolean nativeSeek(long j10, long j11);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        nativeDestroy(this.cursor);
    }

    public byte[] get(long j10) {
        return nativeGetLongKey(this.cursor, j10);
    }

    public byte[] getCurrent() {
        return nativeGetCurrent(this.cursor);
    }

    public byte[] getEqualOrGreater(long j10) {
        return nativeGetEqualOrGreater(this.cursor, j10);
    }

    public byte[] getFirst() {
        return nativeGetFirst(this.cursor);
    }

    public long getKey() {
        return nativeGetKey(this.cursor);
    }

    public byte[] getLast() {
        return nativeGetLast(this.cursor);
    }

    public byte[] getNext() {
        return nativeGetNext(this.cursor);
    }

    public byte[] getPrev() {
        return nativeGetPrev(this.cursor);
    }

    public void put(long j10, byte[] bArr) {
        nativePutLongKey(this.cursor, j10, bArr);
    }

    public boolean removeAt(long j10) {
        return nativeRemoveAt(this.cursor, j10);
    }

    public boolean seek(long j10) {
        return nativeSeek(this.cursor, j10);
    }
}
