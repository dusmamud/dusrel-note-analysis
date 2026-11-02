package com.google.firebase.components;

import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes2.dex */
public final class Preconditions {
    public static void checkArgument(boolean z10, String str) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T t6) {
        t6.getClass();
        return t6;
    }

    public static void checkState(boolean z10, String str) {
        if (!z10) {
            throw new IllegalStateException(str);
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T t6, String str) {
        if (t6 != null) {
            return t6;
        }
        throw new NullPointerException(str);
    }
}
