package io.objectbox.reactive;

import io.objectbox.annotation.apihint.Internal;

/* JADX INFO: loaded from: classes2.dex */
@Internal
public interface DelegatingObserver<T> {
    DataObserver<T> getObserverDelegate();
}
