package io.objectbox.config;

/* JADX INFO: loaded from: classes2.dex */
public final class ValidateOnOpenModeKv {
    public static final short Regular = 1;
    public static final short Unknown = 0;
    public static final String[] names = {"Unknown", "Regular"};

    private ValidateOnOpenModeKv() {
    }

    public static String name(int i10) {
        return names[i10];
    }
}
