package ca;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class a9 {
    private static final /* synthetic */ a9[] $VALUES;
    public static final a9 FAILED;
    public static final a9 NOT_REQUESTED;
    public static final a9 VERIFIED;
    public static final a9 VERIFIED_ON_DEVICE;

    static {
        a9 a9Var = new a9("NOT_REQUESTED", 0);
        NOT_REQUESTED = a9Var;
        a9 a9Var2 = new a9("VERIFIED", 1);
        VERIFIED = a9Var2;
        a9 a9Var3 = new a9("FAILED", 2);
        FAILED = a9Var3;
        a9 a9Var4 = new a9("VERIFIED_ON_DEVICE", 3);
        VERIFIED_ON_DEVICE = a9Var4;
        $VALUES = new a9[]{a9Var, a9Var2, a9Var3, a9Var4};
    }

    public a9() {
        throw null;
    }

    public static a9 valueOf(String str) {
        return (a9) Enum.valueOf(a9.class, str);
    }

    public static a9[] values() {
        return (a9[]) $VALUES.clone();
    }
}
