package io.objectbox.exception;

/* JADX INFO: loaded from: classes2.dex */
class DbExceptionListenerJni {
    public static native void nativeCancelCurrentException();

    public static native void nativeThrowException(long j10, int i10);
}
