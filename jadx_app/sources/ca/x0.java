package ca;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class x0 {
    private static final /* synthetic */ x0[] $VALUES;
    public static final a Companion;
    public static final x0 DISABLED;
    public static final x0 INFORMATIONAL;

    public static final class a {
    }

    static {
        x0 x0Var = new x0("DISABLED", 0);
        DISABLED = x0Var;
        x0 x0Var2 = new x0("INFORMATIONAL", 1);
        INFORMATIONAL = x0Var2;
        $VALUES = new x0[]{x0Var, x0Var2};
        Companion = new a();
    }

    public x0() {
        throw null;
    }

    public static x0 valueOf(String str) {
        return (x0) Enum.valueOf(x0.class, str);
    }

    public static x0[] values() {
        return (x0[]) $VALUES.clone();
    }
}
