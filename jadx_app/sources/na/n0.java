package na;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class n0 {
    private static final /* synthetic */ n0[] $VALUES;
    public static final n0 FALLBACK;
    public static final n0 LOAD_SHEDDER;
    public static final n0 MAIN;

    static {
        n0 n0Var = new n0("MAIN", 0);
        MAIN = n0Var;
        n0 n0Var2 = new n0("LOAD_SHEDDER", 1);
        LOAD_SHEDDER = n0Var2;
        n0 n0Var3 = new n0("FALLBACK", 2);
        FALLBACK = n0Var3;
        $VALUES = new n0[]{n0Var, n0Var2, n0Var3};
    }

    public n0() {
        throw null;
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) $VALUES.clone();
    }
}
