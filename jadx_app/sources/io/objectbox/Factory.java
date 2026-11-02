package io.objectbox;

import io.objectbox.annotation.apihint.Experimental;

/* JADX INFO: loaded from: classes2.dex */
@Experimental
public interface Factory<T> {
    T provide() throws Exception;
}
