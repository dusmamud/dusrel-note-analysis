package io.objectbox.exception;

import io.objectbox.annotation.apihint.Experimental;

/* JADX INFO: loaded from: classes2.dex */
public interface DbExceptionListener {
    @Experimental
    static void cancelCurrentException() {
        DbExceptionListenerJni.nativeCancelCurrentException();
    }

    void onDbException(Exception exc);
}
