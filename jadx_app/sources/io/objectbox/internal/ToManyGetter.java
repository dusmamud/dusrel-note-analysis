package io.objectbox.internal;

import io.objectbox.annotation.apihint.Internal;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Internal
public interface ToManyGetter<SOURCE, TARGET> extends Serializable {
    List<TARGET> getToMany(SOURCE source);
}
