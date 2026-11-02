package fe;

import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public interface a0<T> extends KSerializer<T> {
    KSerializer<?>[] childSerializers();

    KSerializer<?>[] typeParametersSerializers();
}
