package io.objectbox.reactive;

import io.objectbox.annotation.apihint.Internal;

/* JADX INFO: loaded from: classes2.dex */
@Internal
public interface DataPublisher<T> {
    void publishSingle(DataObserver<T> dataObserver, Object obj);

    void subscribe(DataObserver<T> dataObserver, Object obj);

    void unsubscribe(DataObserver<T> dataObserver, Object obj);
}
