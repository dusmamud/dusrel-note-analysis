package io.flutter.util;

/* JADX INFO: loaded from: classes2.dex */
public final class Preconditions {
    private Preconditions() {
    }

    public static <T> T checkNotNull(T t6) {
        t6.getClass();
        return t6;
    }

    public static void checkState(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void checkState(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
