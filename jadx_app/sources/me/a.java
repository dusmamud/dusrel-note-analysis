package me;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends IOException {
    private static final long serialVersionUID = 1;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: me.a$a, reason: collision with other inner class name */
    public static final class EnumC0207a {
        private static final /* synthetic */ EnumC0207a[] $VALUES;
        public static final EnumC0207a CHECKSUM_MISMATCH;
        public static final EnumC0207a FILE_NOT_FOUND;
        public static final EnumC0207a TASK_CANCELLED_EXCEPTION;
        public static final EnumC0207a UNKNOWN;
        public static final EnumC0207a UNKNOWN_COMPRESSION_METHOD;
        public static final EnumC0207a UNSUPPORTED_ENCRYPTION;
        public static final EnumC0207a WRONG_PASSWORD;

        static {
            EnumC0207a enumC0207a = new EnumC0207a("WRONG_PASSWORD", 0);
            WRONG_PASSWORD = enumC0207a;
            EnumC0207a enumC0207a2 = new EnumC0207a("TASK_CANCELLED_EXCEPTION", 1);
            TASK_CANCELLED_EXCEPTION = enumC0207a2;
            EnumC0207a enumC0207a3 = new EnumC0207a("CHECKSUM_MISMATCH", 2);
            CHECKSUM_MISMATCH = enumC0207a3;
            EnumC0207a enumC0207a4 = new EnumC0207a("UNKNOWN_COMPRESSION_METHOD", 3);
            UNKNOWN_COMPRESSION_METHOD = enumC0207a4;
            EnumC0207a enumC0207a5 = new EnumC0207a("FILE_NOT_FOUND", 4);
            FILE_NOT_FOUND = enumC0207a5;
            EnumC0207a enumC0207a6 = new EnumC0207a("UNSUPPORTED_ENCRYPTION", 5);
            UNSUPPORTED_ENCRYPTION = enumC0207a6;
            EnumC0207a enumC0207a7 = new EnumC0207a("UNKNOWN", 6);
            UNKNOWN = enumC0207a7;
            $VALUES = new EnumC0207a[]{enumC0207a, enumC0207a2, enumC0207a3, enumC0207a4, enumC0207a5, enumC0207a6, enumC0207a7};
        }

        public EnumC0207a() {
            throw null;
        }

        public static EnumC0207a valueOf(String str) {
            return (EnumC0207a) Enum.valueOf(EnumC0207a.class, str);
        }

        public static EnumC0207a[] values() {
            return (EnumC0207a[]) $VALUES.clone();
        }
    }

    public a(String str) {
        super(str);
    }
}
