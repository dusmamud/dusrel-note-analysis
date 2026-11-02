package androidx.datastore.preferences.protobuf;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public enum u1 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(i.f2055b),
    ENUM(null),
    MESSAGE(null);

    private final Object defaultDefault;

    u1(final Serializable defaultDefault) {
        this.defaultDefault = defaultDefault;
    }
}
