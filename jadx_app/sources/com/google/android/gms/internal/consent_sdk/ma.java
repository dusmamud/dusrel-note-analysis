package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes.dex */
public enum ma {
    VOID(Void.class),
    INT(Integer.class),
    LONG(Long.class),
    FLOAT(Float.class),
    DOUBLE(Double.class),
    BOOLEAN(Boolean.class),
    STRING(String.class),
    BYTE_STRING(o9.class),
    ENUM(Integer.class),
    MESSAGE(Object.class);

    private final Class zzl;

    static {
        n9 n9Var = o9.f20900b;
    }

    ma(Class cls) {
        this.zzl = cls;
    }
}
