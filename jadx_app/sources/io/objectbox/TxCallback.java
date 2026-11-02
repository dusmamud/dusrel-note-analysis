package io.objectbox;

/* JADX INFO: loaded from: classes2.dex */
public interface TxCallback<T> {
    void txFinished(T t6, Throwable th);
}
