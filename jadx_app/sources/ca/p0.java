package ca;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class p0 {
    private static final /* synthetic */ p0[] $VALUES;
    public static final a Companion;
    private static final p0 DEFAULT;
    public static final p0 LOAD_SHEDDER;
    public static final p0 MAIN;
    public static final p0 OFFLINE_ENTITLEMENTS;

    public static final class a {
    }

    static {
        p0 p0Var = new p0("MAIN", 0);
        MAIN = p0Var;
        p0 p0Var2 = new p0("LOAD_SHEDDER", 1);
        LOAD_SHEDDER = p0Var2;
        p0 p0Var3 = new p0("OFFLINE_ENTITLEMENTS", 2);
        OFFLINE_ENTITLEMENTS = p0Var3;
        $VALUES = new p0[]{p0Var, p0Var2, p0Var3};
        Companion = new a();
        DEFAULT = p0Var;
    }

    public p0() {
        throw null;
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) $VALUES.clone();
    }
}
